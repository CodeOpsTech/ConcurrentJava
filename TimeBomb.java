// Copyright: Ganesh Samarthyam, 2016; www.codeops.tech

class TimeBomb extends Thread {
	String [] timeStr = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" }; 
	
	public void run() {
		for(int i = 9; i >= 0; i--) {
			System.out.println(timeStr[i]); 
		}
	}
	
	public static void main(String []s) {
		TimeBomb timer = new TimeBomb();
		System.out.println("Starting 10 second count down... ");
		timer.start();
		System.out.println("Boom!!!");
	}
}
