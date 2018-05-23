package homeOneTaskTree;

import java.util.Arrays;

public class Average {
    public static void main(String[] args) {

        int[] list = new int[3];

        list[0] = 102;
        list[1] = 563;
        list[2] = 14;

        int sum = 0;
        int n;
        for(n = 0; n < list.length; n++ ) {

            sum =sum + list[n];

        }

        int averSum = sum/list.length;

        System.out.println("Massive is: " + Arrays.toString(list));
        System.out.println("Average sum of list is: " +averSum);

    }
}
