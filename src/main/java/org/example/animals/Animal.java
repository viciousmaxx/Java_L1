package org.example.animals;

public abstract class Animal {
    private static int counter = 0;

    public Animal() {
        counter++;
    }

    public static void getNumOfInstances() {
        System.out.println(counter + " animal");
    }

    public abstract void run(int dist);

    public abstract void swim(int dist);
}
