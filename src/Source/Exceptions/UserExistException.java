package Source.Exceptions;

public class UserExistException extends RuntimeException {

    @Override
    public String toString() {
        return "The user with the specified ID does not exist.";
    }

    public UserExistException(){

        System.out.println("The user with the specified ID does not exist");}}// czy user istnieje

