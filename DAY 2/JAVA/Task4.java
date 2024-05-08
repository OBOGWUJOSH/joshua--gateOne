import java.util.Arrays;
import java.util.Scanner;
public class Task4{
public static void main(String[] arg) {

	Scanner input = new Scanner(System.in);

	int [] scores = new int [10];
	int [] evenIndex = new int [5];
	

	for(int count = 0; count < 10; count++){
		
		System.out.print("input Score:");
		int score = input.nextInt();

		scores[count] =  score;

		//evenIndex =  newScores;

		System.out.print(arrayOutput.Arrays.toString(scores));

	}
		
	
		
}


public static int [] arrayOutput (int [] scores){

	int counter2 = 0;

	int [] newScores = new int [scores.length];

	for(int counter = 1; counter <= 10; counter+=2){	

	
		newScores[counter2] = Scores [counter];

	}

		return newScores;

}

}