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




	System.out.print("Enter the first date of your period (Day/Month/Year) : ");
	String yourLastPeriod = input.nextLine();



	System.out.printf("how long did was your last period last: ") ;
	int forHowLong = input.nextInt();

	

	LocalDate todaysDate = LocalDate.now();
	//LocalDate localDate = LocalDate.format("dd/MM/yyyy");


	DateTimeFormatter myDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	//DateTimeFormatter myDateFormat2 = new DateTimeFormatter.ofPattern("dd/MM/yyyy");




	String myFirstTimeAndDateFormat = todaysDate.format(myDateFormat);


	

	LocalDate yourLastPeriodFormated = LocalDate.parse(yourLastPeriod,myDateFormat);

	LocalDate periodDays = yourLastPeriodFormated.plusDays(forHowLong);

	LocalDate safePeriod = yourLastPeriodFormated.plusDays(7);

	LocalDate nextMenstralDate = yourLastPeriodFormated.plusDays(28);





	LocalDate nextIregularMenstralDatePlus = yourLastPeriodFormated.plusDays(28).plusDays(randommNumbers7);
	LocalDate nextIregularMenstralDateMinus = yourLastPeriodFormated.plusDays(28).minusDays(randommNumbers7);


	

	LocalDate nextMenstralDatePlus10Days = yourLastPeriodFormated.plusDays(10);
	LocalDate nextMenstralDatePlus15Days = yourLastPeriodFormated.plusDays(15);
	



	//Period periodBetween = Period.between(inputDateOfBirth, todaysDate.toLocalDate());

	//int days = periodBetween.getDays();




	
	System.out.println(myFirstTimeAndDateFormat);
	System.out.println(yourLastPeriodFormated);


	System.out.println("Average Date for Next regular menstral flow should end " + nextMenstralDate.format(myDateFormat) );
	System.out.println("And If irregular,flow Should fall between " + nextIregularMenstralDateMinus.format(myDateFormat) + " to " + nextIregularMenstralDatePlus.format(myDateFormat) );
	System.out.println("Your fertility Period should be between " +  nextMenstralDatePlus10Days.format(myDateFormat) + " to " + nextMenstralDatePlus15Days.format(myDateFormat) );
	System.out.println("Your Safest period is between  " +  yourLastPeriodFormated.format(myDateFormat) + " to " + safePeriod.format(myDateFormat) );






}
}
