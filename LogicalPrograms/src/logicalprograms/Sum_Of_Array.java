package logicalprograms;

public class Sum_Of_Array {

	public static void main(String[] args) {
		int ar[] = {10,20,30,40,50};
		int sum = 0;
		
		for(int i=0; i<=ar.length-1; i++)
		//for(int i=ar.length-1; i>=0; i--)
		{
			sum = sum+ar[i];
		}
		System.out.println(sum);
	}
}
