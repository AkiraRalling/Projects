package JavaHard.Tasks5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean continueLoop = true;
        /**
         * This is a method which i use
         *
         * for training theme Exceptions
         *
         *
         */
        do {
            try {
                Scanner scan = new Scanner(System.in);

                int firstNum = scan.nextInt();
                int secondNum = scan.nextInt();

                System.out.println(showInfo(firstNum, secondNum));
                continueLoop = false;
            } catch (ArithmeticException | InputMismatchException e) {
                System.out.println("Please input non-zero value of non-symbol ");
                e.printStackTrace();
            }
        } while (continueLoop);
    }

    public static int showInfo(int first, int second) {

        return first / second;
    }
}
