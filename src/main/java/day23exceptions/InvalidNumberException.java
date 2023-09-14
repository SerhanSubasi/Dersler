package day23exceptions;

public class InvalidNumberException extends RuntimeException{   // extend ettik ve generate ile constructor massage çağırdık bitti.

    public InvalidNumberException(String message) {
        super(message);
    }
}
