package test.java.basic;

public class ControllFlow {

	public static void main(String[] args) {
		
		// if then else statement
		
		int score = 70 ;
		char grade ;
		
		if(score >= 90){
			grade  = 'A';
		}else if(score >= 80){
			grade = 'B';
		}else if (score >= 70 ){
			grade = 'C';
		}else if (score >= 60){
			grade = 'E';
		}else{
			grade = 'F';
		}
		
		System.out.println(grade);
		
		// Switch ase statement
		
		int monthNumber = 8 ;
		String month = null;
		
		switch (monthNumber){
			case 1 :
				month = "January";
				break;
			case 2 :
				month = "Febrary";
				break;
			case 3 :
				month = "March";
				break;
			case 4 :
				month = "April";
				break;
			case 5 :
				month = "May";
				break;
			case 6 :
				month = "June";
				break;
			case 7 :
				month = "July";
				break;
			case 8 :
				month = "August";
				break;
			case 9 :
				month = "September";
				break;
			case 10 :
				month = "October";
				break;
			case 11:
				month = "November";
				break;
			case 12:
				month = "December";
				break;
		}
		
		System.out.println(month);
		
		// use ArrayList
		java.util.ArrayList<String> futureMonths  = new java.util.ArrayList<String>();
		
		 switch (monthNumber) {
	         case 1:  futureMonths.add("January");
	         case 2:  futureMonths.add("February");
	         case 3:  futureMonths.add("March");
	         case 4:  futureMonths.add("April");
	         case 5:  futureMonths.add("May");
	         case 6:  futureMonths.add("June");
	         case 7:  futureMonths.add("July");
	         case 8:  futureMonths.add("August");
	         case 9:  futureMonths.add("September");
	         case 10: futureMonths.add("October");
	         case 11: futureMonths.add("November");
	         case 12: futureMonths.add("December");
	                  break;
	         default: break;
         }
		 
		 if(futureMonths.isEmpty()){
			 System.out.println("Invaild MonthNumber");
		 }else{
			 for(String mothName : futureMonths){
				System.out.println(mothName); 
			 }
		 }
		 
		 //while block
		 
		 int count = 0;
		 
		 while(count < 6){
			 count++;
			 System.out.println("Count is " + count);
		 }; 
		 
		 do{
			 count++;
			 System.out.println("Count is " + count);
			 
		 }while(count < 12);
		 
		 
		 //for Block
		 
		 for(byte index = 0 ; index < 10 ; index++){
			 System.out.println("Index is " + index);
		 }
		 
		 int[] collection = {1,2,3,4,5,6,7,8};
		 
		 for(int number : collection){
			 System.out.println("number is " + number);
		 }
	
	}
}
