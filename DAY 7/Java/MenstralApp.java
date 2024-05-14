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


	int randommNumbers7 = rando.nextInt(7);
	int randommNumbers3 = rando.nextInt(3);




	System.out.print("Enter date your last circle Ended (Day/Month/Year) :  ");
	String yourLastPeriod = input.nextLine();



	//System.out.printf("how long did the circle last:  ");
	//String forHowLong = input.nextLine();

	

	LocalDateTime todaysDate = LocalDateTime.now();
	DateTimeFormatter myDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");



	String myFirstTimeAndDateFormat = todaysDate.format(myDateFormat);


	
	LocalDate yourLastPeriodFormated = LocalDate.parse(yourLastPeriod,myDateFormat);


	LocalDate safePeriod = yourLastPeriodFormated.plusDays(7);


	LocalDate nextMenstralDate = yourLastPeriodFormated.plusDays(28);





	LocalDate nextIregularMenstralDatePlus = yourLastPeriodFormated.plusDays(28).plusDays(randommNumbers7);
	LocalDate nextIregularMenstralDateMinus = yourLastPeriodFormated.plusDays(28).minusDays(randommNumbers7);


	//LocalDate days28PlusRandom = LocalDate.parse(nextIregularMenstralDatePlus,myDateFormat);
	//LocalDate days28minusRandom = LocalDate.parse(nextIregularMenstralDateMinus,myDateFormat);



	LocalDate nextMenstralDatePlus10Days = yourLastPeriodFormated.plusDays(10);
	LocalDate nextMenstralDatePlus15Days = yourLastPeriodFormated.plusDays(15);
	




	//Period periodBetween = Period.between(inputDateOfBirth, todaysDate.toLocalDate());

	//int days = periodBetween.getDays();





	System.out.println("Average Date for Next regular menstral flow should starts on " + nextMenstralDate);
	System.out.println("if irregular menstral flow Should fall between " + nextIregularMenstralDateMinus + " to " + nextIregularMenstralDate);
	System.out.println("Your fertility Period should be between " +  nextMenstralDatePlus10Days + " to " + nextMenstralDatePlus15Days);
	System.out.println("Your Safest period is  " +  yourLastPeriodFormated + " to " + safePeriod);






}
}
