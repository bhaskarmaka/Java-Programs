package languagefundamentals;

public class EvenOddCount {

	public static void main(String[] args) {
		int EvenCount=0,OddCount=0;
		for(int i=200;i<=600;i++) {
			if(i%2==0) {
				EvenCount++;
			}
			else {
				OddCount++;
			}
		}
		System.out.println("Even Count: "+EvenCount);
		System.out.println("Odd Count: "+OddCount);
	}

}
