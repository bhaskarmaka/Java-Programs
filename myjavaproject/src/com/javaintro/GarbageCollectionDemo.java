package com.javaintro;

public class GarbageCollectionDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCollectionDemo obj1 = new GarbageCollectionDemo();
		GarbageCollectionDemo obj2 = new GarbageCollectionDemo();
		
		obj1 = null;

		obj2 = new GarbageCollectionDemo();
		
        System.gc();                  
		Runtime.getRuntime().gc();    

		System.out.println("End of main method.");
	}

}
