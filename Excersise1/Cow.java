//Author: Jade Anderson-Sterling
//10-8-2024
//This is my cow class that extends from the farmanimal class.
//I added a constructor,getter and setter, as well as a tostring to override what will originally print out.
package Excersise1;

public class Cow extends FarmAnimal {
    private String animalSound;

    public Cow(String name, String gender, double weight, int age) {
        super(name, gender, weight, age);
        this.animalSound = "Moo Moo";
    }

    public String getAnimalSound() {
        return animalSound;
    }

    public void setAnimalSound(String animalSound) {
        this.animalSound = animalSound;
    }

    public String toString() {
        return animalSound + " " + super.toString();
    }

    public String feedLoadingSchedule() {
        return getName() + ": 6am-4pm";
    }
}
