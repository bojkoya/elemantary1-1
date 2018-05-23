package homeOneTaskSix;

import java.util.Arrays;
import java.util.Random;

public class ArraysNew { public static void main(String[] args) {
    int[] arrayeas = new int[100];
    Random rand = new Random();
    for (int i = 0; i < arrayeas.length; i++) {
        arrayeas[i] = rand.nextInt(100);
    }
    System.out.println(Arrays.toString(arrayeas));
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
