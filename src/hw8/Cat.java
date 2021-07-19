package hw8;

public class Cat implements JumpRunnable {
    private int maxRun;
    private int maxJump;

    {
        maxRun = 700;
        maxJump = 5;
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
        return "Cat ";
    }
}