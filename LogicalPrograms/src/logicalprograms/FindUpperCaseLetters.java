package logicalprograms;

public class FindUpperCaseLetters {
	/*
	static {
		System.out.println("dfajfhsgfj");
	}
	public static void main(String[] args) {
		System.out.println("hsgh");
	}*/
	
	public static void main(String[] args) {
	String str = "AUTOmaTion";
	
	for(int i=0; i<str.length(); i++) {
		if(Character.isUpperCase(str.charAt(i))) {
			System.out.print(str.charAt(i));
		}
		
	}
}
}
