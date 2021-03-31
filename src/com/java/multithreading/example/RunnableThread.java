package com.java.multithreading.example;

public class RunnableThread {

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("We are in thread:"+Thread.currentThread().getName());
				System.out.println("Thread priority is:"+Thread.currentThread().getPriority());
			}
		});
		
		Thread thread2 = new Thread(new Task2());
		
		thread.setName("New Worker Thread");
		thread.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("We are in thread:"+Thread.currentThread().getName()+" before starting the thread");
		thread.start();
		System.out.println("We are in thread:"+Thread.currentThread().getName()+" after starting the thread");
		
//		Thread.sleep(10000);
	}
	
	public static class Task2 implements Runnable{
		@Override
		public void run() {
			System.out.println("Inside Task2");
		}
		
	}

}
