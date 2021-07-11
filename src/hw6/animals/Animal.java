package hw6.animals;

public abstract class Animal {
    String name;
    private static int animalCount = 0;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public abstract void run(int distanceRun);

    public abstract void swim(int distanceSwim);

    public static int getAnimalCount() {
        return animalCount;
    }
}
