package data_structures_extended.assignment_problems.Problem_5;

class CircularLinkedList {
    Node tail;

    void addLast(String name) {
        Node newNode = new Node(name);

        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }

    void printTurns(int turns) {
        if (tail == null) {
            return;
        }

        Node current = tail.next;

        for (int i = 0; i < turns; i++) {
            System.out.print(current.name);

            if (i < turns - 1) {
                System.out.print(" ");
            }

            current = current.next;
        }

        System.out.println();
    }
}
