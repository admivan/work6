package ru.dolgov;

public class CatAndDog {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name("Барсик");
        cat.run(0);
        cat.swim(50);

        System.out.println();

        Cat cat1 = new Cat();
        cat1.name("Васька");
        cat1.run(100);
        cat1.swim(20);

        System.out.println();

        Cat cat2 = new Cat();
        cat2.name("Рыжик");
        cat2.run(201);
        cat2.swim(20);

        System.out.println();

        Dog dog = new Dog();
        dog.name("Рекс");
        dog.run(0);
        dog.swim(50);

        System.out.println();

        Dog dog1 = new Dog();
        dog1.name("Дружок");
        dog1.run(100);
        dog1.swim(9);

        System.out.println("\nСтатистика по созданным животным:");
        System.out.println("Создано собак: "+Dog.getCounter()+" \nСоздано кошек: "+Cat.getCounter()+" " +
                "\nВсего животных: "+Animal.getCounter());
    }
}
