
import java.util.Scanner;
public  class practice{

public static void main(String[] arg){

	menu();


}


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
default;





}
}



public static void openAccount(){

System.out.print("HIIII");

menu();
}


public static void closeAccount(){

System.out.print("hello");

menu();
}


public static void depositeMoney(){

System.out.print("accountBalance - deposited amount");

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




















}



	
	


	
	



