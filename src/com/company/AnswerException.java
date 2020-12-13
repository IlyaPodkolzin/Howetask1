package com.company;

public class AnswerException extends Exception {
    public AnswerException(){
        super("Пожалуйста, в следующий раз вводите один из данных вариантов ответа!");
    }
}
