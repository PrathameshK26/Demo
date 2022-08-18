package logicalprograms;

public class Find_NO_Of_Whitespaces {

	public static void main(String[] args) {
		String str = "P R A  T H A  M E S  H";
		int count = 0;
		
		for(int i=0; i<=str.length()-1; i++) {
			char ch = str.charAt(i);
			
			if(ch==' ') {
				count++;
			}
		}
		System.out.println("Number of Whitespaces " +count);
	}
}

