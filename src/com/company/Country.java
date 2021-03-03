package com.company;

public class Country {

    private String continent;
    private int population;
    private String nameOfCountry;

    public Country(String continent, int population, String nameOfCountry){
        this.continent = continent;
        this.population = population;
        this.nameOfCountry = nameOfCountry;
    }

    public String getContinent(){
        return continent;
    }

    public int getPopulation(){
        return population;
    }

    public String getNameOfCountry(){
        return nameOfCountry;
    }

    public void setContinent(String continent){
        this.continent = continent;
    }

    public void setPopulation(int population){
        this.population = population;
    }

    public void setNameOfCountry(String nameOfCountry){
        this.nameOfCountry = nameOfCountry;
    }


}
