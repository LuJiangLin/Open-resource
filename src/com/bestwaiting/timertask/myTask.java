package com.bestwaiting.timertask;

import java.util.Date;
import java.util.TimerTask;

/**
 * 
 * @author bestwaiting
 * �����Լ��Ķ�ʱ������
 */
public class myTask extends TimerTask {
	 @Override
     public void run() {
         System.out.println("ʱ��=" + new Date()); 
         //��������
     }
}