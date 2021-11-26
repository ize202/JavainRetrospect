package FormattingOutput;
import java.text.*;

public class FormattingOutput {

	public static void main(String[] args) {
		
		double number = 438.978;
		double secondNumber = 1.3;
		double thirdNumber = 438978;
		DecimalFormat x = new DecimalFormat("##.##");
		System.out.println(x.format(number)); 
		System.out.println(x.format(secondNumber));
		System.out.println(x.format(thirdNumber));
		
		
	}

}
