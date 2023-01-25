import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arrayA = new int[]{1, 2, 3};
        float[] arrayB = {1.57f, 7.654f, 9.986f};
        char[] arrayC = {'a', 'b', 'c'};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arrayA = new int[]{1, 2, 3};
        float[] arrayB = {1.57f, 7.654f, 9.986f};
        char[] arrayC = {'a', 'b', 'c'};
        for (int i = 0; i < arrayA.length; i++) {
            if (i == arrayA.length - 1) {
                System.out.println(arrayA[i]);
                break;
            }
            System.out.printf(arrayA[i] + ", ");
        }
        for (int i = 0; i < arrayB.length; i++) {
            if (i == arrayB.length - 1) {
                System.out.println(arrayB[i]);
                break;
            }
            System.out.printf(arrayB[i] + ", ");
        }
        for (int i = 0; i < arrayC.length; i++) {
            if (i == arrayC.length - 1) {
                System.out.println(arrayC[i]);
                break;
            }
            System.out.printf(arrayC[i] + ", ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arrayA = new int[]{1, 2, 3};
        float[] arrayB = {1.57f, 7.654f, 9.986f};
        char[] arrayC = {'a', 'b', 'c'};
        for (int i = arrayA.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrayA[i]);
                break;
            }
            System.out.printf(arrayA[i] + ", ");
        }
        for (int i = arrayB.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrayB[i]);
                break;
            }
            System.out.printf(arrayB[i] + ", ");
        }
        for (int i = arrayC.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrayC[i]);
                break;
            }
            System.out.printf(arrayC[i] + ", ");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int[] arrayA = new int[]{1, 2, 3};
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] % 2 != 0) {
                arrayA[i]++;
            }
        }
        System.out.println(Arrays.toString(arrayA));
    }

}