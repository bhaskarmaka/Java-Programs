package languagefundamentals;

public class MaxNumTernary {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		int c=250;
		
//		int max=(a>b)?((a>c)?a:c):((b>c)?b:c);
//		System.out.println(max+" is maximum");
		
		String max=(a>b&&a>c)?"A is maximum":(b>c&&b>a)?"B is maximum":"C is maximum";
		System.out.println(max);
	}
}
