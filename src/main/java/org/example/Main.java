package org.example;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSing();
        printColor();
        compareNumbers();
        System.out.println(task5(5, 1) + "\n");
        task6(-8);
        System.out.println(task7(-4) + "\n");
        task8("Sos", 10);
        System.out.println(task9(2024));
        int [] replaceValues = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int [] multily0n2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("task10: ");
        task10(replaceValues);
        System.out.println("\ntask11: ");
        task11(100);
        System.out.println("\ntask12");
        task12(multily0n2);
        System.out.println("\ntask13");
        task13();
        System.out.println("\ntask14");
        task14(5,6);

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSing() {
        int a = 31;
        int b = 25;
        int c = a + b;
        if (c >= 0) {
            System.out.println("sum is positive");
        } else {
            System.out.println("sum is negative");
        }
    }

    public static void printColor() {
        int value = 50;
        if (value <= 0) {
            System.out.println("red");
        }
        if (value > 0 && value <= 100) {
            System.out.println("yellow");
        }
        if (value > 100) {
            System.out.println("green");
        }
    }

    public static void compareNumbers() {
        int a = 55;
        int b = 105;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");}
    }

    public static boolean task5(int a, int b) {
        return a >= 10 && b <= 20;
    }

    public static void task6(int a) {
        System.out.println(a >= 0 ? "Positive/n" : "Negative/n");
    }

    public static boolean task7(int a) {
        return a >= 0;
    }

    public static void task8(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + str);
        }
    }

    public static boolean task9(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }

    public static void task10(int[] replaceValues) {
        for (int i = 0; i < replaceValues.length; i++) {
            replaceValues[i] = (replaceValues[i] > 0) ? 0 : 1;
            System.out.println(replaceValues[i] + " ");
        }
    }

    public static void task11(int size) {
        int[] fillArr = new int[size];
        for (int i = 0; i < fillArr.length; i++) {
            fillArr[i] = i + 1;
            System.out.println(fillArr[i] + " ");
        }
    }

    public static void task12(int[] multiplyOn2) {
        for (int i = 0; i < multiplyOn2.length; i++) {
            if (multiplyOn2[i] < 6) {
                multiplyOn2[i] = multiplyOn2[i] * 2;
            }
            System.out.println(multiplyOn2[i] + " ");
        }
    }

    public static void task13() {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.println(arr[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

    public static void task14(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }
}