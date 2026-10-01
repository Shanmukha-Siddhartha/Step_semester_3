package campus_notice_broadcaster;

public interface NotificationChannel {

    void send(Student student, Notice notice);
}