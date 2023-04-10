package org.example.CwCats.IteratorsAndComparartors;

import org.example.CwCats.Animals.Dog;

import java.util.List;

public class DogIterator extends AnimalIterator{
    private List<Dog> dogs;


    public DogIterator(List<Dog> dogs) {
        this.counter = 0;
        this.dogs = dogs;
    }
}