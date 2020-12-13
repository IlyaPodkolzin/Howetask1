package com.company;

public class Country {
    private String capital;

    public Country(String capital) {
        this.capital = capital;
    }

    public boolean check_capital(String capital) {
        return this.capital.equals(capital);
    }
}
