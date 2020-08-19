package tw.practice.basic.exception;

public class UnexpectedProjectTypeException extends RuntimeException {
    public UnexpectedProjectTypeException(String errorMsg) {
        super(errorMsg);
    }
}
