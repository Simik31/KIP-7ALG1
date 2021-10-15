package cz.osu.student.r19584.kip7alg1.tut7.task_2;

public class UserManagement {
    public User registration(String name, String surname, String email, String password, Role role) {
        User ret = new User(name, surname, email, password, role);
        return ret;
    }
}
