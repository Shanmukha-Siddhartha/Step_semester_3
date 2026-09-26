package abstraction_interfaces.practice_problems.problem3;

public class Main {

    public static void main(String[] args) {

        Instrument[] instruments = {
                new StringInstrument("Guitar"),
                new Violin("Violin")
        };

        System.out.println(MusicRoom.playAll(instruments));
    }
}