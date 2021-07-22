package hw9;

public class Main {
    public static void main(String[] args) {

// This array checks MyArrayDataException
        String[][] arr = {
                {"11", "rter", "10", "5"},
                {"12", "rter", "3d", "1"},
                {"13", "rter", "3d", "1"},
                {"14", "77y7", "5", "rtyr"}
        };
// This array checks MyArraySizeException in case of the array row is not equal 4
        String[][] arr2 = {
                {"12", "55", "10", "5"},
                {"13", "99", "10", "5"}
        };
// This array checks MyArraySizeException in case of the array column is not equals 4
        String[][] arr3 = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1", "5"},
                {"1", "1", "1", "1"}
        };
// This array is 4х4 size. Dose not call any exceptions
        String[][] arr4 = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };

        try {
            sumArray(arr4); // call the array we need
        } catch (MyArraySizeException e) {
            System.out.println();
            System.out.println(e.getMessage());
            System.out.println("Your array has length: " + e.getNumber());

        } catch (MyArrayDataException e) {
            System.out.println();
            System.out.println(e.getMessage() + e.getInfo());
        }
        System.out.println("Finish"); // This is for visual checking of an exception work

    }

    /**
     * Method converts a string array to a numeric one and calculates the sum of all elements of the array
     *
     * @param arr Name of array
     * @throws MyArraySizeException If array size is not 4x4 format
     * @throws MyArrayDataException If string element of an array could not convert to numbers
     */
    private static void sumArray(String[][] arr) {
        int count = 0;

        if (arr.length != 4) {
            throw new MyArraySizeException("Array row less than 4", arr.length);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("Array column less than 4", arr[i].length);
            }

            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%-10s", arr[i][j]);// print array data for visibility

                try {
                    int x = Integer.parseInt(arr[i][j]);
                    count = count + x;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Wrong type of element: ", "[" + i + "]" + "[" + j + "]");
                }
            }
            System.out.println();
        }
        System.out.println("array sum: " + count);

    }
}
