package data_structures_extended.assignment_problems.Problem_5;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList players = new CircularLinkedList();

        players.addLast("Asha");
        players.addLast("Ravi");
        players.addLast("Neha");

        players.printTurns(7);
    }
}
