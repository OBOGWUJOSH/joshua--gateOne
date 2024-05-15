
import java.util.Scanner;
public class BankeBank{

public static void main(String[] arg){

	menu();

};



	
	public static void menu(){
	Scanner input = new Scanner(System.in);
	String Prompt = """

	1. -> Open account.
	2. -> Close account.
	3. -> Deposite Money.
	4. -> Withdraw money.
	5. -> Check account balance .
	6. -> Transfer from one bank to another.
	7. -> Change Pin.
	8. -> Exit App.

	""";
	

System.out.print(Prompt);
int inputt = input.nextInt();

switch(inputt){

case 1: openAccount();
break;
}
}


public static void openAccount(){

System.out.print("HELLOOOO");

menu();
}






}