

	Scanner input = new Scanner(System.in);


	String TodaysDate = new String();




	System.out.printf("Enter your date of birth in Day/Month/Year :  ");
	String dateOfBirth = input.nextLine();

	



	
	LocalDateTime todaysDateAndTime = LocalDateTime.now();
	

	DateTimeFormatter myDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	String myFirstTimeAndDateFormat = todaysDateAndTime.format(myDateFormat);


	LocalDate inputDob = LocalDate.parse(dateOfBirth,myDateFormat);


	Period periodBetween = Period.between(inputDob, todaysDateAndTime.toLocalDate());


	int age = periodBetween.getYears();

	int months = periodBetween.getMonths();


	
	//System.out.print(periodBetween.getYears());

	System.out.println(ageCalcFunction(dateOfBirth));


	
}



	public static String ageCalcFunction (String dateOfBirth){





	String total = "age :"  +  age + "\n" + "months :" + months ;

	//return (age, (months));
	return total;


}





}