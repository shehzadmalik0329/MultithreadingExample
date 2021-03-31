package com.java.multithreading.example;

public class ThreadApplication {

	public static void main(String[] args) {
		Thread thread = new NewThread();
		System.out.println("We are in thread:"+Thread.currentThread().getName()+" with Id:"+Thread.currentThread().getId());
		thread.start();
	}
	
	private static class NewThread extends Thread{
		@Override
		public void run(){
			//Code that executes on the new thread
			System.out.println("We are in thread:"+Thread.currentThread().getName());
			System.out.println("We are in thread:"+this.getId());
		}
	}

}
