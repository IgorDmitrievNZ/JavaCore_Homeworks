package hw11;

import java.util.ArrayList;


public class Box<T extends Fruit> {
    private ArrayList<T> arr;

    public Box(ArrayList<T> arr) {
        this.arr = arr;
    }

    public Box() {
        this.arr = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Box{" +
                "arr=" + arr.size() +
                '}';
    }

    public float getWeight() {
        float d = 0.0f;

        for (int i = 0; i < arr.size(); i++) {
            d += arr.get(i).getWeight();
        }
        return d;
    }

    public boolean compare(Box<?> another) {
        return Math.abs(getWeight() - another.getWeight()) < 0.00001;
    }

    public void transfer(Box<? super T> another) {
        if (another == this) {
            return;
        }
        another.arr.addAll(this.arr);
        this.arr.clear();
    }

    public void add(T fruit) {
        arr.add(fruit);
    }
}

