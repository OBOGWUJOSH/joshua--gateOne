
import java.util.Scanner;
import java.util.ArrayList;
public  class BankeBank{



static ArrayList<String[]> account = new ArrayList<>();

//ArrayList<String> list = new ArrayList<String>();

static Scanner input = new Scanner(System.in);

static double totalAccountBalance = 0;



public static void main(String[] arg){


	menu();
	
}




public static void menu(){

	
Scanner input2 = new Scanner(System.in);


	String menu = """

	1. -> Open account.
	2. -> Close account.
	3. -> Deposite Money.
	4. -> Withdraw money.
	5. -> account balance .
	6. -> Transfer to Other Banks.
	7. -> Change Pin.
	8. -> Exit App.

	""";


System.out.print("Menu");
System.out.println(" ");
System.out.print(menu);

System.out.println(" ");

int inputt = input2.nextInt();

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
default: System.out.println("Error");

}
}







public static void openAccount(){


System.out.println(" ");

System.out.println("Account Type(savings or current):");
String accountType = input.nextLine();
/**
if ((accountType = "SAVINGS") || (accountType = "CURRENT")){
	accountType.equalsIgnoreCase("SAVINGS");
	accountType.equalsIgnoreCase("CURRENT");
	}else	
	System.out.println("Wrong Account Type");
**/

	System.out.println("First Name: ");
	String firstName = input.nextLine();

	System.out.println("Last Name: ");
	String lastName = input.nextLine();

	System.out.println("Age: ");
	String age = input.nextLine();


	System.out.println("your new account number is : ");	//creata a random of length of numbers (5) (01 + 5 	random numbers)AccountNumber 
	String accountNumber = input.nextLine();


	System.out.println("Create a new Pin: ");	//create conditions to make the pin be the key access into 	the account 
	String createdPin = input.nextLine();

	//}else {System.out.println("Not an account type");};


account.add(new String[] {accountType, firstName, lastName, age, createdPin, accountNumber});

System.out.println(" ");


menu();
}



public static void closeAccount(){

System.out.println(" ");

System.out.println("Enter your accountname:" );
String nameOfBank = input.nextLine();

System.out.println("Enter your pin:");
String pinInput = input.nextLine();

System.out.println("Reason for cloing the account: ");
String reasonToCloseAccount = input.nextLine();

System.out.println(" ");

menu();

}




public static void depositeMoney(){

System.out.println(" ");

System.out.println("Enter account number to deposite into: ");
String accountToDepositeInto = input.nextLine();

System.out.println("how much do you want to deposite: ");
String depositedAmount = input.nextLine();

System.out.println(" ");

menu();

}



public static void withdrawMoney(){

System.out.println("Enter amount you want to withdraw: ");
double withdrawAmount = input.nextDouble();

double amountWithdrawn = totalAccountBalance - withdrawAmount;
System.out.println(withdrawAmount);

System.out.println(" ");

menu();

}



public static void accountBalance(){

double totalAccountBalance = 0.00;

System.out.println("your total account balance is: " + totalAccountBalance );

System.out.println(" ");


menu();

}




public static void transferToOtherBanks(){

System.out.println(" ");

System.out.print("Enter Name Of Bank: ");
String nameOfBank = input.nextLine();

System.out.print("Enter Amount to be Transfered : ");
int amountToTransferInterSwitch = input.nextInt();

double balance = totalAccountBalance - amountToTransferInterSwitch;
String bankbalance = input.nextLine();

System.out.println(" ");

menu();

}




public static void changePin(){

System.out.println(" ");

System.out.println("Enter Old pin: ");
String oldPin = input.nextLine();

System.out.println("Enter New pin: ");
String newPin = input.nextLine();

System.out.println("Enter New pin again for confirmation: "); // if ton    condition the old and new pin
String newPinConfirmation = input.nextLine();

System.out.println(" ");

menu();

}




public static void exitApp(){

System.out.print("Thanks for using the new Banke Bank app");  
System.out.println(" ");
System.out.println(" ");

//menu();

}



}
