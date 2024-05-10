
import java.util.Scanner;
public class AtmCard{
public static void main(String[] arg){


	Scanner input = new Scanner(System.in);

	System.out.println("Enter atm card number :" );
	String atmCardNumber = input.nextLine();


	System.out.println(cardValidator(atmCardNumber));



}

	public static String cardValidator (String ... atmCardNumber){

		int cardlength = atmCardNumber.length();

		String firstindex = Character.toString(atmCardNumber.charAt(0));


		if ((firstindex.equals("4") || firstindex.equals("5") || firstindex.equals("6")) && (cardlength == 19)){


		return "Valid Card!!!!";


		}else return "False Invalid card";

		


	}





}