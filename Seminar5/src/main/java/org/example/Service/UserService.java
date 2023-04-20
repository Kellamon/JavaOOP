package org.example.Service;

import org.example.Model.User;
import org.example.Repo.UserRepo;

public class UserService {
    private UserRepo userRepo = new UserRepo();
    public void saveUser(User user){
        userRepo.saveUser(user);
    }

    public void deleteFromRepo(User user){
        userRepo.deleteFromRepo(user);
    }

    public User getUserFromRepo(User user){
        return userRepo.getUserFromRepo(user);
    }

    public void addUserToRepo(User user){
        userRepo.addUserToRepo(user);
    }

}