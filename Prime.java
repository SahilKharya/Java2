import com.sun.jdi.request.ExceptionRequest;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int number = sc.nextInt();
            int temp = 0;
            if (number == 1)
                System.out.println("1 is not a prime number");
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    System.out.println("Number is not a prime number");
                    temp = 1;
                    break;
                }
            }
            if (temp == 0) {
                System.out.println("Number is a prime number");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

