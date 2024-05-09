import random
import operator


maths = 0
wrong = 0
correct = 0



for count in range (10):

	integer1 = random.randint(1,10)
	integer2 = random.randint(2,15)
	operators = ("+","*","-","/")
	#operators = (+,*,-,/)
	operator = random.choice(operators)


	maths = ((integer2),  (operator),  (integer1));
	print (maths)	
	


	answer = int(input('write a score:'))


	

	if maths == answer:
	
		print("Correct Answer")

		correct += 1


	else: 

		print("Wrong Answer")

		wrong += 1



print(" ")

print("correct = ", + correct)
print("wrong = ", + wrong)


