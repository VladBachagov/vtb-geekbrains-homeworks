package ru.geekbrains.vladbachagov.animals;

public class HouseCat extends Animal {
    protected static int count = 0;

    public HouseCat(String name, int maxRunDistance) {
        super(name, maxRunDistance, 0);
        count++;
    }

    public static int getCount() {
        return count;
    }
}
