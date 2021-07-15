package hw7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }

    public boolean decrease(int amount) {
        if (amount <= 0) {
            System.out.println("Amount can not be negative");
            return false;
        }
        if (food < amount) {
            System.out.println("Food can not be negative");
            return false;
        }
        food -= amount;
        return true;
    }

    public void increase(int amount) {
        System.out.println("Somebody put more food");
        food = food + amount;
        System.out.println("It is " + food + " available" + "\n");
    }
}
