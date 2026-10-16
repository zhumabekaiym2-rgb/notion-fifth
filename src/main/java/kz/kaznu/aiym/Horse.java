package kz.kaznu.aiym;

public class Horse extends Animal {

    public Horse(String name, int runSpeed, int swimSpeed, int stamina) {
        super(name, runSpeed, swimSpeed, stamina);
    }

    @Override
    public double swim(int distance) {
        int staminaNeeded = distance * 4;

        if (stamina < staminaNeeded) {
            System.out.println(name + " устала плыть и не имеет достаточно выносливости. Появилось состояние усталости.");
            return -1;
        }

        stamina -= staminaNeeded;
        double time = (double) distance / swimSpeed;
        System.out.println(name + " проплыла " + distance + " м за " + time + " сек.");
        return time;
    }
}
