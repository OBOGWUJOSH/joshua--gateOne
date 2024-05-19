import java.time.Period;
import java.util.Random;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;
public class MensturalApp{
public static void main(String[] arg){



	Scanner input = new Scanner(System.in);


	Random rando = new Random ();
	int randomm = rando.nextInt(); 


	int daysAddedForIrregularCircle = rando.nextInt(5);
	int daysAddedForIrregularCirclePlusThree = rando.nextInt(3);

	int daysAddedForFertilityPeriod = rando.nextInt(5);
	int daysAddedForFertilityPeriodPlusThree = rando.nextInt(3);



	System.out.println(" ");
	System.out.print("Enter the first date of your Circle (Day/Month/Year) : ");
	String firstDayOfCircle = input.nextLine();
	System.out.println(" ");

	System.out.printf("how long did your last menstural circle last: ") ;
	int lastMensturalPeriodLength = input.nextInt();
	System.out.println(" ");







	DateTimeFormatter myDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	LocalDate todaysDate = LocalDate.now();
	




	LocalDate firstDayOfCircleFormated = LocalDate.parse(firstDayOfCircle,myDateFormat);

	LocalDate periodNextDate = firstDayOfCircleFormated.plusDays(lastMensturalPeriodLength);

	LocalDate safePeriod = firstDayOfCircleFormated.plusDays(7);

	//LocalDate nextmensturalDate = firstDayOfCircleFormated.plusDays(28);



	int halfTheOvulationCircle = lastMensturalPeriodLength/2;
	LocalDate ovulationDate = periodNextDate.minusDays(halfTheOvulationCircle);



	LocalDate nextIregularmensturalDatePlus = periodNextDate.plusDays(daysAddedForIrregularCirclePlusThree);
	LocalDate nextIregularmensturalDateMinus = periodNextDate.minusDays(daysAddedForIrregularCircle);


	LocalDate fertilityPeriodPlusIrregularities = ovulationDate.plusDays(daysAddedForFertilityPeriodPlusThree);
	LocalDate fertilityPeriodMinusIrregularities = ovulationDate.minusDays(daysAddedForFertilityPeriod);



	//System.out.println(myFirstTimeAndDateFormat);
	//System.out.println(firstDayOfCircleFormated);


	System.out.println("If Your next menstural flow is Regular, " + " \n" + " \n"  + "your next menstural circle should start " + periodNextDate.format(myDateFormat));
	System.out.println(" ");
	System.out.println("Your Next Ovulation Date Should be on " + ovulationDate.format(myDateFormat));
	System.out.println(" ");
	System.out.println("And If irregular," + " \n" + " \n"  + "flow Should fall between " + nextIregularmensturalDateMinus.format(myDateFormat) + " to " + nextIregularmensturalDatePlus.format(myDateFormat));
	System.out.println(" ");
	System.out.println("Your fertility Period should be between " +  fertilityPeriodMinusIrregularities.format(myDateFormat) + " to " + fertilityPeriodPlusIrregularities.format(myDateFormat));
	System.out.println(" ");
	System.out.println("Your Safest period is between " +  firstDayOfCircleFormated.format(myDateFormat) + " to " + safePeriod.format(myDateFormat));
	System.out.println(" ");







}
}
