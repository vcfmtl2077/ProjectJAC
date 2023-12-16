package oop.assignment4;

public class NotEnoughBalanceException extends BankAccountException {

	public NotEnoughBalanceException() {
		super("The amount is greater than the cirrent balance.");
	}

	public NotEnoughBalanceException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}

}
