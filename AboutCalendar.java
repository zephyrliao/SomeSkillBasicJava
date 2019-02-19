package tuning;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class AboutCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date now = new Date();
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(now);
		

		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
		
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int weekOfMonth =calendar.get(Calendar.WEEK_OF_MONTH);
		int weekOfYear =calendar.get(Calendar.WEEK_OF_YEAR);
		int dayOfWeekInMonth = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		
	/*	System.out.println("年份："+year);
		System.out.println("月份："+month);
		System.out.println("日："+dayOfMonth);
		System.out.println("时："+hourOfDay);        
		System.out.println("分："+minute);
		System.out.println("秒："+second);
		
		
		System.out.println("星期："+dayOfWeek);
		System.out.println("这个月"+month+"月的第"+weekOfMonth+"周");
		System.out.println("这年"+year+"年的第"+weekOfYear+"周");
		
		System.out.println(dayOfWeekInMonth);*/
		
		calendar.add(Calendar.MONTH, 1);
		System.out.println(calendar.get(Calendar.MONTH));
		
		
		
	}
	
	
	
	
	public static String gregroCalenderSetDate() {
		
		Calendar calendar = new GregorianCalendar(2018, 11, 2, 9, 50, 58);
		
		Calendar calendar2 = new GregorianCalendar();
		/**
		 * 一次设置
		 */
//		calendar2.set(2018, 11, 2, 9, 50, 58);
		
		/**
		 * 分别设定日期
		 */
		calendar2.set(Calendar.YEAR, 2018);
		calendar2.set(Calendar.MONTH,11);
		calendar2.set(Calendar.DAY_OF_MONTH,2);
		calendar2.set(Calendar.HOUR_OF_DAY,9);
		calendar2.set(Calendar.MINUTE,9);
		calendar2.set(Calendar.SECOND,58);
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
		
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int weekOfMonth =calendar.get(Calendar.WEEK_OF_MONTH);
		int weekOfYear =calendar.get(Calendar.WEEK_OF_YEAR);
		int dayOfWeekInMonth = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		
//		calendar2.add(Calendar.MONTH, 1);
		return null;
	}
	
	public static boolean 

}
