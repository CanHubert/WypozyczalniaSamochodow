package Source.Exceptions;

public class VehicleExistException extends RuntimeException {

    @Override
    public String toString() {
        return "The vehicle with the specified ID does not exist";
    }

    public VehicleExistException(){System.out.println("The vehicle with the specified ID does not exist");}}// czy pojazd istnieje

