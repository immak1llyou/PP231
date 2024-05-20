package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(String name, String lastName, String email, int age);

    void removeUserById(int id);

    User showUser(int id);

    List<User> getAllUsers();

    void updateUser(int id, User updatedUser);
}
