package ru.geekbrains.vladbachagov.homework2.obstacles;

import ru.geekbrains.vladbachagov.homework2.participants.Participant;

public class Treadmill extends Obstacle {
    private int distance;
    public Treadmill(int distance) {
        this.distance = distance;
    }
    @Override
    public boolean passingObstacle(Participant participant) {
        if (participant.run(distance)) {
            System.out.println(participant.toString() + " справился с беговой дорожкой на " + distance + " м.");
            return true;
        } else {
            System.out.println(participant.toString() + " не смог пробежать по беговой дорожке " + distance + " м.");
            return false;
        }
    }
}
