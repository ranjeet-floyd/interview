package arrays;

import java.util.Objects;

public class UniqueCharacter {
	/**
	 * Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
	 */

	public static void main(String[] args) {
		UniqueCharacter uniqueCharacter = new UniqueCharacter();
		String uniqueStr = "abcdef1234@#$";
		System.out.println("Must be Unique : " + uniqueCharacter.isUnique(uniqueStr));
		String notUnique = "abcc12345@";
		System.out.println("Must be not Unique : " + uniqueCharacter.isUnique(notUnique));


	}

	private boolean isUnique(String str) {
		Objects.requireNonNull(str, "input str must not be null");
		// total supported charater is 128.. if more than 128 then must be repetated.
		if (str.length() > 128) {
			return false;
		}
		boolean[] chars = new boolean[128];

		// store each char int value .. if encounter again return false.
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (chars[val]) {
				return false;
			} else {
				chars[val] = true;
			}
		}

		return true;

	}

}
