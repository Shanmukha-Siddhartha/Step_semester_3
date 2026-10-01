package campus_notice_broadcaster;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Student asha =
                new Student(
                        "Asha",
                        "CSE",
                        Arrays.asList(
                                new EmailChannel(),
                                new AppChannel()
                        )
                );

        Student ravi =
                new Student(
                        "Ravi",
                        "ECE",
                        Arrays.asList(
                                new SmsChannel()
                        )
                );

        NoticeBoard board = new NoticeBoard();

        board.addStudent(asha);
        board.addStudent(ravi);

        Notice notice =
                new Notice(
                        "Placement Drive Tomorrow",
                        Arrays.asList("CSE", "ECE")
                );

        board.postNotice(notice);

        try {
            new Notice(
                    "Invalid Notice",
                    Arrays.asList()
            );
        } catch (IllegalArgumentException e) {
            System.out.println(
                    "Invalid notice rejected."
            );
        }
    }
}