package be.intecbrussel.sellers;

public class NoMoreIceCreamException extends Exception {


	public NoMoreIceCreamException() {
    }

    public NoMoreIceCreamException(String message) {
        super(message);
    }

    public NoMoreIceCreamException(String message, Throwable cause) {
        super(message, cause);
    }
}
