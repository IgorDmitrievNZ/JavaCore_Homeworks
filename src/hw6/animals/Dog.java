package hw6.animals;

public class Dog extends Animal {
    private static int dogCount = 0;
    private static int swimLimit = 10;
    private static int runLimit = 500;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int distanceRun) {
        if (distanceRun > runLimit) {
            System.out.println("Dogs cannot run too long distance");
        } else {
            System.out.println(name + " run " + distanceRun + " m");
        }
    }

    @Override
    public void swim(int distanceSwim) {
        if (distanceSwim > swimLimit) {
            System.out.println("Dogs cannot swim too long distance");
        } else {
            System.out.println(name + " swam " + distanceSwim + " m");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}

