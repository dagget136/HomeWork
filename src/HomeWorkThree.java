import java.util.Arrays;
import java.util.Random;

/**
 * Java 1. HomeWork3
 *
 * @author Toryanik Vladimir
 * @version 14 SEP 2021
 */
public class HomeWorkThree {
    public static void main(String[] arr) {
        firstApp();
        secondApp();
        thirdApp();
        fourthApp();
        System.out.println(Arrays.toString(fifthApp(3, 3)));
        sixthApp();
    }

    static void firstApp() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    static void secondApp() {
        int[] mass = new int[100];
        for (int x = 0; x < mass.length; x++) {
            mass[x] = x + 1;
            System.out.print(mass[x] + " ");
        }
        System.out.println();
    }

    static void thirdApp() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void fourthApp() {
        int n = 4;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            arr[i][i] = 1;
            for (int j = 0; j < arr.length; j++) {
                arr[arr.length - 1 - j][j] = 1;
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    static int[] fifthApp(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    static void sixthApp() {
        int min = 100;
        int max = 0;
        Random random = new Random();
        int[] arr = new int[80];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 50);
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Минимальное число:" + min);
        System.out.println("Максимальное число: " + max);
    }
}
