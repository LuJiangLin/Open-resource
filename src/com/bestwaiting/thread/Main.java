package com.bestwaiting.thread;

public class Main {
	public static void main(String[] args) {
		final long timeInterval = 1000;    
        Runnable runnable = new Runnable() {    
            public void run() {    
                while (true) {    
                    // task start。。。 
                    System.out.println("Hello !!");    
                    // task end。。。 
                    try {    
                        Thread.sleep(timeInterval);    
                    } catch (InterruptedException e) {    
                        e.printStackTrace();    
                    }    
                }    
            }    
        };    
        Thread thread = new Thread(runnable);    
        thread.start();    
	  }
}
