package com.kongsophanit.ThreadImplementRunnable;

public class EmplementRunnable implements Runnable {

	@Override
	public void run() {
		for(int i = 0 ; i <= 10 ; i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(new EmplementRunnable());
		Thread t2 = new Thread(new EmplementRunnable());
		t1.start();
		t2.start();
	}

}
