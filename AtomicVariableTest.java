// Copyright: Ganesh Samarthyam, 2016; www.codeops.tech

import java.util.concurrent.atomic.*;

// Class to demonstrate how incrementing "normal" (i.e., thread unsafe) integers and incrementing 
// "atomic" (i.e., thread safe) integers are different: Incrementing a shared Integer object without locks can result 
// in a data race; however, incrementing a shared AtomicInteger will not result in a data race.   

class AtomicVariableTest {
	// Create two integer objects – one normal and another atomic –  with same initial value 
	private static Integer integer = new Integer(0); 
	private static AtomicInteger atomicInteger = new AtomicInteger(0);
	
	static class IntegerIncrementer extends Thread {
		public void run() {
			++integer;
		}
	}
	static class AtomicIntegerIncrementer extends Thread {
		public void run() {
			atomicInteger.incrementAndGet();
		}
	}
	public static void main(String []args) {
		// create three threads each for incrementing atomic and "normal" integers 
		for(int i = 0; i < 10; i++) {
			new IntegerIncrementer().start(); 
			new AtomicIntegerIncrementer().start();
		}
		System.out.printf("final int value = %d and final AtomicInteger value = %d", 
			integer, atomicInteger.intValue()); 
	}
}
