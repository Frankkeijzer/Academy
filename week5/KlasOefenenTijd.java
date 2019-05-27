package oefeningen.week5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class KlasOefenenTijd {
	public static void main(String[] args) {
		LocalDateTime aDate = LocalDateTime.now();
		System.out.println(LocalTime.NOON);
		
		LocalDate date = LocalDate.of(2015, 05, 13);
		System.out.println(date.plus(Period.ofDays(8)));
		System.out.println(date);
		String even = date.toString();
		System.out.println(even);
		
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(LocalDate.now()));
		DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(LocalDate.now());
		
		
		
		DateTimeFormatter eigenformatter = DateTimeFormatter.ofPattern("dd MM yy");
		System.out.println(eigenformatter.format(LocalDate.now()));
		
//		StringBuilder SB1 = new StringBuilder("hallo");
//		System.out.println(SB1);
//		System.out.println(SB1.append(" doei"));
//		System.out.println(SB1);
	}
}
