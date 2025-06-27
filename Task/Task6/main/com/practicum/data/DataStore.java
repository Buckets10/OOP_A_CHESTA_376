package main.com.practicum.data;

import main.java.com.praktikum.users.*;

import java.util.HashMap;

public class DataStore {
    private static final HashMap<String, User> users = new HashMap<>();

    static {
        users.put("admin", new Admin("admin", "admin123"));
        users.put("mhs", new Mahasiswa("mhs", "mhs123"));
    }

    public static User getUser(String username) {
        return users.get(username);
    }
}
