package languagefundamentals;
import java.util.Scanner;

public class EvenOddBitwise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Num: ");
		int n=sc.nextInt();
		
//		if((n&1)==0)
//		{
//			System.out.println("Even");
//		}
//		else {
//			System.out.println("Odd");
//		}
		
		String result=((n&1)==0)?"Even":"Odd";
		System.out.println(result);
	}

}
