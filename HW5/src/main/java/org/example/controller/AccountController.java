package org.example.controller;

import org.example.model.Account;
import org.example.model.User;
import org.example.repo.AccountRepo;
import org.example.service.AccountService;

import java.io.IOException;

public class AccountController {
    private AccountService accountService = new AccountService();
    private AccountRepo accountRepo = new AccountRepo();

    /**
     * Метод создания нового лицевого счета с автоматическим добавлением его в repo
     *
     * @param user - пользователь, для которого создается лицевой счет
     */
    public Account createNewAccount(User user) {
        Account account = accountService.createNewAccount(user);
        accountRepo.addAccountToRepo(account);
        return account;
    }

    public void deleteAccountFromRepo(String accountNumber) {
        accountRepo.deleteAccountFromRepo(accountNumber);
    }


    public Account getAccountFromRepo(String accountNumber) {
        return accountRepo.getAccountFromRepo(accountNumber);
    }

    public void showAccountRepo() {
        accountRepo.showAccountRepo();
    }

    public void extractAccountRepo() throws IOException {
        accountRepo.extractAccountRepo();
    }
}