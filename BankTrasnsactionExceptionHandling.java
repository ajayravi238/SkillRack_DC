class MaxCreditLimitExceededException extends Exception {
    public MaxCreditLimitExceededException(String message) {
        super(message);
    }
}

class InsufficientBalance extends Exception {
    public InsufficientBalance(String message) {
        super(message);
    }
}
