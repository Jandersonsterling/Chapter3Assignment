//Author: Jade Anderson-Sterling
//10-9-2024
//This is my Bird class
//This class has my main method and prints out all of my information in a uniform way.
package Excersise2;

public class ThingsThatFly {
    public static void main(String[] args) {
        Flight[] flying = new Flight[3];

        flying[0] = new Airplane("Boeing 747", 2016);
        flying[1] = new Bird("Eagle");
        flying[2] = new Bird("Hummingbird");

        for (Flight thing : flying) {
            System.out.println(thing.toString());
            thing.fly();
        }
    }

}
