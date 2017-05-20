package com.bestwaiting.timertask;

import java.util.Date;
import java.util.TimerTask;

/**
 * 
 * @author bestwaiting
 * 创建自己的定时器任务
 */
public class myTask extends TimerTask {
	 @Override
     public void run() {
         System.out.println("时间=" + new Date()); 
         //任务流程
     }
}