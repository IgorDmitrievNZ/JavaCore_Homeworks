package hw7;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik");
        Plate plate = new Plate(1);


        cat.eat(plate);
        System.out.println(cat.getName() + "'s fullness: " + cat.isFullness() + "\n");
        plate.increase(45);      // increase method adds more food to the plate
        cat.eat(plate);
        System.out.println(cat.getName() + "'s fullness: " + cat.isFullness() + "\n");
        System.out.println("***************************************");       //visual separator

        Cat[] cats = {
                new Cat("Gosha"),
                new Cat("Murka"),
                new Cat("Musia"),
                new Cat("Vasia")
        };

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            System.out.println(cats[i].getName() + "'s fullness: " + cats[i].isFullness() + "\n");
        }


    }

}
