package hw14;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
    }

    public static List<Integer> getArr(ArrayList<Integer> arr) {
        if (arr.contains(4)) {
            return arr.subList(arr.lastIndexOf(4) + 1, arr.size());
        } else {
            throw new RuntimeException();
        }
    }


    public static boolean checkArray(ArrayList<Integer> array, int a, int b) {
        boolean Val1 = false;
        boolean Val2 = false;

        for (int i : array) {
            if (i == a)
                Val1 = true;
            else if (i == b)
                Val2 = true;
            else
                return false;
        }

        return Val1 && Val2;
    }

}
