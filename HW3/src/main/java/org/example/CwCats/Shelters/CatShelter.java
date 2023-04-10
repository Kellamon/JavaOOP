package org.example.CwCats.Shelters;

import org.example.CwCats.Animals.Animal;
import org.example.CwCats.Animals.Cat;
import org.example.CwCats.IteratorsAndComparartors.AnimalIterator;
import org.example.CwCats.IteratorsAndComparartors.CatIterator;


import java.util.Iterator;
import java.util.List;

public class CatShelter extends AnimalShelter {
    private List<Cat> cats;

    public CatShelter(List<Cat> cats) {
        this.cats = cats;
    }

    public CatShelter() {
    }
}