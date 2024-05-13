import java.time.Period;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;
public class AgeCalc2{
public static void main(String[] arg){


	Scanner input = new Scanner(System.in);


	String TodaysDate = new String();




	System.out.printf("Enter your date of birth in Day/Month/Year :  ");
	String dateOfBirth = input.nextLine();

	

	
	//System.out.print(periodBetween.getYears());

	System.out.println(ageCalcFunction(dateOfBirth));


	
}

public static String ageCalcFunction (String dateOfBirth){




	
	LocalDateTime todaysDateAndTime = LocalDateTime.now();
	

	DateTimeFormatter myDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	String myFirstTimeAndDateFormat = todaysDateAndTime.format(myDateFormat);


	LocalDate inputDob = LocalDate.parse(dateOfBirth,myDateFormat);


	Period periodBetween = Period.between(inputDob, todaysDateAndTime.toLocalDate());


	int age = periodBetween.getYears();

	int months = periodBetween.getMonths();



	String total = "age :"  +  age + "\n" + "months :" + months ;

	//return (age, (months));
	return total;


}





}