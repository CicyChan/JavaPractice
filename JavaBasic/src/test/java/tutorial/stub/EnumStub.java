package tutorial.stub;

import tutorial.object.oriented.Day;

public class EnumStub {

	public Day day;

	public EnumStub(Day day) {
		this.day = day;
	}

	public void tellTtLikeItIs() {
		switch (day) {
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
}