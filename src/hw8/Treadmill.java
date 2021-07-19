package hw8;

public class Treadmill implements Barrierable {
    private int maxLength;

    {
        maxLength = 500;
    }

    @Override
    public boolean action(JumpRunnable person) {
        int dist = (int) (Math.random() * 1000);
        if (person.run(dist)) {
            if (dist >= maxLength) {
                System.out.println(person.toString() + "run on treadmill " + dist + ". Barrier complete");
                return true;
            } else {
                System.out.println(person.toString() + "run on treadmill " + dist + ". Barrier incomplete!!");
                return false;
            }
        } else {
            System.out.println(person.toString() + "Cannot run so long! " + dist);
            return false;
        }
    }


}
