package com.javadatetoxmldatetime;

//Java program to Convert Java Date to XML DateTime String

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateToXmlDate {

	public static void main(String[] args)
	{
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat format2 = new SimpleDateFormat("HH:mm:ss");
		
		StringBuffer buff = new StringBuffer();
		Date date = new Date();
		
		buff.append(format1.format(date));
		buff.append('T');
		buff.append(format2.format(date));
		Calendar calendar = Calendar.getInstance();
		
		int offset = calendar.get(calendar.ZONE_OFFSET)
					/ (1000 * 60);
		if (offset < 0) {
			buff.append('-');
			offset *= -1;
		}
		else {
			buff.append('+');
		}
		String s1 = String.valueOf(offset / 60);
		
		for (int i = s1.length(); i < 2; i++) {
			buff.append('0');
		}
		buff.append(s1);
		buff.append(':');
		String s2 = String.valueOf(offset % 60);
		
		for (int i = s2.length(); i < 2; i++) {
			buff.append('0');
		}
		buff.append(s2);
		
		System.out.println(buff.toString());
	}
}
