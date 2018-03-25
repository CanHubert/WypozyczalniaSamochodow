package Source.Exceptions;

public class TooShortNameException extends RuntimeException {
    @Override
    public String toString() {
        return "Name have to be longer than 3 characters.";
    }
}
