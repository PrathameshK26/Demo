package logicalprograms;

public class ReversezString {
	public static void main(String[] args) {
		String s = "SDFG";
		String rev = "";
		
	for(int i = s.length()-1;i>=0;i--) {
		rev = rev + s.charAt(i);
	}
	System.out.println("Reversed String "+ rev);
	}
}
