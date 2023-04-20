package org.example.controller;

import org.example.model.User;
import org.example.repo.UserRepo;
import org.example.service.UserService;

import java.io.IOException;

public class UserController {
    private UserService userService = new UserService();
    private UserRepo userRepo = new UserRepo();

    /**
     * Метод создания нового пользователя с автоматическим добавлением его в РЕПО
     *
     * @return - новый экземпляр класса User
     */
    public User createNewUser() {
        User user = userService.createNewUser();
        userRepo.addUserToRepo(user);
        return user;
    }

    public void deleteUserFromRepo(int userID) {
        userRepo.deleteUserFromRepo(userID);
    }

    public User getUserFromRepo(int userID) {
        return userRepo.getUserFromRepo(userID);
    }

    public String getUserBalance(User user) {
        return user.getBalanceInfo();
    }

    public void showUserRepo() {
        userRepo.showUserRepo();
    }

    public void showFullInfoInUserRepo() {
        userRepo.showFullInfoInUserRepo();
    }

    public void extractUserRepo() throws IOException {
        userRepo.extractUserRepo();
    }

}
