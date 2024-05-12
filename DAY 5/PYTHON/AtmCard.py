#AtmCard

cardNumber = str(input('input:'  ));

cardLength = len(cardNumber)


index0 = cardNumber[0]
index4 = cardNumber[4]
index9 = cardNumber[9]
index14 = cardNumber[14]



print(index0)
print(index4)
print(index9)
print(index14)


if (index0 == '4' or index0 == '5' or index0 == '6' and cardLength == 19):
	print('Valid card')


elif (cardLength != 19):

	print('wrong card length') 

else: print('invalid Card')

#print(cardNumber)


"""
print(index0)
print(index4)
print(index9)
print(index14)
"""