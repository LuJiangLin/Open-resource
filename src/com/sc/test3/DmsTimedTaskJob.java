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
* @TODO ��ʱ���������
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
	    //ͨ��SchedulerFactory����ȡһ��������
	        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
	        Scheduler scheduler;
	 try {
	 scheduler = schedulerFactory.getScheduler();
	  
	        //������ҵ����
	        JobDetail jobDetail =  new JobDetail("jobDetail-s1", "jobDetailGroup-s1", DmsTimedTaskJobAction.class);
	         //newһ��������
	        SimpleTrigger simpleTrigger = new SimpleTrigger("simpleTrigger", "triggerGroup-s1");
	        CronTrigger trigger =  new CronTrigger("Test", null, "0 0 9 * * ?");  //��ʾÿ��9��ִ��
	        //������ҵ����ʱ��
	        long ctime = System.currentTimeMillis()+1000*30;  //��ʾ30��֮������ ����ʱ��1000*5
	        simpleTrigger.setStartTime(new Date(ctime));
	        Calendar cal = Calendar.getInstance();   
	        trigger.setStartTime(cal.getTime());  
	        //������ҵִ�м�� 
	        //simpleTrigger.setRepeatInterval(1000*18000); //���ó�ÿ��5��Сʱ����һ��18000 ����ʱ��300
	        //������ҵִ�д���
	        simpleTrigger.setRepeatCount(-1);  //����ʱ��10��-1��ʾ���޴�
	       
	        //������ҵִ�����ȼ�Ĭ��Ϊ5
	       // simpleTrigger.setPriority(10);
	         
	        //��ҵ�ʹ��������õ���������
	        scheduler.scheduleJob(jobDetail, trigger);
	        
	        //����������
	        scheduler.start();
	  } catch (SchedulerException e) {
	   System.out.println("������ʱ����ʧ�ܣ�");
	  }
	 }
	 public void contextInitialized(ServletContextEvent arg0) {
	  System.out.println("����������");
	  try {
	   test();
	  } catch (Exception e) {
	   e.printStackTrace();
	  }
	 }
	 
	 public void contextDestroyed(ServletContextEvent arg0) {
	    System.out.println("�رմ�����");
	 }
	*/
	
	
	
	
	
	
	
	
	
	
}
