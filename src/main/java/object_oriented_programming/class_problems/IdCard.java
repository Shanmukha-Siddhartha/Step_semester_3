package object_oriented_programming.class_problems;

public class IdCard {
    String name;
    int booksIssued;

    IdCard(String name, int booksIssued) {
        this.name = name;
        this.booksIssued = booksIssued;
    }

    public static void main(String[] args) {
        IdCard ravi = new IdCard("Ravi", 2);

        IdCard duplicate = ravi;
        duplicate.booksIssued = 5;

        System.out.println("Books issued by Ravi: " + ravi.booksIssued);
        System.out.println("duplicate == ravi: " + (duplicate == ravi));

        IdCard separate = new IdCard("Ravi", 5);

        System.out.println("separate == ravi: " + (separate == ravi));
    }
}