package org.example.animals;

public class WildCat extends Animal {
    private static int counter = 0;

    public WildCat() {
        counter++;
    }

    public static void getNumOfInstances() {
        System.out.println(counter + " wild cat");
    }

    @Override
    public void run(int dist) {
        if (dist > 300) {
            System.out.println("Ограничение у тигра - 300м");
        } else if (dist > 0) {
            System.out.println("Тигр пробежал " + dist + " метров");
        } else {
            System.out.println("Расстояние некорректно.");
        }
    }

    @Override
    public void swim(int dist) {
        if (dist > 50) {
            System.out.println("Ограничение на воде у тигра - 50м");
        } else if (dist > 0) {
            System.out.println("Тигр проплыл " + dist + " метров");
        } else {
            System.out.println("Расстояние некорректно.");
        }
    }
}
