package campus_notice_broadcaster;

import java.util.List;

public class Notice {

    private String title;
    private List<String> departments;

    public Notice(
            String title,
            List<String> departments) {

        if (title == null
                || title.isBlank()
                || departments == null
                || departments.isEmpty()) {

            throw new IllegalArgumentException(
                    "Notice must have a title and target department."
            );
        }

        this.title = title;
        this.departments = departments;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getDepartments() {
        return departments;
    }
}