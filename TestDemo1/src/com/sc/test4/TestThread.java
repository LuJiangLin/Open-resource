package com.sc.test4;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 定时器
 * (servlet+Timer)
 * @author lu
 * @time 2017.04.28
 * @version 5.15
 */

@SuppressWarnings("serial")
public class TestThread extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
			doPost(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	//定时任务
	public void init() throws ServletException{
		
		TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("task begin:" + getCurrentTime());
                try {
                	//需要执行的任务
                	
                	for (int i = 0; i < 10; i++) {
        				System.out.println("执行任务次数："+i);
        				
        			}
                	
                    Thread.sleep(1000 * 20);//延迟20秒再执行下一步
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("task end:" + getCurrentTime());
            }
        };
        Timer timer = new Timer();
        timer.schedule(task, buildTime(), 1000 * 60 * 60 * 24);
	}
	
	//获取当前时间
	public static String getCurrentTime() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }
	//设置固定执行时间，每日某时某分某秒执行一次
	private static Date buildTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 11);//时
        calendar.set(Calendar.MINUTE, 9);//分
        calendar.set(Calendar.SECOND, 0);//秒
        Date time = calendar.getTime();
        if (time.before(new Date())) {
            //若果当前时间已经是凌晨1点后，需要往后加1天，否则任务会立即执行。
            //很多系统往往系统启动时就需要立即执行一次任务，但下面又需要每天凌晨1点执行，怎么办呢？
            //很简单，就在系统初始化话时单独执行一次任务（不需要用定时器，只是执行那段任务的代码）
            time = addDay(time, 1);
        }
        return time;
    }
    private static Date addDay(Date date, int days) {
        Calendar startDT = Calendar.getInstance();
        startDT.setTime(date);
        startDT.add(Calendar.DAY_OF_MONTH, days);
        return startDT.getTime();
    }
	
	
	
		
}