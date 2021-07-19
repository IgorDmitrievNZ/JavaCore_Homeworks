package hw8;

public class Robot implements JumpRunnable {
    private int maxRun;
    private int maxJump;

    {
        maxRun = 500;
        maxJump = 7;
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
        return "Robot ";
    }
}
