package org.example.CwCats.Shelters;

import org.example.CwCats.IteratorsAndComparartors.AnimalIterator;
import org.example.CwCats.Animals.Animal;

import java.util.Iterator;
import java.util.List;

public class AnimalShelter implements Iterable<Animal>{
    private List<Animal> animals;

    public AnimalShelter(List<Animal> animals) {
        this.animals = animals;
    }

    public AnimalShelter() {
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    @Override
    public Iterator<Animal> iterator() {
        return new AnimalIterator(animals);
    }
}