package ru.ivmit.repositories;

import ru.ivmit.fake.FakeStorage;
import ru.ivmit.models.User;
import java.util.List;

public class UsersRepositoryInMemoryImpl implements UsersRepository {

    @Override
    public List<User> findAll() {
        return FakeStorage.storage().users();
    }

    @Override
    public void safe(User user) {
        FakeStorage.storage().users().add(user);
    }

    @Override
    public boolean isExists(String name, String password) {
        for (User user : FakeStorage.storage().users()) {
            if (user.getName().equals(name) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }


}
