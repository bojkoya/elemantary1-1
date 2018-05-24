package homeOneTaskSix;

import java.util.Arrays;
import java.util.Random;

public class ArraysNew {
    public static void main(String[] args) {
        int[] arrayeas = new int[100];
        Random rand = new Random();
        for (int i = 0; i < arrayeas.length; i++) {
            arrayeas[i] = rand.nextInt(100);
        }
        sortArray(arrayeas);
        System.out.printf("Min value of array is: %d\n", minValue(arrayeas));
        int n = 0;
        int frec = 0;
        for (int temp : arrayeas) {
            int narr = randomise(arrayeas, temp);
            if (frec < narr) {
                n = temp;
                frec = narr;
            }
        }


        System.out.println("The number " + n + " is repeated " + frec + " times");

    }

    private static void sortArray(int[] arrayForSort) {
        Arrays.sort(arrayForSort);
        int[] newArray = new int[arrayForSort.length];
        for (int i = 0; i < arrayForSort.length; i++) {
            newArray[i] = arrayForSort[arrayForSort.length - 1 - i];
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
    }

    private static int minValue(int[] arrayOfIntegers) {
        int result = arrayOfIntegers[0];
        for (int i = 1; i < arrayOfIntegers.length; i++) {
            if (arrayOfIntegers[i] < result) {
                result = arrayOfIntegers[i];
            }
        }
        return result;
    }

    static int randomise(int[] arr, int x) {
        int n = 0;
        for (int temp : arr) {
            if (x == temp) {
                n++;
            }
        }
        return n;
    }
}
