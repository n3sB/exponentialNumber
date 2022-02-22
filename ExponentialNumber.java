package exponentialNumber;

import java.util.Scanner;

public class ExponentialNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int baseNumber, exponentNumber;
        int total = 1;

        System.out.print("Please enter the base number: ");
        baseNumber = scanner.nextInt();

        System.out.print("Please enter the exponent number: ");
        exponentNumber = scanner.nextInt();

        for (int i = 1; i <= exponentNumber; i++) {

            total *= baseNumber;

        }
        System.out.println(baseNumber + "^" + exponentNumber + ": " + total);
        scanner.close();
    }
}
