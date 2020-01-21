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
        char[] stringArray = input.toCharArray();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int j = 0; j < stringArray.length; j++) {
            for (int i = 0; i < vowels.length; i++) {
                if (stringArray[j] == vowels[i]) {
                    vowelCount++;
                    break;

                } else if (stringArray[j] >= 'a' && stringArray[j] <= 'z') {
                    consonantCount++;
                    break;
                }
            }
        }
        System.out.println("No. of Vowels : " + vowelCount);
        System.out.println("No. of Consonants : " + consonantCount);
    }
}
