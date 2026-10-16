package kz.kaznu.aiym;

public class Dog extends Animal {

    public Dog(String name, int runSpeed, int swimSpeed, int stamina) {
        super(name, runSpeed, swimSpeed, stamina);
    }

    @Override
    public double swim(int distance) {
        int staminaNeeded = distance * 2;

        if (stamina < staminaNeeded) {
            System.out.println(name + " устал(а) плавать и выбился из сил. Появилось состояние усталости.");
            return -1;
        }

        stamina -= staminaNeeded;
        double time = (double) distance / swimSpeed;
        System.out.println(name + " проплыл(а) " + distance + " м за " + time + " сек.");
        return time;
    }
}