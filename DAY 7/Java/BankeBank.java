
import java.util.Scanner;
public  class BankeBank{
public static void main(String[] arg){


	menu();

}

Arraylist <String> name = new Arraylist<String>name;


public static void menu(){
	Scanner input = new Scanner(System.in);
	String menu = """

	1. -> Open account.
	2. -> Close account.
	3. -> Deposite Money.
	4. -> Withdraw money.
	5. -> account balance .
	6. -> Transfer from one bank to another.
	7. -> Change Pin.
	8. -> Exit App.

	""";


System.out.print(menu);
int inputt = input.nextInt();

switch(inputt){

case 1: openAccount();
break;
case 2: closeAccount();
break;
case 3: depositeMoney();
break;
case 4: withdrawMoney();
break;
case 5: accountBalance();
break;
case 6: transferToOtherBanks();
break;
case 7: changePin();
break;
case 8: exitApp();
break;
default -> System.out.println("Error");

}
}



public static void openAccount(){

System.out.print("what type of account do you want to open(savings or current):");
System.out.print("First Name: ");
System.out.print("Last Name: ");
System.out.print("Age: ");
System.out.print("Enter a new Pin: ");

menu();
}



public static void closeAccount(){
System.out.print(" ")
System.out.println("Enter your accountname:" );
System.out.print("Enter your pin:");
System.out.print("Reason for cloing the account: ");
System.out.print(" ")

menu();
}




public static void depositeMoney(){

System.out.print(" ")
System.out.print("Enter account number to deposite into: ");
System.out.print("how much do you want to deposite: ")
System.out.print(" ");

menu();
}



public static void withdrawMoney(){

System.out.print("accountBalance - withdrawnamount");  

menu();
}



public static void accountBalance(){

System.out.print("accountBalance - withdrawnAmount");  

menu();

}

public static void transferToOtherBanks(){

System.out.print("accountBalance - amountToSend");  

menu();

}

public static void changePin(){

System.out.print("old Pin - new pin");  

menu();

}


public static void exitApp(){

System.out.print("old Pin - new pin");  

menu();

}



















}



	
	


	
	



