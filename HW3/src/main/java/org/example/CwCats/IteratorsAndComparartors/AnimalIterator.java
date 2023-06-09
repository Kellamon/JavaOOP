package org.example.CwCats.IteratorsAndComparartors;

import org.example.CwCats.Animals.Animal;

import java.util.Iterator;
import java.util.List;

public class AnimalIterator implements Iterator<Animal> {
    protected int counter;
    private List<Animal> animals;
    public AnimalIterator(List<Animal> animals) {
        this.counter = 0;
        this.animals = animals;
    }

    public AnimalIterator() {
    }

    @Override
    public boolean hasNext() {
        return this.counter < this.animals.size();
    }

    @Override
    public Animal next() {
        if (!hasNext()) {
            return null;
        }
        return animals.get(counter++);
    }
}