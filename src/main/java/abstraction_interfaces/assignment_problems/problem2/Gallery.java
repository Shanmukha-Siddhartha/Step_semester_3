package abstraction_interfaces.assignment_problems.problem2;

public class Gallery {

    public static String describeAll(ArtPiece[] pieces) {
        StringBuilder result = new StringBuilder();

        for (ArtPiece piece : pieces) {
            result.append(piece.getPieceId())
                    .append(": ")
                    .append(piece.describe())
                    .append(" | ");
        }

        return result.toString();
    }
}