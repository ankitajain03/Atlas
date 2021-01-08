package com.company;

import java.util.HashSet;
import java.util.Objects;

public class IndianState {

    private String name;
    private String capital;
    private Long population;
    private double area;
    private HashSet<String> languages = new HashSet<>();


    public HashSet<String> getLanguages() {
        return languages;
    }

    public void setLanguages(HashSet<String> languages) {
        this.languages = languages;
    }


    //constructor
    public IndianState(String name, String capital, Long population, double area) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IndianState state = (IndianState) o;
        return Objects.equals(name, state.name) &&
                Objects.equals(capital, state.capital);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capital);
    }
}
