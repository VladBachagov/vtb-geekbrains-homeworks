package ru.geekbrains.vladbachagov.homework2.participants;

public class Human implements Participant {
    private final int MAX_RUN_DISTANCE = 500;
    private final int MAX_JUMP_DISTANCE = 50;

    @Override
    public boolean run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(this.toString() + " пробежал " + distance + " м.");
            return true;
        } else {
            System.out.println(this.toString() + " не может пробежать дистанцию в " + distance + " м.");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= MAX_JUMP_DISTANCE) {
            System.out.println(this.toString() + " прыгнул на " + height + " м.");
            return true;
        } else {
            System.out.println(this.toString() + " не может прыгнуть на высоту " + height + " м.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "ЧЕЛОВЕК";
    }
}