//Author: Jade Anderson-Sterling
//10-10-2024
//This is my Bird class
//This class has my main method and prints out all of my information in a uniform way.
package Excersise3;

import Excersise2.Flight;

public class ThingsThatMove {
        public static void main(String[] args) {
            Movement[] movingThings = new Movement[3];

            movingThings[0] = new Airplane("Boeing 747", 2016);
            movingThings[1] = new Excersise3.Bird("Eagle");
            movingThings[2] = new Bird("Hummingbird");

            for (Movement thing : movingThings) {
                System.out.println(thing.toString());
                thing.fly();
                thing.walk();
                thing.jump();
            }
        }

}
