package Bonus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bonus {
    public static char bonusMethod(boolean parameter) {
        if (parameter) {
            return 'a';
        } else {
            return 'b';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            boolean parameter = scanner.nextBoolean();
            System.out.println(bonusMethod(parameter));
        } catch (InputMismatchException e) {
            System.out.println('c');
        }

    }
}
