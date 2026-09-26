package abstraction_interfaces.assignment_problems.problem2;

public class Painting extends ArtPiece {

    private String artist;

    public Painting(String artist) {
        super();
        this.artist = artist;
    }

    @Override
    public String describe() {
        return "Painting by " + artist;
    }
}