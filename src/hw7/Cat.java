package hw7;

public class Cat {
    private String name;
    private boolean fullness;

    public Cat(String name) {
        this.name = name;
        fullness = false;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        if (plate.decrease(10)) {
            System.out.println("Cat " + name + " eats...It's full now");
            System.out.println(plate.getFood() + " food available");
            fullness = true;
        } else {
            System.out.println("Cat " + name + " still hungry");
            fullness = false;
        }
    }

    public boolean isFullness() {
        return fullness;
    }
}
