/**
 * Author: flex
 * Date: 03/10/2023
 */
public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        // Dynamically allocate memory for the name
        this.name = new String(name);
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for name
    public void setName(String name) {
        // Release existing memory before assigning new memory
        this.name = new String(name);
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Display information about the person
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating objects dynamically
        Person person1 = new Person("John Doe", 25);
        Person person2 = new Person("Jane Doe", 30);

        // Displaying information
        person1.display();
        person2.display();

        // Modifying information
        person1.setName("John Smith");
        person1.setAge(28);

        // Displaying modified information
        person1.display();
    }
}

