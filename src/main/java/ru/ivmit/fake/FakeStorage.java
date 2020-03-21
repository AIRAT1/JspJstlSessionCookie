package ru.ivmit.fake;

import ru.ivmit.models.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FakeStorage {
    private static final FakeStorage storage;

    static {
        storage = new FakeStorage();
    }

    private List<User> users;

    private FakeStorage() {
        this.users = new ArrayList<>();
        User user = new User("Ayrat", "qwerty", LocalDate.parse("1976-02-07"));
        User user1 = new User("Diana", "asdfg", LocalDate.parse("2008-03-23"));
        User user2 = new User("Damir", "zxcvb", LocalDate.parse("2016-07-12"));
        User user3 = new User("Mama", "12345", LocalDate.parse("1947-03-25"));
        users.add(user);
        users.add(user1);
        users.add(user2);
        users.add(user3);
    }

    public static FakeStorage storage() {
        return  storage;
    }

    public List<User> users() {
        return users;
    }
}
