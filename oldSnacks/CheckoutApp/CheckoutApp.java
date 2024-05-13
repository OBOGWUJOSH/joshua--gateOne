//CheckoutApp
import java.util.Arrays;
import java.util.Scanner;
	
	public class CheckoutApp{

	public static void main(String[] args){
	
	int counter = 0;

	String cashiersname = (" ");

	int addedMoreItems = 1;
	
	double totalsum = 0;

	double discounted = 0;
	
	double discountedamount = 0;
	



	Scanner input = new Scanner(System.in);


		String[] itemBoughtA = new String[5];
		int[] howManyPiecesA = new int[5];
		double[] howMuchPerUnitA = new double[5];
		double[] total = new double[5];
		int totalSum = 0;
		discounted = 0;



		System.out.println("what is the customer's name:  ");
		String customersname = input.nextLine();
		
		

		while(addedMoreItems == 1){



		System.out.println("what did the user buy:  ");
		String itemBought = input.next();
		itemBoughtA[counter] = itemBought;

		System.out.println("How many pieces:  ");
		int howManyPieces = input.nextInt();
		howManyPiecesA[counter] = howManyPieces;

		System.out.println("How much per unit:  ");
		int howMuchPerUnit = input.nextInt();
		howMuchPerUnitA[counter] = howMuchPerUnit;

		System.out.println("add more items? (1=yes/2=no):");
		addedMoreItems = input.nextInt();





		int TotalCalculation = howMuchPerUnit * howManyPieces;
		total[counter] = TotalCalculation;

		totalsum += TotalCalculation ;




		counter++;

		}

		//System.out.println(totalSum);



		System.out.println("how much discount will he/she Get: ");
		int howMuchDiscount = input.nextInt();


		System.out.println("what is the cashier name: ");
		String cashiersName = input.next();





		discounted = totalsum * howMuchDiscount/100;

		discountedamount = totalsum - discounted;






System.out.println("====================================================================================");

		System.out.println("Welcome To SEMICOLON STORES");
		
		System.out.println("LOCATION: 321, HERBERT MACAULAY WAY, SABO YABA, LAGOS");

		System.out.println("TEL:08090986867");

		System.out.println("Date:23-1-2024");

		System.out.printf("%s%s%n","Cashier's Name:", cashiersName);

		System.out.printf("%s%s%n","Customer's Name:", customersname);


System.out.println("====================================================================================");


		System.out.printf("%s\t\t%s\t\t%s\t\t%s\t\t%n","ITEM", "QTY", "PRICE", "TOTAL(NGN)");

		for (int j = 0; j < counter; j++){
		System.out.printf("%s\t\t%d\t\t%.2f\t\t%.2f\t\t%n", itemBoughtA[j], howManyPiecesA[j], howMuchPerUnitA[j], total[j]);

		}

System.out.println("--------------------------------------------------------------------------------------");

		System.out.printf("\t\t\t\t%s\t%.2f%n", "Sub Total:", totalsum );
		System.out.printf("\t\t\t\t%s\t%.2f%n", "Discount:", discounted );
		







System.out.println("==================================================================================");

		System.out.println(Arrays.toString(itemBoughtA));


		System.out.println(Arrays.toString(howManyPiecesA));


		System.out.println(Arrays.toString(howMuchPerUnitA));




System.out.println("----------------------------------------------------------------------------------");




}

}

