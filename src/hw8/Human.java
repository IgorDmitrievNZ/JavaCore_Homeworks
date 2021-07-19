package hw8;

public class Human implements JumpRunnable {
    private int maxRun;
    private int maxJump;

    {
        maxRun = 1000;
        maxJump = 4;
    }

    @Override
    public boolean jump(int height) {
        return height <= maxJump;
    }

    @Override
    public boolean run(int dist) {
        return dist <= maxRun;
    }

    @Override
    public String toString() {
        return "Human ";
    }
}