package com.bestwaiting.timertask;

public class Main {
	public static void main(String[] args) {
		myTask task=new myTask();
		MyTimers timers=new MyTimers();
		timers.addTask("12", task, 10*1000);
	  }
}
