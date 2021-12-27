package ru.dolgov;

public class Dog extends Animal {
    private final int maxrun = 500;
    private final int maxswim=10;
    private static int counter;

    static {
        counter++;
    }

    @Override
    public void name(String name) {
        System.out.print("Я собака мое имя " + name + ". ");
    }

    @Override
    public void swim(int length) {
        if (length>0&&length<=maxswim){
            System.out.print("Я плыву " + length + "m.");
        }else if(length<=0){
            System.out.print("Могу плыть начиная с 1 метра ");
        }else {
            System.out.print("Я не смогу проплыть "+length+" метр(ов) максимум могу проплыть "+maxswim+". ");
        }
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
