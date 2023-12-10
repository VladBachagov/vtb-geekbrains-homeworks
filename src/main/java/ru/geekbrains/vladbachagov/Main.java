package ru.geekbrains.vladbachagov;

import ru.geekbrains.vladbachagov.animals.Animal;
import ru.geekbrains.vladbachagov.animals.Dog;
import ru.geekbrains.vladbachagov.animals.HouseCat;
import ru.geekbrains.vladbachagov.animals.Tiger;

//  1) Создать классы Собака, Домашний Кот, Тигр, Животное.
//  2) Животные могут бежать и плыть. В качестве аргумента каждому методу передается длина препятствия.
//  3) У каждого животного есть ограничения на действия (бег: кот — 200 м, собака — 500 м;
//      плавание: кот — не умеет плавать, собака — 10 м).
//      Результатом выполнения действия будет печать в консоль.
//      Например: Bobik.run(150); -> 'Бобик пробежал 150 м'.
//  4) Создать один массив с животными и заставляете их по очереди пробежать дистанцию и проплыть.
//  5) Добавить подсчет созданных Домашних Котов, Тигров, Собак, Животных.
public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Шарик", 500, 100),
                new HouseCat("Арнольд", 100),
                new Tiger("Жора", 10000)
        };

        for (Animal o : animals) {
            o.run(150);
            o.swim(50);
        }

        System.out.println("Кол-во домашних котов: " + HouseCat.getCount());
        System.out.println("Кол-во тигров: " + Tiger.getCount());
        System.out.println("Кол-во собак: " + Dog.getCount());
        System.out.println("Кол-во животных: " + Animal.getCount());
    }
}
