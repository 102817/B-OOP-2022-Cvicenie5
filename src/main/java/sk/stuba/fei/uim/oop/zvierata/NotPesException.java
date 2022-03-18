package sk.stuba.fei.uim.oop.zvierata;

public class NotPesException extends Exception {   //dedi z vynimky
    public NotPesException() {
    }

    public NotPesException(String message) {
        super(message);
    }

    public NotPesException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotPesException(Throwable cause) {
        super(cause);
    }
}
