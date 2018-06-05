package pl.sda.tdd1;

public class InvalidNumberExeption extends Exception{
    public InvalidNumberExeption() {
    }

    public InvalidNumberExeption(String message) {
        super(message);
    }

    public InvalidNumberExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidNumberExeption(Throwable cause) {
        super(cause);
    }

    public InvalidNumberExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
