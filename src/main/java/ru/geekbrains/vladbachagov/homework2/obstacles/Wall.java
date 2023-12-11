package ru.geekbrains.vladbachagov.homework2.obstacles;

import ru.geekbrains.vladbachagov.homework2.participants.Participant;

public class Wall extends Obstacle {
    private int height;
    public Wall(int height) {
        this.height = height;
    }
    @Override
    public boolean passingObstacle(Participant participant) {
        if (participant.jump(height)) {
            System.out.println(participant.toString() + " смог перепрыгнуть стену высотой " + height + " м.");
            return true;
        } else {
            System.out.println(participant.toString() + " не смог перепрыгнуть стену высотой " + height + " м.");
            return false;
        }
    }
}

