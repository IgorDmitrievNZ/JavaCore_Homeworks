package hw4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    static final int SIZE = 3;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';

    final static char[][] MAP = new char[SIZE][SIZE];

    static final Scanner sc = new Scanner(System.in);
    static final Random random = new Random();


    public static void main(String[] args) {
        initMap();
        printMap();


        while (true) {
            playersTurn();
            printMap();

            if (checkWin(DOT_X)) {
                System.out.println("You won!");
                break;
            }

            if (isFull()) {
                System.out.println("Match draw");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("You lost");
                break;
            }

            if (isFull()) {
                System.out.println("Match draw");
                break;
            }
        }

    }

//


//    public static boolean checkWin (char c){
//        if(map[0][0] == c && map[0][1] == c && map[0][2] == c){ return true; }
//        if(map[1][0] == c && map[1][1] == c && map[1][2] == c){ return true; }
//        if(map[2][0] == c && map[2][1] == c && map[2][2] == c){ return true; }
//
//        if(map[0][0] == c && map[1][0] == c && map[2][0] == c){ return true; }
//        if(map[0][1] == c && map[1][1] == c && map[2][1] == c){ return true; }
//        if(map[0][2] == c && map[1][2] == c && map[2][2] == c){ return true; }
//
//        if(map[0][0] == c && map[1][1] == c && map[2][2] == c){ return true; }
//        if(map[0][2] == c && map[1][1] == c && map[2][0] == c){ return true; }
//
//        return false;
//    }

    public static boolean checkWin(char c) {
        for (int i = 0; i < SIZE; i++) {
            int result = 0;
            for (int j = 0; j < SIZE; j++) {
                if (MAP[i][j] == c) result++;
            }
            if (result == SIZE) return true;
        }

        for (int i = 0; i < SIZE; i++) {
            int result = 0;
            for (int j = 0; j < SIZE; j++) {
                if (MAP[j][i] == c) result++;
            }
            if (result == SIZE) return true;
        }
        int x = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (j == i && MAP[i][j] == c) x++;
            }
        }
        if (x == SIZE) return true;
        int y = 0;
        for (int i = 0, j = SIZE - 1; i < SIZE && j >= 0; i++, j--) {
            if (MAP[i][j] == c) y++;
        }
        if (y == SIZE) return true;
        return false;
    }


    public static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (MAP[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void aiTurn() {
        int y;
        int x;

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(y, x));

        MAP[y][x] = DOT_O;
    }


    public static boolean isCellValid(int y, int x) {
        if (y < 0 || x < 0 || y >= SIZE || x >= SIZE) {
            return false;
        }
        return MAP[y][x] == DOT_EMPTY;

    }

    public static void playersTurn() {
        int y;
        int x;

        do {
            System.out.println("Input X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y, x));

        MAP[y][x] = DOT_X;
    }

    public static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }

    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%d ", (i + 1));
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%d ", (i + 1));
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%c ", MAP[i][j]);
            }
            System.out.println();
        }
    }

}

