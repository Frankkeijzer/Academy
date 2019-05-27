package oefeningen.week4;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class even2 {
	public static void main(String[] args) {
		int even;
		String a = "leeg";
		String b = a.valueOf(6.0);
		System.out.println(b);
		//System.out.println(even);
		int ba = 2;
		
		a += a;
		System.out.println(a);
		
		ba += ba;
		System.out.println(ba);
		
		LocalDateTime time = LocalDateTime.now();
		
		System.out.println(time);
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDate.now());
		
		LocalDate date = LocalDate.parse("2019-09-01");
		System.out.println(date.getDayOfWeek());
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			int Even;
			//System.out.println(Even);
		}
	}
}
