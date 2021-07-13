package com.thread.sample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SequentialThread extends Thread{

	public static void main(String[] args) {
		
		ExecutorService thread=Executors.newFixedThreadPool(1);
		for (int i = 0; i < 10; i++) {
			thread.submit(new Runnable() {
				
				@Override
				public void run() {
					System.out.println("Hi");
					
				}
			});
			thread.submit(new Runnable() {
				
				@Override
				public void run() {
					
					
				}
			});
		}
		

		
	}

	
}
