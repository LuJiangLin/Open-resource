package com.bestwaiting.timertask;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class MyTimers {
	Map<String, Timer> timers=new HashMap<String, Timer>();
	Date myFirst;//��ʱ����ʼ��ʱ��
	public MyTimers() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour=calendar.get(Calendar.HOUR_OF_DAY);
        int minute=calendar.get(Calendar.MINUTE)+1;
        //����ִ��ʱ��
        calendar.set(year, month, day, hour, minute, 00);
        myFirst = calendar.getTime();
	}
	/**
	 * �����Ӧ�Ķ�ʱ���񵽶�ʱ���У�ͬʱ���붨ʱ������
	 * @param taskLable ��ʱ����ǩ
	 * @param task      ��ʱ����
	 * @param period    ���ʱ�䣨Ƶ�ʣ�
	 */
	void addTask(String taskLable,TimerTask task, int period){
		Timer timer = new Timer();
		timer.schedule(task, myFirst, period);
		timers.put(taskLable, timer);
	}
	/**
	 * �����Ӧ�Ķ�ʱ���񵽶�ʱ���У�ͬʱ���붨ʱ������
	 * @param taskLable ��ʱ����ǩ
	 * @param task      ��ʱ����
	 * @param first     ��ʱ������ʱ��
	 * @param period    ���ʱ�䣨Ƶ�ʣ�
	 */
	void addTask(String taskLable,TimerTask task,Date first, int period){
		Timer timer = new Timer();
		timer.schedule(task, first, period);
		timers.put(taskLable, timer);
	}
	/**
	 * ����Ӧ��ǩ�Ķ�ʱ��ɾ�� 
	 * @param taskLable ��ʱ����ǩ
	 */
	void delTask(String taskLable){
		timers.get(taskLable).cancel();
		timers.remove(taskLable);
	}
}
