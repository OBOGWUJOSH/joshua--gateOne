
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class BankeBankB{



static ArrayList<String> firstNameArr = new ArrayList<String>();
static ArrayList<String> lastNameArr = new ArrayList<String>();
static ArrayList<String> accountNumberArr = new ArrayList<String>();
static ArrayList<Integer> accountBalanceArr = new ArrayList<>();
static ArrayList<String> pinArr = new ArrayList<String>();



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
	5. -> account balance.
	6. -> View All Accounts.
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
case 6: viewAllAccounts();
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


	System.out.println("First Name: ");
	String firstName = input.nextLine();

	System.out.println("Last Name: ");
	String lastName = input.nextLine();

	System.out.println("your new account number is: ");//creata a random of length of numbers (5) (01 + 5 random numbers)
	String accountNumber = input.nextLine();


	System.out.println("initial deposite: ");
	int initialDeposite = input.nextInt();


	System.out.println("Create a new Pin: ");//create conditions to make the pin be the key access into the account 
	String createdPin = input.nextLine();


    	firstNameArr.add(firstName);
	lastNameArr.add(lastName);
    	accountNumberArr.add(accountNumber);
	accountBalanceArr.add(initialDeposite);
    	pinArr.add(createdPin);
	


	
	System.out.println(" ");
	for (int count = 0; count < accountNumberArr.size(); count++){

    	System.out.println(firstNameArr.get(count));
    	System.out.println(lastNameArr.get(count));
    	System.out.println(accountNumberArr.get(count));
    	System.out.println(accountBalanceArr.get(count));
    	System.out.println(pinArr.get(count));
	System.out.println(" ");
	}
	




menu();
}



public static void closeAccount(){

System.out.println(" ");


System.out.println("Enter first name: ");
String firstNameOnAccount = input.nextLine();

System.out.println("Enter last name: ");
String lastNameOnAccount = input.nextLine();

System.out.println("Enter Account Number: ");
String accountNumber = input.nextLine();

System.out.println("Enter your pin: ");
String pinInput = input.nextLine();

System.out.println("Reason for cloing the account: ");
String reasonToCloseAccount = input.nextLine();


int requiredIndexToRemove = accountNumberArr.indexOf(accountNumber);

for (int counter = 0; counter < accountNumberArr.size(); counter++){


    	System.out.println(firstNameArr.remove(requiredIndexToRemove));
    	System.out.println(lastNameArr.remove(requiredIndexToRemove));
    	System.out.println(accountNumberArr.remove(requiredIndexToRemove));
    	System.out.println(accountBalanceArr.remove(requiredIndexToRemove));
    	System.out.println(pinArr.remove(requiredIndexToRemove));
	
	}

menu();

}




public static void depositeMoney(){

System.out.println(" ");

System.out.println("Enter Account Number: ");
String accountNumberDebit = input.nextLine();

int accountsIndexToTransferFrom = accountNumberArr.indexOf(accountNumberDebit);
int debitAccountIndex = accountsIndexToTransferFrom + 1;


System.out.println("Enter account number to deposite into: ");
String accountToDepositeInto = input.nextLine();


int AccountsIndexToTransferTo = accountNumberArr.indexOf(accountToDepositeInto);
int creditAccountIndex = AccountsIndexToTransferTo + 1;


System.out.println("how much do you want to deposite: ");
int depositedAmount = input.nextInt();

int count = 0;

for (int counter = 0; counter < accountNumberArr.size(); counter++){

	int debitAlert = debitAccountIndex - depositedAmount;


	if (accountNumberArr.get(counter).equals(accountNumberDebit)){

		 accountBalanceArr.set(counter, accountBalanceArr.get(counter) - accountBalanceArr.get(debitAlert));

		}


	int creditAlert = debitAccountIndex + depositedAmount;


	if (accountNumberArr.get(counter).equals(accountToDepositeInto)){

		 accountBalanceArr.set(counter, accountBalanceArr.get(creditAlert));

		}else System.out.println("Wrong banking information please try again");

}



System.out.println("Enter your pin: ");
String pinInput = input.nextLine();

System.out.println(" ");






for (int counter = 0; counter < accountNumberArr.size(); counter++){


    	System.out.println(firstNameArr.get(counter));
    	System.out.println(lastNameArr.get(counter));
    	System.out.println(accountNumberArr.get(counter));
    	System.out.println(pinArr.remove(counter));
	
	}


menu();

}



public static void withdrawMoney(){

System.out.println("Enter Account Number: ");
String accountNumber = input.nextLine();

System.out.println("Enter amount you want to withdraw: ");
double withdrawAmount = input.nextDouble();

double amountWithdrawn = totalAccountBalance - withdrawAmount;
System.out.println(withdrawAmount);

System.out.println("service unavailable ");

menu();

}



public static void accountBalance(){

System.out.println("Enter Account Number: ");
String accountNumber = input.nextLine();





System.out.println("Enter your pin: ");
String pinInput = input.nextLine();

System.out.println("your total account balance is: ");

System.out.println(" ");


menu();

}




public static void viewAllAccounts(){

System.out.println(" ");

	for (int count = 0; count < accountNumberArr.size(); count++){


    	System.out.println(firstNameArr.get(count));
    	System.out.println(lastNameArr.get(count));
    	System.out.println(accountNumberArr.get(count));
    	System.out.println(pinArr.get(count));
	System.out.println(" ");
	}
	
System.out.println(" ");

menu();

}





public static void changePin(){

System.out.println(" ");

System.out.println("Enter Old pin: ");
String oldPin = input.nextLine();

System.out.println("Enter New pin: ");
String newPin = input.nextLine();

System.out.println("Enter New pin again for confirmation: "); //if conditions: for the old and new pin
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
