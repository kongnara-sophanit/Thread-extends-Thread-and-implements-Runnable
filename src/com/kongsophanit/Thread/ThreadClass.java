package com.kongsophanit.Thread;

public class ThreadClass extends Thread {
	@Override
	public void run() {
		for(int i = 0 ; i < 10; i++){
			System.out.println(i);
			try {
				sleep(800);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		ThreadClass t = new ThreadClass();
		ThreadClass t1 = new ThreadClass();
		t.start();
		t1.start();
	}
}
