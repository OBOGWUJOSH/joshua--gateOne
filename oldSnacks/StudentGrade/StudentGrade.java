//StudentGrade

import java.util.Arrays;
import java.util.Scanner;
public class StudentGrade{
public static void main(String[] args){

	
	Scanner input = new Scanner (System.in);


	int count = 0;

	System.out.println("How many Students Do You Have: ");
	int numberOfStudent = input.nextInt();

	System.out.println("How many Subjects Do You Offer : ");
	int numberOfSubject = input.nextInt();
	System.out.println(" ");

	System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println("Saved Successfully");
	System.out.println(" ");

	

	

	
	String nameOfStudent = null;
	String nameOfSubject = null;
	int studentScore = 0;
	int [] arrNumberOfStudents = null;
	int [] arrNumberOfSubjects = null;
	String [] arrNameOfStudents = null;
	String [] arrNameOfSubjects = null;
	int [] arrStudentScores = null;
	int sum = 0;
	int SUB = 0 ;


		arrNumberOfStudents = new int [numberOfStudent];
		arrNumberOfSubjects = new int [numberOfSubject];
		arrNameOfStudents = new String[numberOfStudent];
		arrNameOfSubjects = new String[numberOfSubject];
		arrStudentScores = new int [numberOfSubject];


		
	for(int x = 0; x < numberOfStudent; x++){

		

			/*System.out.println("Enter name of Student: " );
			nameOfStudent = input.next();
			arrNameOfStudents[0] = nameOfStudent;*/





		for(int counter = 0; counter < numberOfSubject; counter++){

			/*System.out.print("Name of Subject: " );
			nameOfSubject = input.next();
			arrNameOfSubjects[counter] = nameOfSubject;*/
			

			System.out.print("Students score : ");
			studentScore = input.nextInt();


				if (studentScore < 0 || studentScore > 100) {
				System.out.println("!!!! Illegal Student Score please Try again !!!!");
				}



			arrStudentScores[x] = studentScore;
			sum += arrStudentScores[x];
			


		System.out.println("\n");
		}



	}



System.out.print("=======================================================================================================");
System.out.print("\n");




	System.out.print ("STUDENT"\t); for (int x = 1; x < numberOfSubject; x++){

					
				}




System.out.print("======================================================================================================");

System.out.println("\n");




for (int y = 0; y < numberOfStudent; y++){
		
		
	for (int x = 0; y < numberOfStudent; y++){


		//System.out.printf("%s\t\t %d\t%d\t%d\t\t",arrNameOfStudents[y],arrStudentScores[y],arrStudentScores[y]);


	}

}




System.out.println("======================================================================================================");
System.out.println("\n");






		/*System.out.println(nameOfStudent);

		System.out.println(Arrays.toString(arrNameOfSubjects));

		System.out.println(Arrays.toString(arrStudentScores));

		System.out.println("\n");*/




		//System.out.println(nameOfStudent);

		//System.out.println(Arrays.toString(arrNameOfSubjects));

		//System.out.println(Arrays.toString(arrStudentScores));

		//System.out.println("\n");









			
}

} 