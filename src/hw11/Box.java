package hw11;

import java.util.ArrayList;

public class Box<T extends Fruit> implements Comparable<Box> {
    private ArrayList<Fruit> arr;

    public Box(ArrayList<Fruit> arr) {
        this.arr = arr;
    }

    @Override
    public int compareTo(Box o) {
        return 0;
    }

    public float getWeight() {
        float d = 0;
        for (int i = 0; i < arr.size(); i++) {
            d += arr.get(i).getWeight();
        }
        return d;
    }

    public boolean compare(Box<?> another) {
        return Math.abs(getWeight() - another.getWeight()) < 0.00001;
    }

}

