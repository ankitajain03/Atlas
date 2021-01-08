package com.company;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class StateUtil {
    static Scanner sc = new Scanner(System.in);
    static HashSet<IndianState> states = new HashSet<>();

    public static void addStateRecord() {
        System.out.println("Please enter the name of state : ");
        String name = sc.next();
        System.out.println("Please enter the capital of state : ");
        String capital = sc.next();
        System.out.println("Please enter the area of state : ");
        Double area = sc.nextDouble();
        System.out.println("Please enter the population of state : ");
        Long population = sc.nextLong();
        IndianState state = new IndianState(name.toUpperCase(), capital.toUpperCase(), population, area);
        if (states.contains(state)) {
            System.out.println("State already exists!");
        } else {
            states.add(state);
        }
    }

    public static void displayTheDataOfState() {
        for (IndianState state : states) {
            displaySingleStateData(state);

        }

    }

    private static void displaySingleStateData(IndianState state) {
        System.out.println("Name : " + state.getName() + " Capital : " + state.getCapital() + " Population : " + state.getPopulation() + " area : " + state.getArea());
        System.out.println("Language : " + state.getLanguages());
    }


    public static void addLanguages() {
        System.out.println("please enter the name of state : ");
        String name = sc.next();
        boolean found = false;
        for (IndianState state : states) {
            if (state.getName().equalsIgnoreCase(name)) {
                System.out.println("please enter the language");
                String language = sc.next();
                state.getLanguages().add(language.toUpperCase());
                found = true;
            }
        }
        if (!found) {
            System.out.println("state doesn't exist , please enter the states first!");
        }
    }

    public static void addMultipleLanguages() {
        System.out.println("Add number of languages : ");
        int numberOfLanguages = sc.nextInt();
        for (int i = 0; i < numberOfLanguages; i++) {
            StateUtil.addLanguages();
        }
    }

    public static void findAStateForAParticularLanguage() {
        System.out.println("Please enter the language");
        String language = sc.next();
        for (IndianState state : states) {
            if (state.getLanguages().contains(language.toUpperCase())) {
                displaySingleStateData(state);
            }
        }
    }

    public static void sortAccordingToPopulation() {
        states.stream().sorted(Comparator.comparingLong(IndianState::getPopulation)).forEach(StateUtil::displaySingleStateData);
    }
    public static void sortAccordingToArea() {
        states.stream().sorted(Comparator.comparingDouble(IndianState::getArea)).forEach(StateUtil::displaySingleStateData);
    }
}


