import java.util.Arrays;
import java.util.Scanner;
	public class CreditCardScanner{
	public static void main(String[] args){
 

	Scanner input = new Scanner(System.in);

	int count = 0;
	
	int counter = 0;
	int counter2 = 0;

	int lengthOfString = 0;

	String creditcardnumber;
	
	int stringtoIndex0 = 0;
	
	int stringtoIndex1 = 0;

	int calcDoubleNumber = 0;

	int sumOfDoubledNumber8 = 0;
	int sumOfOddNumbers8 = 0;
	

		System.out.println("Kindly input your Card details for Validation:  ");
		creditcardnumber = input.nextLine();





		lengthOfString = creditcardnumber.length();

		int [] ArrayOfcreditcardnumber = new int [lengthOfString];
	
		

			if (lengthOfString ==13 || lengthOfString ==16){

				System.out.println("card length:" + lengthOfString );
			}

			
			else 
			System.out.println("invalid card length");

		
		




		for (int x = 0; x < lengthOfString; x++){

		stringtoIndex0 = creditcardnumber.charAt(0) - '0';
		stringtoIndex1 = creditcardnumber.charAt(1) - '0';	

		}count++;
			
		
System.out.println("*************************************************************************************************************************************");


			if (stringtoIndex0 == 4){

				System.out.println("***Card Type: "+"Visa Card.");
			}

			else
			if (stringtoIndex0 == 5){

				System.out.println("***Card Type: "+"Master Card.");
			}

			else
			if (stringtoIndex0 == 6){

				System.out.println("***Card Type: "+"Discover Card.");
			}

			else
			if (stringtoIndex0 == 3 && stringtoIndex1 == 7){

				System.out.println("Card Type: "+"American Express Card.");
			}	

			else {System.out.printf("Card Type: "+"Invalid card.");}




		System.out.println(creditcardnumber);


		int sumOfCardNumber = 0;

		int [] stringtoIndex12 = new int[lengthOfString];
		int [] stringtoIndex15 = new int[lengthOfString];


		int [] multiplicationOfstringtoIndex12 = new int [lengthOfString];
		int [] multiplicationOfstringtoIndex15 = new int [lengthOfString];












		for (int x = lengthOfString-2 ; x >= 0; x-=2){
			

			stringtoIndex12[counter] = creditcardnumber.charAt(x) - '0';
			counter+=1;

		}



		for (int x = lengthOfString-1; x >= 0; x-=2){

			stringtoIndex15[counter2] = creditcardnumber.charAt(x) - '0';
			counter2+=1;
			
		}
			




		




		for (int x = 0 ; x < lengthOfString; x++){
		
			multiplicationOfstringtoIndex12[x] = stringtoIndex12[x] *2 ;
			multiplicationOfstringtoIndex15[x] = stringtoIndex15[x];

			}counter++;










		for (int x = 0 ; x < lengthOfString; x++){

			
			if (multiplicationOfstringtoIndex12[x] > 9){

			sumOfDoubledNumber8 += (multiplicationOfstringtoIndex12[x] - 10) + 1;

			}



		}



		for (int x = 0; x < lengthOfString; x++){

			sumOfOddNumbers8 += multiplicationOfstringtoIndex15[x] + 0;

			}






		if ((sumOfDoubledNumber8 + sumOfOddNumbers8)/10 == 0){

		System.out.println("This is a valid");
		}else {System.out.println("This is not valid");}



}

}

