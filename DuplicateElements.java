
// Java Program to print the duplicate elements of an array.

import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {
        String[] myArray = new String[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 elements of Array");
        for (int i = 0; i < 10; i++) {
            myArray[i] = scan.nextLine();
        }
        extractDuplicates(myArray);
    }

    // Method to check an element for duplicates within an Array
    // prints the elements which are duplicate
    public static void extractDuplicates(String[] array) {
        System.out.println("The Duplicate elements in an array are: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    System.out.println(array[j]);
                }
            }
        }
    }
}
