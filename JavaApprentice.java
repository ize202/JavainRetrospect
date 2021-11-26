package JavaApprentice;
import java.lang.*;
import java.text.*;
import java.io.*;


public class JavaApprentice {

	public static void main(String[] args) {

         BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in)) ;

         System.out.println("Welcome To Trumpola inc.");
         
         String newLine = System.getProperty("line.separator");
            
         double value1 = 00.00;  
         double value2 = 00.00;        
         double value3 = 00.00;  
         double profit1  = 00.00;
         double profit2 = 00.00;
         double profit3 = 00.00;
         double profit4 = 00.00;
         double finalProfit = profit1 + profit2 + profit3 + profit4; 
         

         try

         {
        	 
          {
//First Department 
              System.out.println("Please Enter In Your Department Name: ");

              String firstDepartment = bufRead.readLine();

              System.out.println("Please Enter In The # of Employees: ");
              
              value1 = Double.parseDouble(bufRead.readLine());;

              System.out.println("Please Enter In The Cost Per Employee: ");         
              
              value2 = Double.parseDouble(bufRead.readLine());

              System.out.println("Please Enter In Sales: ");
              
              value3 = Double.parseDouble(bufRead.readLine());

              System.out.println("Your " + firstDepartment + ", Profit is:  " + "$" + (profit1 = value3 - value1 * value2));

              System.out.println(newLine);
 //Second Department
              
              System.out.println("Please Enter In Your Second Department Name: ");

              String secondDepartment = bufRead.readLine();

              System.out.println("Please Enter In The # of Employees: ");
              
              value1 = Double.parseDouble(bufRead.readLine());;

              System.out.println("Please Enter In The Cost Per Employee: ");         
              
              value2 = Double.parseDouble(bufRead.readLine());

              System.out.println("Please Enter In Sales: ");
              
              value3 = Double.parseDouble(bufRead.readLine());

              System.out.println("Your " + secondDepartment + ", Profit is:  " + "$" + (profit2 = value3 - value1 * value2));

              System.out.println(newLine);
  //Third Department

              System.out.println("Please Enter In Your Third Department Name: ");

              String thirdDepartment = bufRead.readLine();

              System.out.println("Please Enter In The # of Employees: ");
              
              value1 = Double.parseDouble(bufRead.readLine());;

              System.out.println("Please Enter In The Cost Per Employee: ");         
              
              value2 = Double.parseDouble(bufRead.readLine());

              System.out.println("Please Enter In Sales: ");
              
              value3 = Double.parseDouble(bufRead.readLine());

              System.out.println("Your " + thirdDepartment + ", Profit is:  " + "$" + (profit3 = value3 - value1 * value2));
              
              System.out.println(newLine);
  //Fourth Department 
              
              System.out.println("Please Enter In Your Fourth Department Name: ");

              String fourthDepartment = bufRead.readLine();

              System.out.println("Please Enter In The # of Employees: ");
              
              value1 = Double.parseDouble(bufRead.readLine());;

              System.out.println("Please Enter In The Cost Per Employee: ");         
              
              value2 = Double.parseDouble(bufRead.readLine());

              System.out.println("Please Enter In Sales: ");
              
              value3 = Double.parseDouble(bufRead.readLine());

              System.out.println("Your " + fourthDepartment + ", Profit is:  " + "$" + (profit4 = value3 - value1 * value2));
              
              System.out.println(newLine);
  
   //All Departments
              System.out.println("Please Press Enter For Your Final Profit!");
              
              String firstEnter = bufRead.readLine();
              
             
              System.out.println("Hello, Donaldio. Your Final Financial Profit of all Departments are: " + "$" + finalProfit);

          }

         }

         catch (IOException err) {

              System.out.println("Error reading line");

         }

         catch(NumberFormatException err) {

              System.out.println("Error Converting Number");


         }

	}

}



