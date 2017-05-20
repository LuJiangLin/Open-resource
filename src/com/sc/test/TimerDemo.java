package com.sc.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 定时执行任务（重复固定时间点执行）
 * @author lu
 * 2017.5.15
 */
public class TimerDemo {
	public static String getCurrentTime() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("main start:" + getCurrentTime());
        startTimer();
    }

    public static void startTimer() {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("task begin:" + getCurrentTime());
                try {
                    Thread.sleep(1000 * 20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("task   end:" + getCurrentTime());
            }
        };
        Timer timer = new Timer();
        timer.schedule(task, buildTime(), 1000 * 60 * 60 * 24);
    }

    private static Date buildTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 10);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 0);
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
