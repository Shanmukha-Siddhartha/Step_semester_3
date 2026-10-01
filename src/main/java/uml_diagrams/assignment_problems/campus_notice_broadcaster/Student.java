package campus_notice_broadcaster;

import java.util.List;

public class Student {

    private String name;
    private String department;
    private List<NotificationChannel> channels;

    public Student(
            String name,
            String department,
            List<NotificationChannel> channels) {

        this.name = name;
        this.department = department;
        this.channels = channels;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public List<NotificationChannel> getChannels() {
        return channels;
    }
}