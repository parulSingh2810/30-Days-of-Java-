package com.accenture;

public class ThreadDemo extends Thread {
	 public void run() {
		 for(int i=0;i<5;i++) {
			 System.out.println(i);
			 try {
				 
				 Thread.sleep(1000);
			 }
			 catch(InterruptedException e){

				 		e.printStackTrace();
				 
			 }
		 }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo t1 = new ThreadDemo();
		ThreadDemo t2 = new ThreadDemo();
		
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread().getName());
		

	}

}
