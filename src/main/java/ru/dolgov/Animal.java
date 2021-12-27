package ru.dolgov;

public abstract class Animal {
    private static int counter;

    static {
        counter++;
    }

    public abstract void name(String name);

    public abstract void run(int length);

    public abstract void swim(int length);

    public static int getCounter() {
        return counter;
    }
}
