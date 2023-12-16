package oop.assignment4;

public class DepositLimitException extends BankAccountException {

	public DepositLimitException() {
		super("The amount is ghreater than the deposit limit.");
	}

	public DepositLimitException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}

}
