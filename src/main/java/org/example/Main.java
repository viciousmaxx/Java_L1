package org.example;

import org.example.animals.Animal;
import org.example.animals.Cat;
import org.example.animals.Dog;
import org.example.animals.WildCat;
//Практическое задание
//1
//Создать классы Собака, Домашний Кот, Т игр, Ж ивотное (можете добавить два-три своих
//класса).
//2
//Животные могут бежать и плыть. В качестве аргумента каждому методу передается длина
//препятствия.
//3
//У каждого животного есть ограничения на действия (бег: кот — 200 м, собака — 500 м;
//плавание: кот — не умеет плавать, собака — 10 м). Результатом выполнения действия будет
//печать в консоль. Например: d ogBobik.run(150); -> 'Бобик пробежал 150 м'.
//4
//Создать один массив с животными и заставляете их по очереди пробежать дистанцию и
//проплыть.
//5
//* Добавить подсчет созданных Д омашних Котов, Т игров, С обак, Ж ивотных.

public class Main {
    public static void main(String[] args) {

        Animal[] catsAndDogs = {
                new Dog(),
                new Cat(),
                new WildCat()
        };

        for (Animal animal : catsAndDogs) {
            animal.run(100);
            animal.swim(10);
        }

        Animal.getNumOfInstances();
        Dog.getNumOfInstances();
        Cat.getNumOfInstances();
        WildCat.getNumOfInstances();

    }
}