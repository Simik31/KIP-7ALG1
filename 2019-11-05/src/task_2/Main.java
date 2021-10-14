package task_2;

public class Main {

    public static void main(String[] args) {

        UserManagement users = new UserManagement();

        User msima = users.registration("Martin", "Šimara", "r19584@student.osu.cz", "12345", Role.ADMIN);

        msima.login("r19584@student.osu.cz", "12345");

        if(msima.isLoggedIn()) {
            System.out.println("msima has logged in!");
            System.out.println("Name: " + msima.getName());
            System.out.println("Surname: " + msima.getSurname());
            System.out.println("Role: " + msima.getRole());
        } else {
            System.out.println("Incorrect email or password!");
        }

    }
}
