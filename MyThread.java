// Copyright: Ganesh Samarthyam, 2016; www.codeops.tech

class MyThread extends Thread {
	public void run() {
		System.out.println("In run method; thread name is: " 
			+ Thread.currentThread().getName());
	}
	public static void main(String args[])  {
		Thread myThread = new MyThread(); 
		myThread.run();
		System.out.println("In main method; thread name is: " 
			+ Thread.currentThread().getName());
	}
}
