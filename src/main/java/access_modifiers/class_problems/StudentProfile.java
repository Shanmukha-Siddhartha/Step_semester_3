package access_modifiers.class_problems;

public class StudentProfile {

    private String name;
    private int age;

    public StudentProfile(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        StudentProfile student =
                new StudentProfile("Ravi", 20);

        student.display();

        student.setAge(21);

        System.out.println("Updated age: " + student.getAge());
    }
}