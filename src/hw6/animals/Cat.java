package hw6.animals;

public class Cat extends Animal {
    private static int catCount = 0;
    private static int swimLimit = 0;
    private static int runLimit = 200;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int distanceRun) {
        if (distanceRun > runLimit) {
            System.out.println("Cats cannot run too long distance");
        } else {
            System.out.println(name + " run " + distanceRun + " m");
        }
    }

    @Override
    public void swim(int distanceSwim) {
        if (distanceSwim > swimLimit) {
            System.out.println("Cats cannot swim at all");
        } else {
            System.out.println(name + " swam " + distanceSwim + " m");
        }
    }

    public static int getCatCount() {
        return catCount;
    }
}

