package hw1;

public class Main {
    public static void main(String[] args) {
        /**
         *  #2 variables init
         */
        byte a = 122;
        short b = 30444;
        int c = -225679876;
        long d = 987897876780909000L;
        float e = 0.788f;
        double f = 0.356245;
        char g = 'j';
        boolean h = false;
        String n = "bla bla bla";

        /**
         *  Init methods
         */
        calculateMethod(0.23f, 2.34f, 4.11f, 3.4f);
        number10and20(30, -10);
        printConditionMethod(0);
        isNegative(-1);
        nameMessage("Igor");
        isLeapYear(2019);
    }

    /**
     * #3 Calculate method
     */
    private static float calculateMethod(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    /**
     * #4 Method sum between 10 and 20
     */
    private static boolean number10and20(int a, int b) {
        int result = a + b;
        return result >= 10 && result <= 20;
    }

    /**
     * #5 Print positive or negative numbers
     */
    private static void printConditionMethod(int a) {
        if (a >= 0) {
            System.out.println(a + " is a positive number");
        } else {
            System.out.println(a + " is a negative number");
        }
    }

    /**
     * #6 Method returns true or fouls
     */
    private static boolean isNegative(int a) {
        return a < 0;
    }

    /**
     * #7 String method
     */
    private static void nameMessage(String name) {
        System.out.println("Привет, " + name + "!");
    }

    /**
     * #8 Leap year method
     */
    private static void isLeapYear(int year) {

        boolean isLeap;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            } else
                isLeap = true;
        } else {
            isLeap = false;
        }

        if (isLeap)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is NOT a Leap Year.");
    }
}


