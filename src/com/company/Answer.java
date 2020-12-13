package com.company;

public class Answer {
    private String answer;

    public Answer(String answer) {
        this.answer = answer;
    }

    public void print_answer() {
        System.out.print(answer);
    }

    public boolean check_answer(String answer) {
        return this.answer.equals(answer);
    }
}
