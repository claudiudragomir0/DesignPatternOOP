package clean_code;

public class CleanCode {
    public static void main(String[] args) {
        CleanCode cleanCode = new CleanCode();
        //cleanCode.printPersonDetails("Alex", "Mamo", "am", 20, 1.90);
        //How to print person details?
        Person alex = new Person("Alex", "Mamo", "am", 20, 1.90);
        //cleanCode.printPersonDetails(alex);
        cleanCode.printPersonFirstName(alex);
        cleanCode.printPersonFirstName(alex.firstName);

    }

    private void printPersonDetails(String firstName, String lastName, String nickname, int age, double height) {
        System.out.println(firstName);
        //System.out.println(firstName + " " + lastName); //Add next year
    }

    private void printPersonDetails(Person person) {
        System.out.println(person.firstName);
        //System.out.println(person.firstName + ", " + person.lastName); //Add next year
    }

    private void printPersonFirstName(Person person) {
        System.out.println(person.firstName);
    }

    private void printPersonFirstName(String firstName) {
        System.out.println(firstName);
    }
}

class Person {
    public String firstName;
    public String lastName;
    public String nickname;
    public int age;
    public double height;

    public Person(String firstName, String lastName, String nickname, int age, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.age = age;
        this.height = height;
    }
}