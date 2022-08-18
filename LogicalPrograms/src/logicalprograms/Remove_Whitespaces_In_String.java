package logicalprograms;

public class Remove_Whitespaces_In_String {

	public static void main(String[] args) {
		String str = "P r   a t   h a   m e   s h";
		
		str = str.replaceAll(" ", "");
		
		System.out.println(str);
		
		/*String str = "Prathamesh";
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);*/
	}
}
