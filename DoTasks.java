import java.util.ArrayList;
import java.util.Scanner;

public class DoTasks {
	static int i=0;
	static ArrayList<BankDetails> userDetails = new ArrayList<BankDetails>();
	static Scanner sc = new Scanner(System.in);
	static long accountNumber = 100;

	public static void createAccount() {
		if(i!=0)
			sc.nextLine();
		BankDetails newUser = new BankDetails();
		System.out.println("Enter your name");
		newUser.setName(sc.nextLine());
		System.out.println("Enter your address");
		newUser.setAddress(sc.nextLine());
		System.out.println("Enter your initial deposit amount");
		newUser.setBalance(Double.parseDouble(sc.nextLine()));
		long newAccountNumber = accountNumber++;
		newUser.setAccountNumber(newAccountNumber);
		System.out.println("Account successfully opened!");
		System.out.println("Your new account number is " + newAccountNumber);
		userDetails.add(newUser);
		i = 0;
	}

	public static void viewDetails() {
		if (!userDetails.isEmpty()) {
			System.out.println("Enter your account number");
			long accountNum = sc.nextLong();
			boolean match = false;
			for (int i = 0; i < userDetails.size(); i++) {
				BankDetails user = userDetails.get(i);
				if (user.getAccountNumber() == accountNum) {
					match = true;
					System.out.println("Name: " + user.getName());
					System.out.println("Address: " + user.getAddress());
					System.out.println("Balance: " + user.getBalance());
					break;
				}
			}
			if (!match)
				System.out.println("Invalid account number!");

		} else
			System.out.println("First open an account before performing this action!");

		i++;
	}

	public static void depositMoney() {
		if (!userDetails.isEmpty()) {
			System.out.println("Enter your account number");
			long accountNum = sc.nextLong();
			boolean match = false;
			for (int i = 0; i < userDetails.size(); i++) {
				BankDetails user = userDetails.get(i);
				if (user.getAccountNumber() == accountNum) {
					match = true;
					System.out.println("How much do you want to deposit?");
					double depositAmt = sc.nextDouble();
					double newBalance = user.getBalance() + depositAmt;
					user.setBalance(newBalance);
					System.out.println("Processing...");
					System.out.println("Your new balance is " + user.getBalance());
					break;
				}
			}
			if (!match)
				System.out.println("Invalid account number!");

		} else
			System.out.println("First open an account before performing this action!");
		i++;
	}

	public static void withdrawMoney() {
		if (!userDetails.isEmpty()) {
			System.out.println("Enter your account number");
			long accountNum = sc.nextLong();
			boolean match = false;
			for (int i = 0; i < userDetails.size(); i++) {
				BankDetails user = userDetails.get(i);
				if (user.getAccountNumber() == accountNum) {
					match = true;
					System.out.println("How much do you want to withdraww?");
					double withdrawAmt = sc.nextDouble();
					if (user.getBalance() >= withdrawAmt) {
						double newBalance = user.getBalance() - withdrawAmt;
						user.setBalance(newBalance);
						System.out.println("Processing...");
						System.out.println("Amount withdrawn successfully! Your new balance is " + user.getBalance());
					} else
						System.out.println("Insufficient Balance!");
					break;
				}
			}
			if (!match)
				System.out.println("Invalid account number!");
		} else
			System.out.println("First open an account before performing this action!");

		i++;
	}

	public static void Exit() {
		System.out.println("Exiting...");
		System.out.println("Thanks for using our Banking Service! Have a good day!");
		System.exit(0);
	}
}
