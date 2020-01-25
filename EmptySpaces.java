// Java Program to remove all white spaces from a string without using replace().

public class EmptySpaces {
	public static void main(String[] args) {
		String text = "This  is Java   Program to     Remove blank spaces.    ";
		System.out.print(text);
		String noSpacesText = removeSpaces(text);;
		System.out.print("\n\n" + noSpacesText);
	}

	// Method to make a Array without any blank spaces characters in it.
	public static String removeSpaces(String line) {
		char[] charArray = line.toCharArray();
		String newArray = "";
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == " ".charAt(0)) {
				i++;
			}
			else{
				newArray = newArray + charArray[i];
			}
		}
		return newArray;
	}
}
