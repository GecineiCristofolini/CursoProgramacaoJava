package application;

import entities.BusinessAccount;

public class ProgramAccount {

	public static void main(String[] args) {

		BusinessAccount account = new BusinessAccount(8010, "Bob Brown", 100.0, 500.0);

		System.out.println(account.getBalance());
	}
}