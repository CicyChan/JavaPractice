package test.java.oo.testCase;

public class LocalClassExampleTest {
	
	public static String regularExpresstion = "[^0-9]";
	
	public static void validatePhoneNumber(String phoneNumber1, String phoneNumber2){
		final int numberLength = 10;
		
		class PhoneNumber {
			String formattedPhoneNumber = null;
			
			PhoneNumber(String phoneNumber){
				String currentNumber = phoneNumber.replaceAll(regularExpresstion, "");
				
				if(currentNumber.length() == numberLength){
					formattedPhoneNumber = currentNumber;
				}else{
					formattedPhoneNumber = null;
				}
			}
			
			public String getNumber(){
				return this.formattedPhoneNumber;
			}
		}
		
		PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
		PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);
		
		if(myNumber1.getNumber() == null){
			System.out.println("Invalid Phone Number");
		}else{
			System.out.println("PhoneNumber is " + myNumber1.getNumber());
		}
		
		if(myNumber2.getNumber() == null){
			System.out.println("Invalid Phone Number");
		}else{
			System.out.println("PhoneNumber is " + myNumber2.getNumber());
		}
	}

	public static void main(String[] args) {
		LocalClassExampleTest.validatePhoneNumber("123-456-7890", "456-7890");
	}

}
