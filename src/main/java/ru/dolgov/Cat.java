package ru.dolgov;

public class Cat extends Animal {
    private final int maxrun = 200;
    private static int counter;

    {
        counter++;
    }

    @Override
    public void name(String name) {
        System.out.print("Я кот мое имя " + name + ". ");
    }

    @Override
    public void swim(int length) {
        System.out.print("Я не умею плавать! ");
    }

    @Override
    public void run(int length) {
        if (length>0&&length<=maxrun){
            System.out.print("Я бегу " + length + "m.");
        }else if(length<=0){
            System.out.print("Пробежка начинается с 1 метра. ");
        }else {
            System.out.print("Я не смогу пробежать "+length+" метр(ов) максимум могу пробежать "+maxrun+". ");
        }

    }

    public static int getCounter() {
        return counter;
    }
}
