package com.bestwaiting.executorService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args) {
		Runnable runnable = new Runnable() {    
            public void run() {    
                // task code  
                System.out.println("Hello !!");    
            }    
        };    
        ScheduledExecutorService service = Executors    
                .newSingleThreadScheduledExecutor();    
        /**
         * �ڶ�������Ϊ�״�ִ�е���ʱʱ��
		 * ����������Ϊ��ʱִ�еļ��ʱ��
         */
        service.scheduleAtFixedRate(runnable, 10, 1, TimeUnit.SECONDS); 
	  }
}
