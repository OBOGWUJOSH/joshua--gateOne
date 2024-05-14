import java.time.Period;
import java.util.Random;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;
public class MenstralApp{
public static void main(String[] arg){



	Scanner input = new Scanner(System.in);
	Random rando = new Random ();

	int randomm = rando.nextInt(); 

	int randommNumbers = rando.nextInt(7);




	System.out.print("Enter date your flow Ended (Day/Month/Year) :  ");
	String yourLastPeriod = input.nextLine();



	//System.out.printf("how long did the circle last:  ");
	//String forHowLong = input.nextLine();

	

	LocalDateTime todaysDate = LocalDateTime.now();
	DateTimeFormatter myDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	String myFirstTimeAndDateFormat = todaysDate.format(myDateFormat);


	
	LocalDate inputDateOfBirth = LocalDate.parse(yourLastPeriod,myDateFormat);



	LocalDate nextMenstralDate = inputDateOfBirth.plusDays(28);


	LocalDate nextIregularMenstralDate = inputDateOfBirth.plusDays(28).plusDays(randommNumbers);
	LocalDate nextIregularMenstralDateMinus = inputDateOfBirth.plusDays(28).minusDays(randommNumbers);

	LocalDate days28PlusRandom = LocalDate.parse(nextIregularMenstralDate,myDateFormat);
	LocalDate days28minusRandom = LocalDate.parse(nextIregularMenstralDateMinus,myDateFormat);



	LocalDate nextMenstralDatePlus10Days = inputDateOfBirth.plusDays(10);
	LocalDate nextMenstralDatePlus15Days = inputDateOfBirth.plusDays(15);
	




	//Period periodBetween = Period.between(inputDateOfBirth, todaysDate.toLocalDate());

	//int days = periodBetween.getDays();





	System.out.println("Next regular menstral flow is on " + nextMenstralDate);
	System.out.println("Next irregular menstral flow is on " + days28minusRandom + " or " + days28PlusRandom);
	System.out.println("Your fertility Period is from  " +  nextMenstralDatePlus10Days + " to " + nextMenstralDatePlus15Days);






}
}
