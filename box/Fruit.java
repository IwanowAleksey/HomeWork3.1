package ru.geekbrains.homework1.box;

public abstract class Fruit {

    private float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    float getWeight() {
        return weight;
    }
}