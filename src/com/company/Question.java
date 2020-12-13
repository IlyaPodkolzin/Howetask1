package com.company;

public class Question {
    private String question;
    private Answer[] answers;
    public static int question_number = 1;

    public Question(String question, Answer[] answers) {
        this.question = question;
        this.answers = answers;
    }

    public void print_question() {
        System.out.println("Вопрос №" + question_number + ":");
        System.out.println(question);
        for (int i = 0; i < answers.length; i++) {
            answers[i].print_answer();
            if (i != answers.length - 1) {
                System.out.print(" ");
            }
            else {
                System.out.println();
            }
        }
        question_number++;
    }

    public static void print_result(boolean flag, User user) {
        if (flag) {
            System.out.println("Верный ответ!");
            user.increase_score();
        }
        else {
            System.out.println("Неверный ответ!");
        }
        System.out.println();
    }

    public void check_answers(String answer) throws AnswerException {
        boolean res = false;
        for (Answer a: answers) {
            if (a.check_answer(answer)) {
                res = true;
                break;
            }
        }
        if (!res) {
            throw new AnswerException();
        }
    }
}
