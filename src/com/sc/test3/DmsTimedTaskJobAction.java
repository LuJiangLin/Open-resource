package com.sc.test3;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * 描述：定时任务 实体执行类
 * 
 * @author lu 
 * 
 */
public class DmsTimedTaskJobAction implements Job{

	 /**
	  * 序列号
	  */
	 private static final long serialVersionUID = 1427096854754L;
	 public DmsTimedTaskJobAction() throws Exception{
	  super();
	 }
	 /** 
	 * 所有需要执行的定时任务，都要写在这个方法体内
	 */
	 public void execute(JobExecutionContext arg0) throws JobExecutionException {
	  System.out.println("=============================================================================================");
	  System.out.println(new SimpleDateFormat("yy年MM月dd日 hh:mm:ss").format(new Date()));
	  
	  try {
	   System.out.println("********证书过期提前短信通知定时任务启动！********");
	   //这里添加具体需要执行的方法，这里把我系统中的方法去掉了
	   System.out.println("********证书过期提前短信通知定时任务顺利结束！********");
	  } catch (Exception e) {
	   System.out.println("********证书过期提前短信通知定时任务执行失败！********");
	  }
	  System.out.println("=============================================================================================");
	  
	 }
	
	
	
	
	
	
	
	
}
