const prompt = require('prompt-sync')();

const date = new Date();


const formatDateStyle = new Intl.DateTimeFormat('en-US', {
  year: 'numeric',
  month: 'short',
  day: '2-digit'
}).format(date);


//console.log(formatDateStyle); // Output: "May 19, 2024"



//const dateFormat = date.toLocaleDateString();


const random = Math.random();







//let formatDate = new formatDate ();



//const userInput = prompt('Enter your input: ');
//random = Math.floor(Math.random() * 7);



	const randomDaysAdded = 4
	const randomDaysAdded3 = 3 


	//int daysAddedForIrregularCircle = rando.nextInt(5);
	//int daysAddedForIrregularCirclePlusThree = rando.nextInt(3);

	//int daysAddedForFertilityPeriod = rando.nextInt(5);
	//int daysAddedForFertilityPeriodPlusThree = rando.nextInt(3);



	console.log(" ");

	const yourPreviousMensutralCircleDate = prompt("Enter the first date of your Circle (Day/Month/Year) : ");

	console.log(" ");


	console.log(" ");

	const  yourPreviousMensutralCircleDateLength = prompt("how long did your last menstural circle last(Days): ");

	console.log(" "); 

	
	/*
	System.out.println(" ");
	System.out.print("Enter the first date of your Circle (Day/Month/Year) : ");
	String yourPreviousMensutralCircleDate = input.nextLine();
	System.out.println(" ");

	System.out.printf("how long did your last menstural circle last: ") ;
	int yourPreviousMensutralCircleDateLength = input.nextInt();
	System.out.println(" ");
	*/



	
	//const myDateFormat = 'DD/MM/YYYY';

	//const todaysDate = new Date();







	const yourPreviousMensutralCircleDateFormated = new Date(yourPreviousMensutralCircleDate);

	const periodNextDate = new Date(yourPreviousMensutralCircleDateFormated.getTime() + (yourPreviousMensutralCircleDateLength * 24 * 60 * 60 * 1000));

	const safePeriod = new Date(yourPreviousMensutralCircleDateFormated.getTime() + (7 * 24 * 60 * 60 * 1000));






	const halfTheOvulationCircle = Math.floor(yourPreviousMensutralCircleDateLength/ 2);

	const ovulationDate = new Date(periodNextDate.getTime() - (halfTheOvulationCircle * 24 * 60 * 60 * 1000));


	const nextIregularmensturalDatePlus = new Date(periodNextDate.getTime() + (randomDaysAdded * 24 * 60 * 60 * 1000));
	const nextIregularmensturalDateMinus = new Date(periodNextDate.getTime() - (randomDaysAdded * 24 * 60 * 60 * 1000));


	let fertilityPeriodPlusIrregularities = new Date(ovulationDate.getTime() + (randomDaysAdded3 * 24 * 60 * 60 * 1000));
	let fertilityPeriodMinusIrregularities = new Date(ovulationDate.getTime() - (randomDaysAdded3 * 24 * 60 * 60 * 1000));









	console.log(`If Your next menstrual flow is Regular, your next menstrual circle should start ${periodNextDate}`);


	console.log('');

	console.log(`Your Next Ovulation Date Should be on ${ovulationDate}`);

	console.log('');


	console.log(`And If irregular, flow Should fall between ${nextIregularmensturalDateMinus} to ${nextIregularmensturalDatePlus}`);


	console.log('');
	console.log(`Your fertility Period should be between ${fertilityPeriodMinusIrregularities} to ${fertilityPeriodPlusIrregularities}`);

	console.log('');


	console.log(`Your Safest period is between ${yourPreviousMensutralCircleDateFormated} to ${safePeriod}`);

	console.log('');






	/*
	System.out.println("If Your next menstural flow is Regular, " + " \n" + " \n"  + "your next menstural circle should start " + periodNextDate.format(myDateFormat));
	System.out.println(" ");
	System.out.println("Your Next Ovulation Date Should be on " + ovulationDate.format(myDateFormat));
	System.out.println(" ");
	System.out.println("And If irregular," + " \n" + " \n"  + "flow Should fall between " + nextIregularmensturalDateMinus.format(myDateFormat) + " to " + nextIregularmensturalDatePlus.format(myDateFormat));
	System.out.println(" ");
	System.out.println("Your fertility Period should be between " +  fertilityPeriodMinusIrregularities.format(myDateFormat) + " to " + fertilityPeriodPlusIrregularities.format(myDateFormat));
	System.out.println(" ");
	System.out.println("Your Safest period is between " +  yourPreviousMensutralCircleDateFormated.format(myDateFormat) + " to " + safePeriod.format(myDateFormat));
	System.out.println(" ");
	*/








