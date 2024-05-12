
import java.util.Scanner;
public class AtmCard{
public static void main(String... arg){


	Scanner input = new Scanner(System.in);

	System.out.printf("Enter atm card number :" );
	String atmCardNumber = input.nextLine();

	/**
	atmCardNumber.index(4) = ("-");
	atmCardNumber.index(9) = ("-");
	atmCardNumber.index(14) = ("-");
	**/


	System.out.println(cardValidator(atmCardNumber));



}

	public static boolean cardValidator(String atmCardNumber){

		
		int cardlength = atmCardNumber.length();

		char firstindex = atmCardNumber.charAt(0);
		
		char forthindex = atmCardNumber.charAt(4);
		
		char ninethindex = atmCardNumber.charAt(9);

		char fourteentindex = atmCardNumber.charAt(14);



		if ((firstindex == ('4') || firstindex == ('5') || firstindex == ('6')) && (cardlength == 19) && (forthindex == '-' || ninethindex == '-' || fourteentindex == '-')){
		return true;


		}else return false;

		


	}

  



}