package com.sc.test2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimerTask;

/**
 * �� TimerManager ��������棬���һ��Ҫע�� ʱ�������⡣������趨���賿2��ִ�����񡣵�������2���Ժ�
 *�����ĳ����������������������������£����������ִ�У������ǵȵ��ڶ�����賿2��ִ�С�Ϊ�ˣ������������
 *������ֻ���ж�һ�£�������������������ʱ�����ڶ�ʱִ�������ʱ�䣬���ڴ˻����ϼ�һ�졣
 * @author lu
 *
 */
public class NFDFlightDataTimerTask extends TimerTask{

	
	 private static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    @Override
	    public void run() {
	        try {
	             //������д��Ҫִ�е�����
	            System.out.println("ִ�е�ǰʱ��"+formatter.format(Calendar.getInstance().getTime()));
	        } catch (Exception e) {
	            System.out.println("-------------������Ϣ�����쳣--------------");
	        }
	    }
}
