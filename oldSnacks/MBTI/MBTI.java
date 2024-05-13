//MBTI

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;


public class MBTI{
public static void main(String[] args){


	Scanner input = new Scanner(System.in);

	System.out.println("hello what is your name: ");
	String userName  = input.nextLine();


	char a;
	char b;
	char userPrompt;



	String [][] MbitQuestions = new String[]{

	["A).expend energy, enjoy groups]  [B).conserve energy, enjoy one-on-one"],

	["A).Interpret litrally  B).look for meaning and possibilities"],

	["A).logical,thinking, questioning] [B).empathetic, feeling, accomodating"],

	["A). organized, orderly]  [B).flexible, adaptable"],

	["A).more outgoing, think out loud]  [B).more reserved, think to yourself"],

	["A).practical, realistic, experiential]  B).imaginative innorvative, theoretical"],

	["A).candid,straight forward, frank]  B).tactiful, kind, encouraging"],

	["A).plan, schedule]  [B).unemplanned, spontenous"],

	["A).seek many task, public activities, interaction with others  B).seek private, solitary activities with quiet to concentrate"],

	["A).standard, usual,conventional  B).different,novel,unique"],
	
	["A).firm, tend to criticize, hold the line  B)gentle, tend to apprecite, conciliate"],

	["A).regulated, structured  B).easy-going,live and let live"],

	["A).external, communicative, express yourself] [B).internal, recticent, keep to yourself"],

	["A).focus on here-and-now]  [B).look to the future, global perspective,big picture"],

	"A).tough-minded, just  B).tender-hearted, merciful",

	"A).preparation, plan ahead  B).go with the flow, adapt as you go",

	"A).active,initiate  B).reflective, delibrate",

	"A).facts, things, what is  B).ideas, dreams, what could be, philosophical",

	"A).matter of fact, issues-oriented  B).sensitive, people-oriented, compassionate",

	"A).control, govern  B).latitude,freedom"};




	char[]bucket0 = new char [5];
	char[]bucket1 = new char [5];
	char[]bucket2 = new char [5];
	char[]bucket3 = new char [5];


	int count0 = 0;
	int count1 = 0;
	int count2 = 0;
	int count3 = 0;
	int count4 = 0;
	int counter = 0;
	int x = 0;









	/**
	for (x = 0; x <  MbitQuestions.length; x++){


		
		System.out.print(MbitQuestions[x]);

		System.out.println(": ");
		userPrompt = input.next().charAt(0);
		
		if (userPrompt == 'a' || userPrompt == 'b'){

			bucket0[count0] = userPrompt;
		count0+=1;
		}
		else if 
		(userPrompt != 'a' || userPrompt != 'b') {System.out.println("choose another option between A or B");}


		System.out.println(Arrays.toString(bucket0));
		System.out.println("\n");
	





		
		System.out.print(MbitQuestions[x+=1]);

		System.out.println(": ");
		userPrompt = input.next().charAt(0);
		
		if (userPrompt == 'a' || userPrompt == 'b'){

			bucket1[count1] = userPrompt;
		
		count1+=1;
		}

		else{System.out.println("choose another option between A or B");}

		System.out.println(Arrays.toString(bucket1));
		System.out.println("\n");
	

	

		System.out.print(MbitQuestions[x+=1]);

		System.out.println(": ");
		userPrompt = input.next().charAt(0);
		
		if (userPrompt == 'a' || userPrompt == 'b'){

			bucket2[count2] = userPrompt;
		
		count2+=1;
		}
		else{System.out.println("choose another option between A or B");}

		System.out.println(Arrays.toString(bucket2));
		System.out.println("\n");
	




		System.out.print(MbitQuestions[x+=1]);

		System.out.println(": ");
		userPrompt = input.next().charAt(0);
		
		if (userPrompt == 'a' || userPrompt == 'b'){

			bucket3[count3] = userPrompt;
		
		count3+=1;
		}
		else{System.out.println("choose another option between A or B");}

		System.out.println(Arrays.toString(bucket3));
		System.out.println("\n");

		}




	for (int y = 0; y <= 4; y++){

		System.out.println(bucket0[y]);
		System.out.print(MbitQuestions[count4]);
		count4+=4;
		}**//








		/**
		System.out.println(Arrays.toString(bucket0));
		System.out.println(Arrays.toString(bucket1));
		System.out.println(Arrays.toString(bucket2));
		System.out.println(Arrays.toString(bucket3));
		**/
	}
	}