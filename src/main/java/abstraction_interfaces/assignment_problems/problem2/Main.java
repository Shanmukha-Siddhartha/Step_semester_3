package abstraction_interfaces.assignment_problems.problem2;

public class Main {

    public static void main(String[] args) {

        ArtPiece[] pieces = {
                new Painting("Ravi"),
                new Sculpture("Marble")
        };

        System.out.println(Gallery.describeAll(pieces));
    }
}