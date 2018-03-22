import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner scaner = new Scanner(System.in);
        int numberOfCases = Integer.parseInt(scaner.nextLine());
        String[] arrayvalue = new String[numberOfCases];

        for (int i = 0; i < arrayvalue.length; i++) {
            arrayvalue[i] = (scaner.nextLine());
        }

        for (int i = 0; i < arrayvalue.length; i++) {
            int n = Integer.parseInt(arrayvalue[i]);

            if (isPrime(n)) {
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }
        }
    }

    static boolean isPrime(int number) {
        if (number == 1) return false;
        else if (number == 2) return true;
        else if (number % 2 == 0) {
            return false;
        } else {
            for (int i = 3; i * i <= number; i = i + 2) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
