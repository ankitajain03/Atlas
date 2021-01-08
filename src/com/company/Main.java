package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int isResumed = 1;
        while (isResumed==1) {
            System.out.println("please choose one of the option");
            System.out.println("1. Add state. ");
            System.out.println("2. display the data of state.");
            System.out.println("3. Add Languages.");
            System.out.println("4. Add multiple languages.");
            System.out.println("5. Find the states for a particular language.");
            System.out.println("6. Sort according to population.");
            System.out.println("7. Sort according to area.");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    StateUtil.addStateRecord();
                    break;
                case 2:
                    StateUtil.displayTheDataOfState();
                    break;
                case 3:
                    StateUtil.addLanguages();
                    break;
                case 4:
                    StateUtil.addMultipleLanguages();
                    break;
                case 5:
                    StateUtil.findAStateForAParticularLanguage();
                    break;
                case 6:
                    StateUtil.sortAccordingToPopulation();
                    break;
                case 7:
                    StateUtil.sortAccordingToArea();
                    break;
                default:
                    break;
            }
            System.out.println("enter 1 to continue");
            isResumed = sc.nextInt();
        }
    }
}
