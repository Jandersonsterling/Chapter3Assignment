//Author: Jade Anderson-Sterling
//10-8-2024
//This is my Airplane class
//I added a constructor,getter and setter, as well as a tostring to override what will originally print out.
//This class also includes the fly method implemented from the flight class.
package Excersise3;

import Excersise2.Flight;

public class Airplane implements Movement {
    private String model;
    private int yearBuilt;

    public Airplane(String model, int yearBuilt) {
        this.model = model;
        this.yearBuilt = yearBuilt;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }
    public void fly() {

        System.out.println("I'm an airplane that relies on an engine to fly.");
    }
    public void walk() {
        System.out.println("I taxi on my wheels.");
    }
    public void jump() {
        System.out.println("I cannot jump.");
    }
    public String toString() {

        return "Airplane [model=" + model + ", year=" + yearBuilt + "]";
    }
}

