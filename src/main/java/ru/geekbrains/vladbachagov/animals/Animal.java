package ru.geekbrains.vladbachagov.animals;

public abstract class Animal {
    protected static int count = 0;
    protected String name;
    protected int maxRunDistance;
    protected int maxSwimDistance;

    public static int getCount() {
        return count;
    }

    public Animal(String name, int maxRunDistance, int maxSwimDistance) {
        count++;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " пробежал " + distance + " метров");
        } else System.out.println(name + " не справился с дистанцией =(");

    }

    public void swim(int distance) {
        if (maxSwimDistance == 0) {
            System.out.println(name + " не умеет плавать");
            return;
        }

        if (distance <= maxSwimDistance) {
            System.out.println(name + " проплыл " + distance + " метров");
        } else System.out.println(name + " не справился с дистанцией =(");
    }
}
