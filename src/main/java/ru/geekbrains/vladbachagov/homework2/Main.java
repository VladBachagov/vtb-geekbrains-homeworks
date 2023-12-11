package ru.geekbrains.vladbachagov.homework2;

import ru.geekbrains.vladbachagov.homework2.obstacles.Obstacle;
import ru.geekbrains.vladbachagov.homework2.obstacles.Treadmill;
import ru.geekbrains.vladbachagov.homework2.obstacles.Wall;
import ru.geekbrains.vladbachagov.homework2.participants.Cat;
import ru.geekbrains.vladbachagov.homework2.participants.Human;
import ru.geekbrains.vladbachagov.homework2.participants.Participant;
import ru.geekbrains.vladbachagov.homework2.participants.Robot;

// 1) Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
//    Эти классы должны уметь бегать и прыгать, все также с выводом информации о действии в консоль.
// 2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
//    должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
//    печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
//    У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
// 3) Создайте два массив: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
//    Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
public class Main {
    public static void main(String[] args) {

        Participant[] participants = {
                new Robot(),
                new Human(),
                new Cat()
        };

        Obstacle[] obstacles = {
                new Treadmill(100),
                new Wall(50),
        };

        for(Participant participant : participants){
            for(Obstacle obstacle : obstacles){
                if(!obstacle.passingObstacle(participant)){
                    break;
                }
            }
        }
    }
}
