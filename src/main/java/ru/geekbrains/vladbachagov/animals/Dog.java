package ru.geekbrains.vladbachagov.animals;

public class Dog extends Animal {
    protected static int count = 0;

    public Dog(String name, int maxRunDistance, int maxSwimDistance) {
        super(name, maxRunDistance, maxSwimDistance);
        count++;
    }

    public static int getCount() {
        return count;
    }
}
