package JavaHard.Task1Maybe;

import java.util.Scanner;

public class ReverseInt {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean b = true;

        while(b) {
            System.out.println("Input numbers in 5 digits long");
            int number = scan.nextInt();
                String stringOfNumbers = String.valueOf(number);
                if (stringOfNumbers.length() != 5) {
                    System.out.println("ERROR: INPUT NUMBERS IS NOT DIGITS 5 long");
                } else {
                    b = false;
                    int reverseInt = 0;
                    int tmp = number;
                    while(tmp > 0) {
                        int rest = tmp % 10;
                        System.out.println(rest);
                        reverseInt = reverseInt * 10 + rest;
                        System.out.println("REVERSE " + reverseInt);
                        tmp = tmp / 10;
                        System.out.println(tmp);

                    }
                    if (number == reverseInt) {
                        System.out.println(number + " is palindrome");
                    } else {
                        System.out.println(number + " is not palindrome");
                    }
                }
            }
        scan.close();
    }
}
