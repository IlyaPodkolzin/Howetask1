package com.company;

import java.util.Scanner;

public class User {
    private String name;
    private int score = 0;

    public User() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Здравствуйте, Игрок! Введите своё имя:");
        this.name = scan.nextLine();
        this.score = 0;
        System.out.println();
    }

    public void increase_score() {
        score++;
    }

    public void show_info() {
        System.out.println("Пришло время результатов!");
        System.out.println("Информация об игроке:");
        System.out.println("Имя: " + name);
        System.out.println("Очки: " + score + "/3");
        System.out.println("Спасибо за прохождение мини-опроса!");
    }
}
