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
			// if string contain Alphabet than throw exception
			int temp;
			try {
				temp = Integer.parseInt(number);
			} catch (NumberFormatException exception) {
				throw new NumberFormatException("Alphabet not allowed");
			}
			// if temp less than zero return Exception
			// else add temp into `sum`
			if (temp < 0)
				throw new IllegalArgumentException("negatives not allowed");
			else
				sum += temp;

		}

		return sum;
	}
}
