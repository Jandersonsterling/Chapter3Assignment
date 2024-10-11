//Author: Jade Anderson-Sterling
//10-9-2024
//This is my Bird class
//I added a constructor,getter and setter, as well as a tostring to override what will originally print out.
//This class also includes the fly method implemented from the flight class.
package Excersise3;

import Excersise2.Flight;

public class Bird implements Movement {
    private String type;

    public Bird(String type) {

        this.type = type;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }

    public void fly() {

        System.out.println("I'm a bird who flaps my wings to fly.");
    }
    public void walk() {
        System.out.println("I walk on my feet.");
    }

    public void jump() {
        System.out.println("I jump by leaping from my feet.");
    }

    public String toString() {

        return "Bird [type=" + type + "]";
    }
}
