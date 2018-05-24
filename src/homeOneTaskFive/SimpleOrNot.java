package homeOneTaskFive;

import java.util.Scanner;

public class SimpleOrNot {
    private static String isPrime(long n) {
        if (n < 2) return "False";
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return "Composite number";
        return "Prime number";
    }

    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        System.out.println(isPrime(sc.nextLong()));

    }
}
