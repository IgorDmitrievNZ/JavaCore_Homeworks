package hw13;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MainClass {
    public static final int CARS_COUNT = 4;

    public static void main(String[] args) {

        System.out.println("ATTENTION PLEASE >>> Preparation to the race!!!");

        CyclicBarrier barrier = new CyclicBarrier(MainClass.CARS_COUNT + 1);
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        Car[] cars = new Car[CARS_COUNT];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10), barrier);
        }
        for (int i = 0; i < cars.length; i++) {
            new Thread(cars[i]).start();
        }

        try {
            barrier.await();
            System.out.println("IMPORTANT ANNOUNCEMENT >>> The race started!!!");
            barrier.await();
            barrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException b) {
            b.printStackTrace();
        }

        System.out.println("IMPORTANT ANNOUNCEMENT >>> The race finished!!!");
    }
}

