package logicalprograms;

public class Palindrome_String {

	public static void main(String[] args) {
		String palindrome = "madam";//radar, level
		String revpalindrome = "";
		
		for(int i=palindrome.length()-1; i>=0; i--) {
			revpalindrome = revpalindrome + palindrome.charAt(i);
		}
		System.out.println("Reverse Palindrome String = " + revpalindrome);
	}
}
