package campus_notice_broadcaster;

import java.util.ArrayList;
import java.util.List;

public class NoticeBoard {

    private List<Student> students;

    public NoticeBoard() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void postNotice(Notice notice) {

        for (Student student : students) {

            if (notice.getDepartments()
                    .contains(student.getDepartment())) {

                for (NotificationChannel channel
                        : student.getChannels()) {

                    channel.send(student, notice);
                }
            }
        }
    }
}