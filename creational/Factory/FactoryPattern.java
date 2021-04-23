package creational.Factory;

interface Dog {
    void speak();
}

public class FactoryPattern {
    public static void main(String[] args) {
        Dog dog = DogFactory.getDog("small");
        dog.speak();
//        if (dog != null) {
//            dog.speak();
//        } else {
//            System.out.println("dog object is null!");
//        }
        dog = DogFactory.getDog("big");
        //dog.speak();
        dog = DogFactory.getDog("working");
        //dog.speak();
    }
}

class Poodle implements Dog {
    @Override
    public void speak() {
        System.out.println("The Poodle says hi!");
    }
}

class Rottweiler implements Dog {
    @Override
    public void speak() {
        System.out.println("The Rottweiler says hey!");
    }
}

class SiberianHusky implements Dog {
    @Override
    public void speak() {
        System.out.println("The SiberianHusky says hey ya!");
    }
}

class DogFactory {
    public static Dog getDog(String criteria) {
        switch (criteria) {
            case "small":
                return new Poodle(); //Dog dog = new Poodle();
            case "big":
                return new Rottweiler();
            case "working":
                return new SiberianHusky();
        }
        return null;
    }
}

