//Author: Jade Anderson-Sterling
//10-8-2024
//This is my Duck class that extends from the farmanimal class.
//I added a constructor,getter and setter, as well as a tostring to override what will originally print out.
package Excersise1;

public class Duck extends FarmAnimal {
    private String animalsound;

    public Duck(String name, String gender, double weight, int age) {
        super(name, gender, weight, age);
        this.animalsound = "Quack Quack";
    }

    public String getAnimalsound() {
        return animalsound;
    }

    public void setAnimalsound(String animalsound) {
        this.animalsound = animalsound;
    }
    public String feedLoadingSchedule() {
        return getName() + ": 8am-12pm-6pm";
    }
}

