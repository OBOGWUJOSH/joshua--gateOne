

	int maths = 0;
	int correct = 0;
	int wrong = 0;
	int answer = 0;


	Random rand = new Random();


	int rand_int = rand.nextInt(100);
	int rand_int2 = rand.nextInt(100);
	

	for(int count = 0; count < 10; count++){
		
		maths = rand_int + rand_int2;
	
		
		System.out.print("input answer:");
		answer = input.nextInt();

	}


		if (maths == answer){

			System.out.print ("correct");
			correct += 1;
		}else if (maths != answer){

			System.out.print ("wrong");
			correct += 1;


	}


	for(int counter = 0; counter < 10; counter++){	

		System.out.print(correct);
	
		System.out.print("wrong ");

	}

}


}