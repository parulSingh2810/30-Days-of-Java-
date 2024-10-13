package com.accenture;

public class RunnableDemo  implements Runnable {
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
		
		Thread t1=  new Thread(new RunnableDemo());
		Thread t2=  new Thread(new RunnableDemo());
		t1.start();
		t2.start();
		
		

	}

}
