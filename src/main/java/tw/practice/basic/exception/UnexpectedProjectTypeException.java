package tw.practice.basic.exception;

public class UnexpectedProjectTypeException extends Throwable {
    public UnexpectedProjectTypeException(String errorMsg) {
        super(errorMsg);
    }
}
