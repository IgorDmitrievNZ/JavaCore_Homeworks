package hw8;

public class Wall implements Barrierable {
    private int maxHight;

    {
        maxHight = 4;
    }

    @Override
    public boolean action(JumpRunnable person) {
        int dist = (int) (Math.random() * 10);
        if (person.jump(dist)) {
            if (dist >= maxHight) {
                System.out.println(person.toString() + "jump on wall " + dist + ". Barrier complete");
                return true;
            } else {
                System.out.println(person.toString() + "jump on wall " + dist + ". Barrier incomplete!!");
                return false;
            }
        } else {
            System.out.println(person.toString() + "Cannot jump so high! " + dist);
            return false;
        }
    }
}
