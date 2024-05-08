import java.util.Scanner;
public class Task7{

public static void main(String[] arg){

Scanner input = new Scanner(System.in);

double totalSum = 0;
double average = 0;

int counter = 2;	



	
	while (int count <= 10){

		System.out.println("enter a score:" );
		double number = input.nextInt();

	if (number % 2 == 0){

		totalSum += number;
		average = totalSum/5;

	}


}




	System.out.println("Total =" + totalSum);
	System.out.println("Average =" + average);



}
}