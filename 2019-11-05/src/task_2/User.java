package task_2;

public class User {

    private String name;
    private String surname;
    private String email;
    private String password;
    private Role role;
    private boolean loggedIn;

    public User(String name, String surname, String email, String password, Role role) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.role = role;
        this.loggedIn = false;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Role getRole() {
        return role;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void login(String email, String password) {
        if(this.email.equals(email) && this.password.equals(password)) this.loggedIn = true;
    }

}
