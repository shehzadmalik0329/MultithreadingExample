package com.java.multithreading.example;

public class RunnableThreadWithException {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				throw new RuntimeException("Intentional Exception");
			}
		});
		
		thread.setName("Misbehaving Worker Thread");
		
		thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("A critical error occured in thread:"+t.getName()+" with exception: "+e.getMessage());
			}
		});
		
		thread.start();
	}

}
