package test.java.oo.testCase;

import test.java.oo.Day;

public class EnumTest {
	
	public Day day;

	public EnumTest(Day day) {
		this.day = day;
	}
	
	public void tellTtLikeItIs(){
		switch(day){
		case MONDAY:
			System.out.println("Monday are bad.");
			break;
		case TUESDAY:
			System.out.println("TUESDAYs are bad.");
			break;
		case WEDNESDAY:
			System.out.println("WEDNESDAYs are bad.");
			break;
		case THURSDAY:
			System.out.println("THURSDAYs are bad.");
			break;
		case FRIDAY:
			System.out.println("Fridays are better.");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekend are best.");
			break;
			
		}
	}

	public static void main(String[] args) {
		EnumTest firstDay = new EnumTest(Day.MONDAY);
		
		firstDay.tellTtLikeItIs();
		
		EnumTest Thriday = new EnumTest(Day.WEDNESDAY);
		
		Thriday.tellTtLikeItIs();
		
		EnumTest seventhDay = new EnumTest(Day.SUNDAY);
		
		seventhDay.tellTtLikeItIs();
		

	}

}
