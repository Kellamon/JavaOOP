package org.example.Controller;

import org.example.Model.User;
import org.example.Service.UserService;

public class UserController {
    private UserService userService = new UserService();
    public void saveNewUser(int userID, String name, int age){
        userService.saveUser(new User(userID, name, age));
    }

    public void deleteUser(User user){
        userService.deleteFromRepo(user);
    }

    public User getUser(User user){
        return userService.getUserFromRepo(user);
    }

    public void addUserToRepo(User user){
        userService.addUserToRepo(user);
    }
}