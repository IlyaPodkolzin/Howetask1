package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws AnswerException {
        Scanner scanner = new Scanner(System.in);

        User new_player = new User();

        Question question1 = new Question("Как называается столица России?",
                                            new Answer[] {new Answer("Москва"), new Answer("Магадан"),
                                                            new Answer("Южно-Сахалинск")});

        Question question2 = new Question("Какой по размеру Хабаровск?",
                                            new Answer[] {new Answer("Большой"), new Answer("Средний"),
                                                            new Answer("Малый")});

        Question question3 = new Question("Сколько лет Калининграду?",
                                            new Answer[] {new Answer("1564"), new Answer("544"), new Answer("765")});

        Country Russia = new Country("Москва");
        City Khabarovsk = new City("Средний", "162");
        City Kaliningrad = new City("Малый", "765");

        question1.print_question();
        String answer1 = scanner.nextLine();
        try {
            question1.check_answers(answer1);
            boolean result1 = Russia.check_capital(answer1);
            Question.print_result(result1, new_player);
        }
        catch (AnswerException a) {
            System.out.println(a.getMessage());
            System.out.println();
        }


        question2.print_question();
        String answer2 = scanner.nextLine();
        try {
            question2.check_answers(answer2);
            boolean result2 = Khabarovsk.check_size(answer2);
            Question.print_result(result2, new_player);
        }
        catch (AnswerException a) {
            System.out.println(a.getMessage());
            System.out.println();
        }

        question3.print_question();
        String answer3 = scanner.nextLine();
        try {
            question3.check_answers(answer3);
            boolean result3 = Kaliningrad.check_age(answer3);
            Question.print_result(result3, new_player);
        }
        catch (AnswerException a) {
            System.out.println(a.getMessage());
            System.out.println();
        }

        new_player.show_info();
    }
}
