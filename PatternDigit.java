
/*  Pattern print
        1
        12
        123
        1234
        12345
*/


public class PatternDigit {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
