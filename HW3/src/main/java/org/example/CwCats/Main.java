package org.example.CwCats;

import org.example.CwCats.Animals.Animal;
import org.example.CwCats.Animals.Cat;
import org.example.CwCats.Shelters.CatShelter;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CatShelter cats = new CatShelter(List.of(new Cat("name")));
        Iterator<Animal> iterator = cats.iterator();
        if(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}