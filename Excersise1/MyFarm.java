//Author: Jade Anderson-Sterling
//10-8-2024
//This is my "MyFarm" class which is the class that i used to add values into my constructors.
//I add each of these values into my array list.
package Excersise1;

import java.util.ArrayList;

public class MyFarm {
    public static void main(String[] args) {
        ArrayList<FarmAnimal> animals = new ArrayList<>();

        // Adding animals to the ArrayList
        animals.add(new Duck("Donald", "male", 3.2, 5));
        animals.add(new Duck("Cheese", "female", 3.6, 5));
        animals.add(new Cow("Molly", "female", 1600.0, 3));
        animals.add(new Chicken("Albert", "male", 1.6, 2));
        animals.add(new Chicken("Amelia", "female", 1.8, 4));
        animals.add(new Chicken("Dixie", "female", 1.7, 4));

        for (FarmAnimal animal : animals) {
            System.out.println(animal);
        }

        for (FarmAnimal animal : animals) {
            System.out.println(animal.feedLoadingSchedule());
        }
    }
}
