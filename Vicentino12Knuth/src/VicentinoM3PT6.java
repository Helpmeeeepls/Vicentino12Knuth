class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }
}

public class VicentinoM3PT6 {
    public static void main(String[] args) {
        Person person1 = new Person("Muj", 18, "Davao City");
        Person person2 = new Person("Enzo", 18, "Davao City");

        System.out.println("Details of Person 1:");
        person1.displayDetails();

        System.out.println("\nDetails of Person 2:");
        person2.displayDetails();
    }
}
