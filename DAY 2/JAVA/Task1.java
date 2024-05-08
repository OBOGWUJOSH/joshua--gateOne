import java.util.Arrays;
import java.util.Scanner;
public class Task1{
public static void main(String[] arg) {

	Scanner input = new Scanner(System.in);

	int [] scores = new int [10];
	

	for(int count = 0; count < 10; count++){
	System.out.print("input Score:");
	int score = input.nextInt();

	scores [count] =  score;

	}

	System.out.print(Arrays.toString(scores));


}


}