package oefeningen.OCA.package1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class OefenenTijd {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2019, 04, 14);
		System.out.println(date1);
		
		LocalDate date2 = LocalDate.now();
		System.out.println(date2);
		
		Period periode = Period.between(date1, date2);
		System.out.println(periode);
		
		
		DateTimeFormatter form = DateTimeFormatter.ISO_LOCAL_DATE;
		System.out.println(form);
		
		
		LocalDate date3 = date2.plusDays(5);
		System.out.println(date3);
		
		LocalDate dateFrank = LocalDate.of(1973, 9, 1);
//		LocalDate dateFrankNu = LocalDate.of(2019, 9, 1);

		LocalDate dateFrankNu = LocalDate.now();

		Period even = Period.between(dateFrank, dateFrankNu);
		System.out.println("Hier is het verschil: "+ even);
		
		String even2 = even.toString();
		System.out.println(even2);
		String even3 = even2.replace('P', ' ');
		
		System.out.println(even3);
		
		System.out.println();
		
		LocalDate dateChristofNu = LocalDate.of(2019, 5, 21);
		LocalDate dateChristof = LocalDate.of(2019, 5, 21);

		System.out.println("verjaardag Christof 2019: " + dateChristofNu.getDayOfWeek());
		System.out.println("geboortedag Christof 2010: " + dateChristof.getDayOfWeek());
		
		LocalDate nu = LocalDate.now();

		System.out.println(dateFrank.getDayOfWeek());
		System.out.println(dateFrankNu.getDayOfWeek());
	
	}
}
