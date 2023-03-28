import java.util.Scanner;

class RemoveDuplicates {

	public static String removeDuplicates(char[] arr) {

		// Initialize an empty string
		String result = "";

		// iterate through the length of the array
		for (int i = 0; i < arr.length; i++) {

			// assign a boolean value
			boolean found = false;

			// for loop to go through the results
			for (int j = 0; j < result.length(); j++) {

				// condition to check for duplicates in the string
				if (arr[i] == result.charAt(j) && arr[i] != ' ')

					// if a duplicate was found no characters appended to result string
					found = true;
			}
			// if not found then no need to add duplicates to character string
			if (!found)

				// adding non duplicate characters to result string
				result += arr[i];
		}
		return result;
	}

	public static void main(String[] args) {

		// invoke a scanner object
		Scanner userInput = new Scanner(System.in);

		// user enters input
		System.out.print(" Enter your string: ");

		// converting input string to character array
		char[] stringOfChar = userInput.nextLine().toCharArray();

		userInput.close();

		// display the output
		System.out.println("\n The new string is: " + removeDuplicates(stringOfChar));
	}
}
