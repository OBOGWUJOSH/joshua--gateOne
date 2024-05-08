import java.util.Scanner;
public class Task4{

public static void main(String[] arg){

Scanner input = new Scanner(System.in);

int totalSum = 0;
double average = 0;

int counter = 2;	



	
	for (int x = 1; x <= 5; x++){

		System.out.println("enter a score:" );
		int number = input.nextInt();

		System.out.println("enter a score:" );
		int number2 = input.nextInt();

		totalSum += number2;

		//average = totalSum/10;


}




	System.out.println("Total =" + totalSum);
	//System.out.println("Average =" + average);
	




}
}