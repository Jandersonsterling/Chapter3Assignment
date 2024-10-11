//Author: Jade Anderson-Sterling
//10-8-2024
//This is my FarmAnimal class which is mu SUPER class.
//I added a constructor,getter and setter, as well as a tostring to override what will originally print out.
package Excersise1;

public abstract class FarmAnimal {
    private String name;
    private String gender;
    private double weight;
    private int age;

    public FarmAnimal(String name, String gender, double weight, int age){
        this.name = name;
        this.gender = gender;
        this.weight=weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String toString(){
        return String.format("[%s, gender=%s, weight=%.1f, age=%d]", name, gender, weight, age);
    }
    public abstract String feedLoadingSchedule();
}

