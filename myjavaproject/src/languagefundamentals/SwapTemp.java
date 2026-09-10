package languagefundamentals;
import java.util.*;
public class SwapTemp {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a,b values: ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("A value before: "+a);
		System.out.println("B value before: "+b);
		
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("A value after: "+a);
		System.out.println("B value after: "+b);
				
	}

}
