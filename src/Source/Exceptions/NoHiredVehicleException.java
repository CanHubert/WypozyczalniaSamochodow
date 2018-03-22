package Source.Exceptions;

public class NoHiredVehicleException extends RuntimeException {
    public NoHiredVehicleException(){System.out.println("This user has no vehicles to return.");}
}
