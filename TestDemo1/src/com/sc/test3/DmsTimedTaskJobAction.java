package com.sc.test3;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * ��������ʱ���� ʵ��ִ����
 * 
 * @author lu 
 * 
 */
public class DmsTimedTaskJobAction implements Job{

	 /**
	  * ���к�
	  */
	 private static final long serialVersionUID = 1427096854754L;
	 public DmsTimedTaskJobAction() throws Exception{
	  super();
	 }
	 /** 
	 * ������Ҫִ�еĶ�ʱ���񣬶�Ҫд�������������
	 */
	 public void execute(JobExecutionContext arg0) throws JobExecutionException {
	  System.out.println("=============================================================================================");
	  System.out.println(new SimpleDateFormat("yy��MM��dd�� hh:mm:ss").format(new Date()));
	  
	  try {
	   System.out.println("********֤�������ǰ����֪ͨ��ʱ����������********");
	   //������Ӿ�����Ҫִ�еķ������������ϵͳ�еķ���ȥ����
	   System.out.println("********֤�������ǰ����֪ͨ��ʱ����˳��������********");
	  } catch (Exception e) {
	   System.out.println("********֤�������ǰ����֪ͨ��ʱ����ִ��ʧ�ܣ�********");
	  }
	  System.out.println("=============================================================================================");
	  
	 }
	
	
	
	
	
	
	
	
}
