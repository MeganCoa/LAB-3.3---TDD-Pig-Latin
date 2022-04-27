import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(translate("Megan"));
		
	}
	public static String translate(String word) {
		if (!hasSpecialChar(word)) {
			word = translatorByWord(word);
			return word;
		}
		else {
			System.out.println("That word has special characters, we will return it as"
					+" is");
		return word;
		}
	}
	
	public static String lowercase(String word) {
		word = word.toLowerCase();
		
		return word;
	}
	public static Boolean isVowel(char c) {
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		String s = String.valueOf(c);
		String vs = new String(vowels);
		return vs.contains(s);
	}
	public static Boolean hasSpecialChar(String word) {
		
		char[] specialChars = { '@', '.', '-', '$', '^', '&', ':' };
		for (char c : specialChars) {
			for (char w : word.toCharArray()) {
				if (w == c) {
//					 System.out.println("That word has special characters, we will return it as"
//					+" is");
					return true;		
				}
			}
		}
	return false;
	}
	
	public static String translatorByWord(String word) {
		word = lowercase(word);
		String output = "placeholder";
		Boolean noVowels = true;
		for (char letter : word.toCharArray()) {
			if (isVowel(letter)) {
				noVowels = false;
			}
		}

		if (noVowels) {
			return word;
		}

		char firstLetter = word.toCharArray()[0];

		if (isVowel(firstLetter) == true) {
			output = word + "way"; 
		} else {
			int vowelIndex = -1;
			
			for (int j = 0; j <= word.length(); j++) { 
				if (isVowel(word.toCharArray()[j]) == true) {
					vowelIndex = j;
					break;
				}
			}

			String sub = word.substring(vowelIndex); 
			String postFix = word.substring(0, vowelIndex); 
															

			output = sub + postFix + "ay";
		}
		return output;
	}
}
