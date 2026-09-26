package abstraction_interfaces.practice_problems.problem3;

public class MusicRoom {

    public static String playAll(Instrument[] instruments) {

        StringBuilder result = new StringBuilder();

        for (Instrument instrument : instruments) {
            result.append(instrument.play()).append(" | ");
        }

        return result.toString();
    }
}
