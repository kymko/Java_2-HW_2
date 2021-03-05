package com.company;

public class Russia extends Country implements Printable {

    private String currency;

    public Russia(String continent, int population, String nameOfCountry, String currency) {

        super(continent, population, nameOfCountry);
        this.currency = currency;
    }

    public String getCurrency() {

        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public void print() {
        System.out.println("The name of the country:" + getNameOfCountry() + "\nContinent:" + getContinent() + "\nPopulation:" + getPopulation() + " million people " +
                "\nNational currency:" + getCurrency());
    }

    @Override
    public void nationalFlag() {
        System.out.println("\uD83C\uDDF7\uD83C\uDDFA");
    }
}
