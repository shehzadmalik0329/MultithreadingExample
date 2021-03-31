package com.java.multithreading.example;

public class ThreadInterruptExample01 {

	public static void main(String[] args) {
		Thread thread = new Thread(new ThreadInterrupt());
		
		thread.start();
		thread.interrupt();
	}
	
	private static class ThreadInterrupt implements Runnable{
		@Override
		public void run() {
			try {
				Thread.sleep(5000000);
			} catch (InterruptedException e) {
				System.out.println("Thread interrupted");
			}
		}
		
	}

}
