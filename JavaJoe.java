package JavaJoe;

public class JavaJoe {

	public static void main(String[] args) {
		//Declaring Variables
		
		int i = 1;
		double money = 200;
		String dayOfWeek = "Monday";
		
		// Cost of shoes (including tax)
		int Cost = 30;
		double costOfShoes = (Cost * 1.15);
		
		// Area of ceiling
		int length = 12;
		int width = 7;
		int area = (length * width);
		
		// The total cost of paint needed for ceiling
		double costOfPaint = (area * 1.13);
		
		// liters of gas Joe got 
		double costOfGas = (36.40);
		double amountOfGasInLiters = (costOfGas/0.45);
		
		// Charity donation
		int charityDonation = (23);

//-------------------------------------------------------------------------------------------------------------------------
		
		// Loop that goes through each day 
		while (i <= 7) {
			i++;
			//conditional statements for goal completion each day 
			
			if (dayOfWeek == "Monday") {
				System.out.println("Monday");
				System.out.println("Joe bought shoes and he paid " + "$" + costOfShoes);
				System.out.println("Joe has " + "$" + (money - costOfShoes) + " left"); 
			}
			else if (dayOfWeek == "Tuesday") {
				System.out.println("Tuesday");
				System.out.println("The area of the ceiling is " + area + "m^2");
				
			}
			else if (dayOfWeek == "Wednesday") {
				 System.out.println("Wednesday");
				 System.out.println("Joe needs to pay " + "$" + costOfPaint);
				 System.out.println("Joe has " + "$" + (money - (costOfShoes + costOfPaint)) + " left"); 
			}
			else if (dayOfWeek == "Thursday") {
				System.out.println("Thursday");
				System.out.println("Joe got " + amountOfGasInLiters + "L" + " of gas");
				System.out.println("Joe has " + "$" + (money - (costOfShoes + costOfPaint + costOfGas)) + " left"); 
			}
			else if (dayOfWeek == "Friday") {
				System.out.println("Friday");	
				System.out.println("Nothing is happening today!");
			}
			else if (dayOfWeek == "Saturday") {
				System.out.println("Saturday");
				System.out.println("Joe has " + "$" + (money - (costOfShoes + costOfPaint +costOfGas + charityDonation)) + " left");
			}
			else if (dayOfWeek == "Sunday") {
				System.out.println("Sunday");
			}
		}
		
	}

}
