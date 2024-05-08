import java.util.Scanner;
public class Task8{

public static void main(String[] arg){

Scanner input = new Scanner(System.in);

double totalSum = 0;
double average = 0;

int counter = 2;	



	
	for (int x = 1; x <= 10; x++){

		System.out.println("enter a score:" );
		double number = input.nextInt();

	
		totalSum += number;


}

	System.out.println("Total =" + totalSum);


}
}