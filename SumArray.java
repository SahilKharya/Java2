public class SumArray {
    public static void main(String[] args){
        int[] numArray = new int[5];
        int sum = 0;
        System.out.print("The Array generated : ");
        for(int i=0;i<5;i++) {
            numArray[i] = (int)(100*Math.random());
            System.out.print(numArray[i] + " ");
            sum+= numArray[i];
        }
        System.out.print("\nThe sum = "+sum);
    }
}
