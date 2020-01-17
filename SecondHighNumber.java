
public class SecondHighNumber {
    public static void main(String[] args) {
        int[] sortedArray = sortMaxArray(createArray());
        System.out.print("\n\nThe second highest value in array : " + sortedArray[1]);
    }

    //Method to create an Array with random elements.
    public static int[] createArray() {
        int[] numArray = new int[5];
        System.out.print("The Array generated : ");
        for (int i = 0; i < 5; i++) {
            numArray[i] = (int) (100 * Math.random());
            System.out.print(numArray[i] + " ");
        }
        return numArray;
    }

    //Method to sort the Array in Decreasing order
    public static int[] sortMaxArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
