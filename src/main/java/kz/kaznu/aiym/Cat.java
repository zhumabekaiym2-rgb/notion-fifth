package kz.kaznu.aiym;

public class Cat extends Animal {

    public Cat(String name, int runSpeed, int stamina) {
        super(name, runSpeed, 0, stamina);
    }

    @Override
    public double swim(int distance) {
        System.out.println(name + " — кот, он плавать не умеет!");
        return -1;
    }
}