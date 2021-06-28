package hw2;

import java.util.Arrays;
import java.util.Random;

public class MainApp {
    static Random random = new Random();

    public static void main(String[] args) {

        /**
         *  Task # 1
         */

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));


        /**
         *  Task # 2
         */

        int[] numbersArr = new int[8];

        for (int i = 0; i < numbersArr.length; i++) {
            numbersArr[i] = i * 3;
        }
        System.out.println(Arrays.toString(numbersArr));


        /**
         *   Task # 3
         */

        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) {
                a[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(a));


        /**
         *  Task # 4 Call method
         */

        int[][] arr2d = new int[3][3];
        printArr2d(arr2d);


        /**
         *  Task # 5
         */

        int[] arrTask5 = {1561, 244, 39, 4444, 57};
        int max = arrTask5[0];
        int min = arrTask5[0];

        for (int i = 1; i < arrTask5.length; i++) {
            if (arrTask5[i] < min) {
                min = arrTask5[i];
            }
            if (arrTask5[i] > max) {
                max = arrTask5[i];
            }
        }
        System.out.println(min + " " + max );


        
        /**
         *  Task # 6 print method
         */
        System.out.println(task6());



    }


    /**
     *  Task #4 method
     */

    public static void printArr2d(int[][] arr2d) {
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                if (i == j) {
                    arr2d[i][j] = 1;
                } else if (i + j == arr2d.length - 1) {
                    arr2d[i][j] = 1;
                }
                System.out.printf("%4d", arr2d[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Task # 6
     */

    public static boolean task6() {
        int[] arr = {2, 3, 4, 1};

        for (int i = 0; i < arr.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j <= i; j++) {
                leftSum += arr[j];
            }
            for (int m = i+1; m < arr.length; m++) {
                rightSum += arr[m];
            }
            if (leftSum == rightSum) {
                return true;
            }
        }
    return false;
    }



}
