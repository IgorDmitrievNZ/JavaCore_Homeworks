package hw6;

import hw6.animals.Animal;
import hw6.animals.Cat;
import hw6.animals.Dog;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {
                new Dog("Bobik"),
                new Dog("Tuzik"),
                new Dog("Muhtar"),
                new Cat("Musia"),
                new Cat("Murka"),
                new Cat("Barsik"),
                new Dog("Sharik")
        };

        animals[0].swim(44);
        animals[4].run(54);
        animals[4].swim(3);
        animals[2].run(765);
        animals[1].swim(4);
        animals[3].run(159);
        animals[6].run(444);
        animals[6].swim(10);
        animals[5].run(400);

        System.out.println("*********************"); // visual separator only

        System.out.println("Total created " + Cat.getCatCount() + " cats");
        System.out.println("Total created " + Dog.getDogCount() + " dogs");
        System.out.println("Total created " + Animal.getAnimalCount() + " animals");


    }
}
