//Java Program to sort the elements of an array in ascending order
public class AscendArray {
    public static void main(String[] args) {
        int[] sortedArray = sortArray(createArray());
        System.out.print("\n\nThe array in ascending order : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(sortedArray[i] + " ");
        }
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

    //Method to sort the Array in Ascending order
    public static int[] sortArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;		//sorted array
    }
}
