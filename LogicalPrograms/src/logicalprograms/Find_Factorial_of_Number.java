package logicalprograms;

public class Find_Factorial_of_Number {

	public static void main(String[] args) {
		int num = 25; //4*3*2*1
		int fact = 1;
		
		for(int i=num;i>=1;i--) {
			fact = fact*i;
		}
		System.out.println(fact);
	}
}
