package oop.assignment4;

public class WithdrawLimitException extends BankAccountException {

	public WithdrawLimitException() {
		super("The amount is greater than the withdraw limit.");
	}

	public WithdrawLimitException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}

}
