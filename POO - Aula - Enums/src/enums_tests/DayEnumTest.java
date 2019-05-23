package enums_tests;

import static enumeracao.Day.FRIDAY;
import static enumeracao.Day.MONDAY;
import static enumeracao.Day.SATURDAY;
import static enumeracao.Day.SUNDAY;
import static enumeracao.Day.WEDNESDAY;

import enumeracao.Day;

public class DayEnumTest {
	Day day;

	public DayEnumTest(Day day) {
		this.day = day;
	}

	public void tellItLikeItIs() {
		switch (day) {
		case MONDAY:
			System.out.println("Mondays are bad.");
			break;

		case FRIDAY:
			System.out.println("Fridays are better.");
			break;

		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are best.");
			break;

		default:
			System.out.println("Midweek days are so-so.");
			break;
		}
	}

	public static void main(String[] args) {
		DayEnumTest firstDay = new DayEnumTest(MONDAY);
		firstDay.tellItLikeItIs();
		DayEnumTest thirdDay = new DayEnumTest(WEDNESDAY);
		thirdDay.tellItLikeItIs();
		DayEnumTest fifthDay = new DayEnumTest(FRIDAY);
		fifthDay.tellItLikeItIs();
		DayEnumTest sixthDay = new DayEnumTest(SATURDAY);
		sixthDay.tellItLikeItIs();
		DayEnumTest seventhDay = new DayEnumTest(SUNDAY);
		seventhDay.tellItLikeItIs();
	}
}
