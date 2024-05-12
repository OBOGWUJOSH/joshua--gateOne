inport java.time.period;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;
public class AgeCalculator{
public static void main(String[] arg){


	Scanner input = new Scanner(System.in);


	LocalTime todaysTime = LocalTime.now();
	LocalDate todaysDate = LocalDate.now();



	LocalDateTime todaysDateAndTime = LocalDateTime.now();


	DateTimeFormatter myDateFormat = DateTimeFormatter.ofPattern("dd/mm/yyyy");
	String myFirstTimeAndDateFormat = todaysDateAndTime.format(myDateFormat);


	String TodaysDate = new String ();


	System.out.printf("Enter your date of birth in Day/Month/Year : "  );
	String dateOfBirth = input.nextLine();



	int dobCharLength = dateOfBirth.length();
	char index2 = dateOfBirth.charAt(2);
	char index5 = dateOfBirth.charAt(5);


	int dateOfBirthToInteger = Integer.parseInt(dateOfBirth);

	int localDateToInt =  Integer.parseInt(myFirstTimeAndDateFormat);

	int ageFomInput = localDateToInt - dateOfBirthToInteger;




	if (dobCharLength == 10 && index2  == ('/') && index5  == ('/')){
  

		System.out.println("date of birth entered : ");
		System.out.println(ageFomInput);


	}else System.out.print("Wrong Age Format");
		
		








		/**
		System.out.println(todaysTime);
		System.out.println(todaysDateAndTime);
		System.out.println();
		**/


}

}