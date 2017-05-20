package com.sc.test3;

import java.util.Calendar;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleTrigger;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.triggers.CoreTrigger;

import com.sc.test3.DmsTimedTaskJobAction;
/**
* @author lu
* @TODO 定时任务控制类
*
*/
public class DmsTimedTaskJob implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	 /*@SuppressWarnings("unused")
	 private static final SimpleTrigger CronTrigger = null;
	 
	 
	 public  void test() throws Exception{
	    //通过SchedulerFactory来获取一个调度器
	        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
	        Scheduler scheduler;
	 try {
	 scheduler = schedulerFactory.getScheduler();
	  
	        //引进作业程序
	        JobDetail jobDetail =  new JobDetail("jobDetail-s1", "jobDetailGroup-s1", DmsTimedTaskJobAction.class);
	         //new一个触发器
	        SimpleTrigger simpleTrigger = new SimpleTrigger("simpleTrigger", "triggerGroup-s1");
	        CronTrigger trigger =  new CronTrigger("Test", null, "0 0 9 * * ?");  //表示每天9点执行
	        //设置作业启动时间
	        long ctime = System.currentTimeMillis()+1000*30;  //表示30秒之后启动 测试时用1000*5
	        simpleTrigger.setStartTime(new Date(ctime));
	        Calendar cal = Calendar.getInstance();   
	        trigger.setStartTime(cal.getTime());  
	        //设置作业执行间隔 
	        //simpleTrigger.setRepeatInterval(1000*18000); //设置成每天5个小时提醒一次18000 测试时用300
	        //设置作业执行次数
	        simpleTrigger.setRepeatCount(-1);  //测试时用10，-1表示无限次
	       
	        //设置作业执行优先级默认为5
	       // simpleTrigger.setPriority(10);
	         
	        //作业和触发器设置到调度器中
	        scheduler.scheduleJob(jobDetail, trigger);
	        
	        //启动调度器
	        scheduler.start();
	  } catch (SchedulerException e) {
	   System.out.println("启动定时任务失败！");
	  }
	 }
	 public void contextInitialized(ServletContextEvent arg0) {
	  System.out.println("启动触发器");
	  try {
	   test();
	  } catch (Exception e) {
	   e.printStackTrace();
	  }
	 }
	 
	 public void contextDestroyed(ServletContextEvent arg0) {
	    System.out.println("关闭触发器");
	 }
	*/
	
	
	
	
	
	
	
	
	
	
}
