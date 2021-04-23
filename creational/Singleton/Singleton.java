package creational.Singleton;

/*Singleton pattern is one of the simplest design patterns in Java.
This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
This pattern involves a single class which is responsible to create an object while making sure that only single object gets created.
This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.*/
public class Singleton {
    public static void main(String[] args) {
        Animal alfa = Animal.getInstance();
        String myAnimal = alfa.getAnimalType("Pig");
        System.out.println(myAnimal);
        Animal alfa1 = Animal.getInstance();
        String myAnimal1 = alfa1.setAnimalType("Fish");
        System.out.println(myAnimal1);
        System.out.println(alfa + " " + alfa1);
        System.out.println(myAnimal);
    }
}

class Animal {
    private static Animal instance;

    private Animal() {
        //make the constructor private so that this class cannot be
        //instantiated
        System.out.println("Animal class private constructor");
    }

    public synchronized static Animal getInstance() {
        //Get the only object available
        if (instance == null) {
            instance = new Animal();
        }
        return instance;
    }

    String setAnimalType(String type) {
        return type;
    }

    String getAnimalType(String type) {
        return type;
    }
}