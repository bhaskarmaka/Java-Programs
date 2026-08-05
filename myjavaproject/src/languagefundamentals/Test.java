package languagefundamentals;

public class Test{
	
	int a,b;
	void add() {
		System.out.println(a+b);
	}
	
	void sub() {
		System.out.println(a-b);
	}
	
	void mul() {
		System.out.println(a*b);
	}
	
	void div() {
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.a=10;
		t.b=5;
		t.add();
		t.sub();
		t.mul();
		t.div();
	}

}
