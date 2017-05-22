package com.sc.tool;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 * 计算任意2个日期内的工作日（没有考虑到国定假日）
 * @author user
 *
 */
//对于任意2个日期比如：date_start=2006-10-1、date_end=2006-10-14 ，
//首先计算这连个日期之间的时间间隔（天数），然后分别对date_start 和date_end 取得它们下一个星期一的日期，
//这样就可以得到一个新的可以整除7的完整日期间隔（这个新的日期间隔已经把星期几的问题剔出掉了），换一种说法就是我们可以得到，
//这两个新的日期之间的周数，拿这个周数乘以5就是工作日期了（tmpWorkingDays）。但是这个日期并不是我们所要的日期，
//接下来我们要做的就是计算date_start,date_end这两个日期对于根据它们所产生的新的日期之间的时间偏移量，date_start的偏移量
//（date_start_change）是需要加的，而date_end的这个偏移量（date_end_change）是需要减去的。 最后我们只要用tmpWorkingDays+date_start_change-date_end_change就是我们所要求的实际工作日了。
//以下是所有实现代码（两个日期跨年也没有问题）。 
public class DateCal {

 /**
  * @param args
  */
 public static void main(String[] args) {
  try {

   String strDateStart = "2006-10-1";
   String strDateEnd = "2006-10-14";
   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
   Date date_start = sdf.parse(strDateStart);
   Date date_end = sdf.parse(strDateEnd);
   DateCal app = new DateCal();
   Calendar cal_start = Calendar.getInstance();
   Calendar cal_end = Calendar.getInstance();
   cal_start.setTime(date_start);
   cal_end.setTime(date_end);
   System.out.println("星期-->" + app.getChineseWeek(cal_start)
     + " 日期-->" + cal_start.get(Calendar.YEAR) + "-"
     + (cal_start.get(Calendar.MONTH) + 1) + "-"
     + cal_start.get(Calendar.DAY_OF_MONTH));
   System.out.println("星期-->" + app.getChineseWeek(cal_end) + " 日期-->"
     + cal_end.get(Calendar.YEAR) + "-"
     + (cal_end.get(Calendar.MONTH) + 1) + "-"
     + cal_end.get(Calendar.DAY_OF_MONTH));
   System.out.println("工作日为-->"
     + app.getWorkingDay(cal_start, cal_end));
   System.out.println("休息日-->"+app.getHolidays(cal_start, cal_end));
  } catch (Exception e) {
   // TODO: handle exception
  }
 }

 public int getDaysBetween(java.util.Calendar d1, java.util.Calendar d2) {
  if (d1.after(d2)) { // swap dates so that d1 is start and d2 is end
   java.util.Calendar swap = d1;
   d1 = d2;
   d2 = swap;
  }
  int days = d2.get(java.util.Calendar.DAY_OF_YEAR)
    - d1.get(java.util.Calendar.DAY_OF_YEAR);
  int y2 = d2.get(java.util.Calendar.YEAR);
  if (d1.get(java.util.Calendar.YEAR) != y2) {
   d1 = (java.util.Calendar) d1.clone();
   do {
    days += d1.getActualMaximum(java.util.Calendar.DAY_OF_YEAR);
    d1.add(java.util.Calendar.YEAR, 1);
   } while (d1.get(java.util.Calendar.YEAR) != y2);
  }
  return days;
 }

 /**
  * 计算2个日期之间的相隔天数
  * @param d1
  * @param d2
  * @return
  */
 public int getWorkingDay(java.util.Calendar d1, java.util.Calendar d2) {
  int result = -1;
  if (d1.after(d2)) { // swap dates so that d1 is start and d2 is end
   java.util.Calendar swap = d1;
   d1 = d2;
   d2 = swap;
  }

  int betweendays = getDaysBetween(d1, d2);

  
  int charge_date = 0;
  int charge_start_date = 0;//开始日期的日期偏移量
  int charge_end_date = 0;//结束日期的日期偏移量
   // 日期不在同一个日期内
   int stmp;
   int etmp;
   stmp = 7 - d1.get(Calendar.DAY_OF_WEEK);
   etmp = 7 - d2.get(Calendar.DAY_OF_WEEK);
   if (stmp != 0 && stmp != 6) {// 开始日期为星期六和星期日时偏移量为0
    charge_start_date = stmp - 1;
   }
   if (etmp != 0 && etmp != 6) {// 结束日期为星期六和星期日时偏移量为0
    charge_end_date = etmp - 1;
   }
//  }
  result = (getDaysBetween(this.getNextMonday(d1), this.getNextMonday(d2)) / 7)
    * 5 + charge_start_date - charge_end_date;
  //System.out.println("charge_start_date>" + charge_start_date);
  //System.out.println("charge_end_date>" + charge_end_date);
  //System.out.println("between day is-->" + betweendays);
  return result;
 }

 public String getChineseWeek(Calendar date) {
  final String dayNames[] = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五",
    "星期六" };

  int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);

  // System.out.println(dayNames[dayOfWeek - 1]);
  return dayNames[dayOfWeek - 1];

 }

 /**
  * 获得日期的下一个星期一的日期
  * 
  * @param date
  * @return
  */
 public Calendar getNextMonday(Calendar date) {
  Calendar result = null;
  result = date;
  do {
   result = (Calendar) result.clone();
   result.add(Calendar.DATE, 1);
  } while (result.get(Calendar.DAY_OF_WEEK) != 2);
  return result;
 } 
 
 /**
  * 
  * @param d1
  * @param d2
  * @return
  */
 public int getHolidays(Calendar d1,Calendar d2){
  return this.getDaysBetween(d1, d2)-this.getWorkingDay(d1, d2);
  
 }

}
 
