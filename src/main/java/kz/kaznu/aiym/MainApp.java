package kz.kaznu.aiym;

public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 5, 50);
        Dog dog = new Dog("Мухтар", 8, 3, 100);
        Horse horse = new Horse("Гром", 12, 2, 200);

        cat.info();
        cat.run(20);
        cat.swim(10);
        cat.info();


        dog.info();
        dog.run(30);
        dog.swim(20);
        dog.info();


        horse.info();
        horse.run(50);
        horse.swim(15);
        horse.info();
    }
}