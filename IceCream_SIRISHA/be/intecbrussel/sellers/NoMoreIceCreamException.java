package be.intecbrussel.sellers;

public class NoMoreIceCreamException extends Exception {

//	public static void main(String[] args) {
//		
//
//	}
	public NoMoreIceCreamException() {
    }

    public NoMoreIceCreamException(String message) {
        super(message);
    }

    public NoMoreIceCreamException(String message, Throwable cause) {
        super(message, cause);
    }
}
