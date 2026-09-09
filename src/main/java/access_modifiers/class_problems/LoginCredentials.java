package access_modifiers.class_problems;

public class LoginCredentials {

    private String username;
    private String password;

    public LoginCredentials(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        if (password != null && password.length() >= 8) {
            this.password = password;
            System.out.println("Password updated successfully.");
        } else {
            System.out.println(
                    "Password must contain at least 8 characters."
            );
        }
    }

    public static void main(String[] args) {

        LoginCredentials user =
                new LoginCredentials("student01");

        System.out.println(
                "Username: " + user.getUsername()
        );

        user.setPassword("password123");
    }
}