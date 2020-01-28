// to count total number of vowels and consonants

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        int vowelCount = 0;
        int consonantCount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String input = sc.nextLine();
        input = input.toLowerCase();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (int j = 0; j < input.length(); j++) {
            for (int i = 0; i < vowels.length; i++) {

                if (input.charAt(j) == vowels[i]) {
                    vowelCount++;
                }

            }
            if (input.charAt(j) >= 'a' && input.charAt(j) <= 'z') {
                consonantCount++;
            }


        }
        consonantCount = consonantCount-vowelCount;
        System.out.println("No. of Vowels : " + vowelCount);
        System.out.println("No. of Consonants : " + consonantCount);
    }
}
