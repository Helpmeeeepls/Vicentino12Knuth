 
public class StudentManagementSystem {
    String name;
    int age;
    double grade;
 
    public StudentManagementSystem(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
 
    void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
 
    void setGrade(int newGrade) {
        this.grade = newGrade;
        System.out.println("Updating grade (int)... New Grade: " + grade);
    }
 
    void setGrade(double newGrade) {
        this.grade = newGrade;
        System.out.println("Updating grade (double)... New Grade: " + grade);
    }
}
 

class StudentManagementSystemTest {
    public static void main(String[] args) {
        StudentManagementSystem student1 = new StudentManagementSystem("Muj", 18, 90.0);
 
        student1.displayStudent();
 
        student1.setGrade(95);
        student1.setGrade(95.5);
 
        student1.displayStudent();
    }
}
