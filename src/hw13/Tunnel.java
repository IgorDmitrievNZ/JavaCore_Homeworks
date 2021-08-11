package hw13;

import java.util.concurrent.Semaphore;

public class Tunnel extends Stage {
    private Semaphore smp;

    public Tunnel() {
        smp = new Semaphore(MainClass.CARS_COUNT / 2);
        this.length = 80;
        this.description = "Tunnel " + length + " meters";
    }

    @Override
    public void go(Car c) {
        try {
            if (!smp.tryAcquire()) {
                System.out.println(c.getName() + " preparing to stage(waiting): " + description + "[____]");
                smp.tryAcquire();
            }
            System.out.println(c.getName() + " started stage: " + description + "[****]");
            Thread.sleep(length / c.getSpeed() * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(c.getName() + " finished stage: " + description + "[xxxx]");
        }
    }
}

