package campus_notice_broadcaster;

public class AppChannel implements NotificationChannel {

    @Override
    public void send(Student student, Notice notice) {
        System.out.println(
                "App notification sent to "
                        + student.getName()
                        + ": " + notice.getTitle()
        );
    }
}