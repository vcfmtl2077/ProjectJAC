package oop.assignment4;

public class BankAccountException extends Exception {

	public BankAccountException() {
		super("An exception occurred during the operation of the bank account.");
	}

	public BankAccountException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}

}
