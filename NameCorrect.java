import java.util.Scanner;

public class NameCorrect {
    public static void main(String[] args) {
        try {
            int vowelCount = 0;
            int consonantCount = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string : ");
            String input = sc.nextLine();
            System.out.println("\nCorrect name would be :");

            String[] name = input.split(" ");
            for (int i = 0; i <= name.length - 1; i++) {
                if (i != name.length - 1) {
                    name[i] = name[i].toUpperCase();
                    char firstLetter = name[i].charAt(0);
                    System.out.print(firstLetter + ". ");
                } else {
                    name[i] = name[i].toLowerCase();
                    char[] lastname = name[i].toCharArray();
                    lastname[0] = Character.toUpperCase(lastname[0]);
                    System.out.println(lastname);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
