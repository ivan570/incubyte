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
		
		return 0;
	}
}
