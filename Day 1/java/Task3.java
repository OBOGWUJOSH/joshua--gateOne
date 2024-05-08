import java.util.Scanner;
public class Task3{

public static void main(String[] arg){

Scanner input = new Scanner(System.in);

int totalSum = 0;
double average = 0;


	
	for (int x = 1; x <= 10; x++){

	System.out.println("enter a score:" );
	int number = input.nextInt();

		totalSum += number;

	average = totalSum/10;

		

	}

	System.out.println("Total =" + totalSum);
	System.out.println("Average =" + average);
	




}
}