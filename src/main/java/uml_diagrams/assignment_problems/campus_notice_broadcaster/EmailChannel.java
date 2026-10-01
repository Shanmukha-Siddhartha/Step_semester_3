package campus_notice_broadcaster;

public class EmailChannel implements NotificationChannel {

    @Override
    public void send(Student student, Notice notice) {
        System.out.println(
                "Email sent to " + student.getName()
                        + ": " + notice.getTitle()
        );
    }
}