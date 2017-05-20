package com.sc.test4;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 生成交易流水号
 * @author lu
 * 2017.04.25
 */
public class orderNo {
	
	
	public static void main(String[] args) {
		 SimpleDateFormat fromat=new SimpleDateFormat("yyyyMMddHHmmssSS");
		 String time=fromat.format(new Date());
		 //生成交易流水号
		 time=time+(int)(Math.random()*100);
		 System.out.println(time);
	}

	
	
	
}
