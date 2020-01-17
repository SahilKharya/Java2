// Java Program to remove all white spaces from a string without using replace().

public class EmptySpaces {
	public static void main(String[] args) {
		String text = "This is a Java Program to remove all white spaces from a String.";
		System.out.print(text);
		char[] c = removeSpaces(text);
		String noSpacesText = new String(c);
		System.out.print("\n\n" + noSpacesText);
	}

	// Method to make a Array without any blank spaces characters in it.
	public static char[] removeSpaces(String line) {
		char[] charArray = line.toCharArray();
		char[] newArray = new char[charArray.length];
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == " ".charAt(0)) {
				charArray[i] = charArray[i + 1];
				i++;
			}
			// System.out.print(charArray[i] + ",");
			newArray[i] = charArray[i];
		}
		return newArray;
	}
}
