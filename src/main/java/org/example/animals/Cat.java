package org.example.animals;

public class Cat extends Animal {
    private static int counter = 0;

    public Cat() {
        counter++;
    }

    public static void getNumOfInstances() {
        System.out.println(counter + " cat");
    }

    @Override
    public void run(int dist) {
        if (dist > 200) {
            System.out.println("Ограничение у кошки - 200м");
        } else {
            System.out.println("Кот пробежал " + dist + " метров");
        }
    }

    @Override
    public void swim(int dist) {
        System.out.println("кот — не умеет плавать");
    }
}
