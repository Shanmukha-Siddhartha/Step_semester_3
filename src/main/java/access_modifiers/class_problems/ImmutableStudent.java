package access_modifiers.class_problems;

public final class ImmutableStudent {

    private final String name;
    private final int rollNumber;

    public ImmutableStudent(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void display() {
        System.out.println(
                "Name: " + name +
                        " | Roll No: " + rollNumber
        );
    }

    public static void main(String[] args) {

        ImmutableStudent student =
                new ImmutableStudent("Karthik", 101);

        student.display();
    }
}