package hw11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Integer[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        String[] arr = {"aaaa", "bbbbb", "cccc"};

        System.out.println("Array before swapping: " + Arrays.toString(array));
        swap(array, 1, 2);

        System.out.println("Array before swapping: " + Arrays.toString(arr));
        swap(arr, 1, 2);

        System.out.println("Converted to Array list: " + convert(array));
        System.out.println("Converted to Array list: " + convert(arr));

        Apple apple = new Apple();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Orange orange = new Orange();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        ArrayList<Apple> apples = new ArrayList<>(Arrays.asList(apple, apple1, apple2));
        ArrayList<Orange> oranges = new ArrayList<>(Arrays.asList(orange, orange1));

        Box appleBox = new Box(apples);
        System.out.println(appleBox.getWeight());
        Box orangeBox = new Box(oranges);
        System.out.println(orangeBox.getWeight());

        System.out.println(appleBox.compare(orangeBox));


        System.out.println("Apple box before transfer: " + appleBox.toString());
        Box box3 = new Box();
        System.out.println("New box before transfer: " + box3.toString());
        appleBox.transfer(box3);
        System.out.println("Apple box after transfer: " + appleBox.toString());
        System.out.println("New box after transfer: " + box3.toString());

        System.out.println("Orange box before it was added new orange: " + orangeBox.toString());
        orangeBox.add(orange2);
        System.out.println("Orange box after new orange was added: " + orangeBox.toString());
        System.out.println("New weight of orange box is " + orangeBox.getWeight());

    }

    public static <T> void swap(T[] arr, int i, int j) {
        T x = arr[i];
        arr[i] = arr[j];
        arr[j] = x;
        System.out.println("Array after swapping: " + Arrays.toString(arr));
    }

    public static <Y> List<Y> convert(Y[] arr) {
        List<Y> list = new ArrayList<>();
        for (Y i : arr) {
            list.add(i);
        }
        return list;
    }
}
