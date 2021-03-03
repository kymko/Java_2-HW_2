package com.company;

public class Kazakhstan extends Country implements Printable{

    private String capital;

    public Kazakhstan(String continent, int population, String nameOfCountry, String capital) {
        super(continent, population, nameOfCountry);
        this.capital = capital;
    }

    public String getCapital(){
        return capital;
    }

    public void setCapital(String capital){
        this.capital = capital;
    }

    @Override
    public void print() {
        System.out.println("The name of the country:" + getNameOfCountry() + "\nContinent:" + getContinent() + "\nPopulation:" + getPopulation() + " million people "+
                 "\nThe capital of Kazakhstan:" + getCapital());
    }
}
