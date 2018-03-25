package Source.Exceptions;

public class NoHiredVehicleException extends RuntimeException {

    @Override
    public String toString() {
        return "This user has no vehicles to return.";
    }

    public NoHiredVehicleException(){System.out.println("This user has no vehicles to return.");}
}
