package abstraction_interfaces.assignment_problems.problem2;

public class Sculpture extends ArtPiece {

    private String material;

    public Sculpture(String material) {
        super();
        this.material = material;
    }

    @Override
    public String describe() {
        return "Sculpture made of " + material;
    }
}