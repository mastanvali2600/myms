package com.example.demo.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {

	public static String formate(LocalDate date) {
		return date.format(DateTimeFormatter.ofPattern("dd-MM-YYYY"));
	}
}
