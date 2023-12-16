package oop.assignment4;

public class InvalidAmountException extends BankAccountException {

	public InvalidAmountException() {
		super("The amount is non positive.");
	}

	public InvalidAmountException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}

}
