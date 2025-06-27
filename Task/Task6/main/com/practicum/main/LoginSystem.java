package main.com.practicum.main;

import main.java.com.praktikum.data.DataStore;
import main.java.com.praktikum.users.*;

public class LoginSystem {
    public static User authenticate(String username, String password) {
        User user = DataStore.getUser(username);
        if (user != null && user.checkPassword(password)) {
            return user;
        }
        return null;
    }
}
