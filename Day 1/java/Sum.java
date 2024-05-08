import java.util.Scanner;
public class Sum{

public static void main(String[] arg){

Scanner input = new Scanner(System.in);

int totalSum = 0;


	
	for (int x = 1; x <= 10; x++){

	System.out.println("enter a score:" );
	int number = input.nextInt();

		totalSum += number;

		

	}System.out.print(totalSum);



}
}