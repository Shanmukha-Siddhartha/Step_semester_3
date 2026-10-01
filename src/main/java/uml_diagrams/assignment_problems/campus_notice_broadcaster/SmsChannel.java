package campus_notice_broadcaster;

public class SmsChannel implements NotificationChannel {

    @Override
    public void send(Student student, Notice notice) {
        System.out.println(
                "SMS sent to " + student.getName()
                        + ": " + notice.getTitle()
        );
    }
}