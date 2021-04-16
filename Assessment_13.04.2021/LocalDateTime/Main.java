package com.jodadatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
		LocalDate d1 = LocalDate.now();
		System.out.println("Show Today Date : " + d1);
		
		LocalDate d2 = LocalDate.of(1997, 05, 11);
		System.out.println("One Year Later : " + d2.plusMonths(12));
		
		LocalDate d3 = LocalDate.parse("1990-12-20",DateTimeFormatter.ISO_DATE);
		System.out.println(d3);
		
		LocalDateTime d4 = LocalDateTime.now();
		System.out.println("Show Today Date Time : " + d4);
		
		LocalDateTime d5 = LocalDateTime.of(1995, 05, 20, 15, 45);
		System.out.println("Add year : " + d5.plusYears(5));
	}
}
