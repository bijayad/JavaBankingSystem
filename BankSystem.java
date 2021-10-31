
import java.util.Scanner;

public class BankSystem {
	public static void displayMenu() {
		System.out.println("Welcome to Online Bank Ltd");
		while (true) {
			
			System.out.println("");
			System.out.println("1. Create new Account");
			System.out.println("2. View Details");
			System.out.println("3. Deposit Money");
			System.out.println("4. Withdraw Money");
			System.out.println("5. Exit");
			System.out.println("");
			askUser();
		}
	}

	public static void askUser() {
		System.out.println("What you want to do?");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			DoTasks.createAccount();
			break;
		case 2:
			DoTasks.viewDetails();
			break;
		case 3:
			DoTasks.depositMoney();
			break;
		case 4:
			DoTasks.withdrawMoney();
			break;
		case 5:
			DoTasks.Exit();
			break;
		default:
			System.out.println("Please select appropriate choice");
		}

	}
}
