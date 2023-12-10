package ru.geekbrains.vladbachagov.animals;

public class Tiger extends Animal {
    protected static int count = 0;

    public static int getCount() {
        return count;
    }

    public Tiger(String name, int maxRunDistance) {
        super(name, maxRunDistance, 0);
        count++;
    }
}
