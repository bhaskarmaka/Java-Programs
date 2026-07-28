package com.javaintro;

public class GarbageCollectionDemo {
	void hello() {
		System.out.println("Hello!!");
//		4.Object inside method
		GarbageCollectionDemo obj=new GarbageCollectionDemo();
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called");
	}
	public static void main(String[] args) {
		GarbageCollectionDemo obj1 = new GarbageCollectionDemo();
		GarbageCollectionDemo obj2 = new GarbageCollectionDemo();
		GarbageCollectionDemo obj3=new GarbageCollectionDemo();
		
//		System.out.println(obj1);
//		System.out.println(obj2);
		
//		1.Nullifying object
		obj1 = null;
//		obj2 = null;
//		System.out.println(obj1);
//		System.out.println(obj2);
		
//		2.Reassigning object
        GarbageCollectionDemo obj4=new GarbageCollectionDemo();
        obj2=obj4;
        
//      3.Anonymous object
        new GarbageCollectionDemo().hello();
        
        System.gc(); 
        System.out.println(obj1);
		System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);
		                 
		   

		System.out.println("End of main method.");
	}

}
