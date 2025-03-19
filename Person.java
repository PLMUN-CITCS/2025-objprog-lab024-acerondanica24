
class Person {
    String name;  
    int age;      

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Method to display person's details
    public void displayPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Main class to execute the program
public class PersonDemo {
    public static void main(String[] args) {
        // Creating a Person object using the parameterized constructor
        Person person1 = new Person("Bob", 30);

        // Creating a Person object using the default constructor
        Person person2 = new Person();

        // Displaying the details of both persons
        person1.display
