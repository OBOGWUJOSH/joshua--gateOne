from datetime import datetime, timedelta
import random

class MenstrualApp:
    def __init__(self):
        pass

    def main(self):
        # Your code here
        pass

if __name__ == "__main__":
    app = MenstrualApp()
    app.main()

randomm = random.randint(0, 2147483647)

numberAddedForHUmanFactor = 3



firstDayOfCircle = input("Enter the first date of your Circle (Day/Month/Year) : ")
last_Menstural_Cirle_Length = int(input("how long did your last menstural circle last: ")) 

	


daysAddedForIrregularCircle = random.randint(0, 4)

daysAddedForIrregularCirclePlusThree = random.randint(0, 2)

daysAddedForFertilityPeriod = random.randint(0, 4) 

daysAddedForFertilityPeriodPlusThree = random.randint(0, 2)




"""
Scanner input = new Scanner(System.in);

Random rando = new Random ();
int randomm = rando.nextInt(); 


int daysAddedForIrregularCircle = rando.nextInt(5);
int daysAddedForIrregularCirclePlusThree = rando.nextInt(3);

int daysAddedForFertilityPeriod = rando.nextInt(5);
int daysAddedForFertilityPeriodPlusThree = rando.nextInt(3);



System.out.println(" ");
System.out.print("Enter the first date of your Circle (Day/Month/Year) : ");
String yourLastPeriod = input.nextLine();
System.out.println(" ");

System.out.printf("how long did your last menstural circle last: ") ;
int last_Menstural_Cirle_Length = input.nextInt();
System.out.println(" ");
""";




my_date_format = "%d/%m/%Y"

todays_date = datetime.today().strftime(my_date_format)






"""
	
DateTimeFormatter myDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

LocalDate todaysDate = LocalDate.now();
"""





	
your_last_period_formated = datetime.strptime(firstDayOfCircle, my_date_format)

period_next_date = your_last_period_formated + timedelta(days = last_Menstural_Cirle_Length)

safe_period = your_last_period_formated + timedelta(days=7)


	



"""
LocalDate yourLastPeriodFormated = LocalDate.parse(yourLastPeriod,myDateFormat);

LocalDate periodNextDate = yourLastPeriodFormated.plusDays(last_Menstural_Cirle_Length);

LocalDate safePeriod = yourLastPeriodFormated.plusDays(7);
"""


	



half_the_ovulation_circle = last_Menstural_Cirle_Length // 2

ovulation_date = period_next_date - timedelta(days=half_the_ovulation_circle)

next_irregular_menstrual_date_plus = period_next_date + timedelta(days = 3)

next_irregular_menstrual_date_minus = period_next_date - timedelta(days= 3)

fertility_period_plus_irregularities = ovulation_date + timedelta(days = 3)

fertility_period_minus_irregularities = ovulation_date - timedelta(days = 3)






"""
int halfTheOvulationCircle = last_Menstural_Cirle_Length/2;
LocalDate ovulationDate = periodNextDate.minusDays(halfTheOvulationCircle);



LocalDate nextIregularmensturalDatePlus = periodNextDate.plusDays(daysAddedForIrregularCirclePlusThree);
LocalDate nextIregularmensturalDateMinus = periodNextDate.minusDays(daysAddedForIrregularCircle);


LocalDate fertilityPeriodPlusIrregularities = ovulationDate.plusDays(daysAddedForFertilityPeriodPlusThree);
LocalDate fertilityPeriodMinusIrregularities = ovulationDate.minusDays(daysAddedForFertilityPeriod);
"""




print()
print(f"If Your next menstrual flow is Regular, \n \n your next menstrual circle should start {period_next_date.strftime(my_date_format)}")
print()
print(f"Your Next Ovulation Date Should be on {ovulation_date.strftime(my_date_format)}")
print()
print(f"And If irregular, \n\nflow Should fall between {next_irregular_menstrual_date_minus.strftime(my_date_format)} to {next_irregular_menstrual_date_plus.strftime(my_date_format)}")
print()
print(f"Your fertility Period should be between {fertility_period_minus_irregularities.strftime(my_date_format)} to {fertility_period_plus_irregularities.strftime(my_date_format)}")
print()
print(f"Your Safest period is between {your_last_period_formated.strftime(my_date_format)} to {safe_period.strftime(my_date_format)}")
print()




"""

System.out.println("If Your next menstural flow is Regular, " + " \n" + " \n"  + "your next menstural circle should start " + periodNextDate.format(myDateFormat));
System.out.println(" ");
System.out.println("Your Next Ovulation Date Should be on " + ovulationDate.format(myDateFormat));
System.out.println(" ");
System.out.println("And If irregular," + " \n" + " \n"  + "flow Should fall between " + nextIregularmensturalDateMinus.format(myDateFormat) + " to " + nextIregularmensturalDatePlus.format(myDateFormat));
System.out.println(" ");
System.out.println("Your fertility Period should be between " +  fertilityPeriodMinusIrregularities.format(myDateFormat) + " to " + fertilityPeriodPlusIrregularities.format(myDateFormat));
	System.out.println(" ");
	System.out.println("Your Safest period is between " +  yourLastPeriodFormated.format(myDateFormat) + " to " + safePeriod.format(myDateFormat));
	System.out.println(" ");
"""








