package main;

public class AddStringNumbers {
	public int add(String numbersStr) {
		if (numbersStr == null)
			throw new IllegalArgumentException("Null String is not allow");

		// trim the numbers to remove white space
		numbersStr = numbersStr.trim();

		// if string is empty return 0
		if (numbersStr.equals(""))
			return 0;

		// Spiting the numbers base on `,` | `\n' | ' ' | ';' to get numbers array
		String numbersArr[] = numbersStr.split("[\\s+,\\\\;\t\n]+");

		// checking length of array
		// if its one then return number it self
		if (numbersArr.length == 1)
			return Integer.parseInt(numbersArr[0]);

		int sum = 0;
		for (String number : numbersArr) {
			// converting string into number
			int temp = Integer.parseInt(number);

			// add temp into sum
			sum += temp;
		}

		return sum;
	}
}
