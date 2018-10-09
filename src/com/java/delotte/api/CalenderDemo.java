package com.java.delotte.api;
import java.util.Calendar;

public class CalenderDemo {

	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1.get(Calendar.DAY_OF_MONTH));
		System.out.println(c1.get(Calendar.DATE));
		System.out.println(c1.get(Calendar.DAY_OF_YEAR));
		System.out.println(c1.get(Calendar.HOUR_OF_DAY));
		System.out.println(c1.get(Calendar.MONTH));
		
		c1.set(Calendar.DAY_OF_YEAR, c1.get(Calendar.DAY_OF_MONTH)+72);
		System.out.println(c1.get(Calendar.DAY_OF_MONTH));
		System.out.println(c1.get(Calendar.DATE));
		System.out.println(c1.get(Calendar.DAY_OF_YEAR));
		System.out.println(c1.get(Calendar.HOUR_OF_DAY));
		System.out.println(c1.get(Calendar.MONTH));
		// TODO Auto-generated method stub

	}

}
