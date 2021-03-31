package com.java.multithreading.example;

import java.math.BigInteger;

public class ThreadInterruptExample02 {

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new ThreadInterrupt02(new BigInteger("2000000"), new BigInteger("10000000000")));
		thread.setDaemon(true);
		thread.start();
		Thread.sleep(1000);
		thread.interrupt();
		
	}
	
	private static class ThreadInterrupt02 implements Runnable{
		BigInteger base;
		BigInteger power;
		
		public ThreadInterrupt02(BigInteger base, BigInteger power) {
			this.base = base;
			this.power = power;
		}

		@Override
		public void run() {
			System.out.println(this.base+"^"+this.power+"="+pow(base,power));
		}
		
		private BigInteger pow(BigInteger base, BigInteger power){
			BigInteger result = BigInteger.ONE;
			
			for(BigInteger i = BigInteger.ZERO; i.compareTo(power) != 0; i = i.add(BigInteger.ONE)){
//				if(Thread.currentThread().isInterrupted()){
//					System.out.println("Prematurely Interrupted");
//					return BigInteger.ZERO;
//				}
				result = result.multiply(base);
			}
			return result;
		}
		
	}

}
