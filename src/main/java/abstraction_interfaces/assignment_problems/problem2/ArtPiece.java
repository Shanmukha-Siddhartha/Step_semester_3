package abstraction_interfaces.assignment_problems.problem2;

public abstract class ArtPiece {

    private static int counter = 0;
    private final String pieceId;

    public ArtPiece() {
        counter++;
        pieceId = "ART-" + (1000 + counter);
    }

    public String getPieceId() {
        return pieceId;
    }

    public abstract String describe();
}