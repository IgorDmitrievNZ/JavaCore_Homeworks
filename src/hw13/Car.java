package hw13;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class Car implements Runnable {
    private static int CARS_COUNT;
    private static AtomicInteger atomicInteger;
    private CyclicBarrier barrier;
    private Race race;
    private int speed;
    private String name;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    static {
        atomicInteger = new AtomicInteger(0);
    }

    public Car(Race race, int speed, CyclicBarrier barrier) {
        this.race = race;
        this.barrier = barrier;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Racer #" + CARS_COUNT;
    }

    @Override
    public void run() {

        try {
            System.out.println(this.name + " is preparing");
            Thread.sleep(500 + (int) (Math.random() * 800));
            System.out.println(this.name + " ready");
            barrier.await();
            barrier.await();

            for (int i = 0; i < race.getStages().size(); i++) {
                race.getStages().get(i).go(this);
            }
            if (atomicInteger.incrementAndGet() == 1) {
                System.out.println(name + " WINNER");
            }

            barrier.await();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
