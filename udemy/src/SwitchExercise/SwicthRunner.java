package SwitchExercise;

import java.util.Scanner;

public class SwicthRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your day number");
		int dayNo = sc.nextInt();
		System.out.println("Enter your month number");
		int monthNo = sc.nextInt();
		if (dayNo < 0) {
			System.out.println("Invalid Number");
		} else if (isWeekDay(dayNo)) {
			System.out.println("Its a Week Day");
		} else {
			System.out.println("Its a Week End");
		}

		System.out.println("Month Name : " + nameOfMonth(monthNo));
		System.out.println("Day Name : " + nameOfDay(dayNo));
		sc.close();
	}

	public static String nameOfMonth(int monthNo) {
		switch (monthNo) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return ("Invalid Input");
		}
	}

	public static String nameOfDay(int dayNo) {
		switch (dayNo) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		default:
			return ("Invalid Input");
		}
	}

	public static boolean isWeekDay(int dayNumber) {
		if (dayNumber < 6 && dayNumber > 0) {
			return true;
		}

		return false;
	}
}
