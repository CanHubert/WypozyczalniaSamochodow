package Source.Exceptions;

public class DuplicateVehicleHireException extends RuntimeException {
    @Override
    public String toString() {
        return "This user already has a vehicle";
    }

    public DuplicateVehicleHireException(){System.out.println("This user already has a vehicle");}}// user wypozycza drugi raz

