package org.example;

import org.example.Model.Storage;

public class Main {
    public static void main(String[] args) {
        Storage myStorage = new Storage().createRandomStorage(10);
        myStorage.printStorage();

        Storage clientChoice = new Storage().getFilteredStorage(myStorage);
        clientChoice.printStorage();

    }
}