package kz.kaznu.aiym;

public class Animal {
    protected String name;
    protected int runSpeed;
    protected int swimSpeed;
    protected int stamina;

    public Animal(String name, int runSpeed, int swimSpeed, int stamina) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.stamina = stamina;
    }

    public double run(int distance) {
        if (stamina < distance) {
            System.out.println(name + " устал(а) и не может пробежать такую дистанцию. Появилось состояние усталости.");
            return -1;
        }

        stamina -= distance;
        double time = (double) distance / runSpeed;
        System.out.println(name + " пробежал(а) " + distance + " м за " + time + " сек.");
        return time;
    }


    public double swim(int distance) {
        return -1;
    }

    public void info() {
        System.out.println("Животное: " + name + " Выносливость: " + stamina);
    }
}