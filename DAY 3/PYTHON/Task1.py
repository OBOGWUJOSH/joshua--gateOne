import random
import operator

integer1 = random.randint(1,10)
integer2 = random.randint(2,7)
operators = ('+','*','-','/')
operator = random.choice(operators)

answer = 0
wrong = 0
correct = 0




for count in range (10):

	#question = random + random

	maths = int(input("{} {} {}".format(integer2, operator, integer2)))
	answer = int(input('write a score:'))


	if maths == answer:
	
		print("correct answer")
		correct += 1

	elif maths != answer:

		print("wrong answer")
		wrong += 1

	#scores.append(score)

	print(correct)
	print(wrong)


