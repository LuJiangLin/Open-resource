package com.bestwaiting.timertask;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class MyTimers {
	Map<String, Timer> timers=new HashMap<String, Timer>();
	Date myFirst;//定时器开始的时间
	public MyTimers() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour=calendar.get(Calendar.HOUR_OF_DAY);
        int minute=calendar.get(Calendar.MINUTE)+1;
        //设置执行时间
        calendar.set(year, month, day, hour, minute, 00);
        myFirst = calendar.getTime();
	}
	/**
	 * 添加相应的定时任务到定时器中，同时加入定时器集合
	 * @param taskLable 定时器标签
	 * @param task      定时任务
	 * @param period    间隔时间（频率）
	 */
	void addTask(String taskLable,TimerTask task, int period){
		Timer timer = new Timer();
		timer.schedule(task, myFirst, period);
		timers.put(taskLable, timer);
	}
	/**
	 * 添加相应的定时任务到定时器中，同时加入定时器集合
	 * @param taskLable 定时器标签
	 * @param task      定时任务
	 * @param first     定时器开启时间
	 * @param period    间隔时间（频率）
	 */
	void addTask(String taskLable,TimerTask task,Date first, int period){
		Timer timer = new Timer();
		timer.schedule(task, first, period);
		timers.put(taskLable, timer);
	}
	/**
	 * 将对应标签的定时器删除 
	 * @param taskLable 定时器标签
	 */
	void delTask(String taskLable){
		timers.get(taskLable).cancel();
		timers.remove(taskLable);
	}
}
