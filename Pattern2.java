// Print pattern
/*
                 1
                232
               34543
              4567654
             567898765
*/


public class Pattern2 {
    public static void main(String[] args) {
        int k = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            int c = k;
            for (k = 1; k <= i + 1; k++) {
                System.out.print(c);
                c++;
            }
            c--;
            for (int m = 1; m < i + 1; m++) {
                c--;
                System.out.print(c);
            }
            System.out.println();
        }
    }
}

