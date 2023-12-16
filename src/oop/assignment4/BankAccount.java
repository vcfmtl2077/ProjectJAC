package oop.assignment4;

public class BankAccount {
	private String name; // your name
	private double balance; // current amount of money you save in the bank account
	private final static double depositLimit = 500;
	private final static double withdrawLimit = 500;

	/** constructor */
	public BankAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	/** constructor */
	public BankAccount(String name) {
		this(name, 0);
	}

	/** return balance */
	public double getbalance() {
		return balance;
	}

	/** return name */
	public String getName() {
		return name;
	}

	public String toString() {
		return "Name: " + name + "\n" + "balance: " + balance;
	}

	/** deposit money into the account */
	public void deposit(double depositAmount) throws BankAccountException {
		if (depositAmount < 0) {
			throw new InvalidAmountException(
					"The deposit amount is " + depositAmount + ". The amount is non positive. ");
		}
		if (depositAmount > this.depositLimit) {
			throw new DepositLimitException("The deposit limit is" + this.depositLimit + ". The deposit amount is "
					+ depositAmount + ". The amount is ghreater than the deposit limit.");
		}
		this.balance += depositAmount;
	}

	/** withdraw money from the account */
	public void withdraw(double withdrawAmount) throws BankAccountException {
		if (withdrawAmount < 0) {
			throw new InvalidAmountException(
					"The deposit amount is " + withdrawAmount + ". The amount is non positive. ");
		}
		if (withdrawAmount > this.withdrawLimit) {
			throw new WithdrawLimitException("The withdraw limit is" + this.withdrawLimit + ". The deposit amount is "
					+ withdrawLimit + ". The amount is ghreater than the withdraw limit.");
		}
		if (withdrawAmount > this.balance) {
			throw new NotEnoughBalanceException("The current balance is " + this.balance + ". The withdraw amount is "
					+ withdrawAmount + ". The amount is greater than the cirrent balance.");
		}
		this.balance -= withdrawAmount;
	}

}
