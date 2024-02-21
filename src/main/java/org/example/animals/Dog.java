package org.example.animals;

public class Dog extends Animal {
    private static int counter = 0;

    public Dog() {
        counter++;
    }

    public static void getNumOfInstances() {
        System.out.println(counter + " dog");
    }

    @Override
    public void run(int dist) {
        if (dist > 500) {
            System.out.println("Ограничение у собаки - 500м");
        } else if (dist > 0) {
            System.out.println("Пес пробежал " + dist + " метров");
        } else {
            System.out.println("Расстояние некорректно.");
        }

    }

    @Override
    public void swim(int dist) {
        if (dist > 10) {
            System.out.println("Ограничение на воде у собаки - 10м");
        } else if (dist > 0) {
            System.out.println("Пес проплыл " + dist + " метров");
        } else {
            System.out.println("Расстояние некорректно.");
        }
    }
}
