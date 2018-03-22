package Source.Exceptions;

public class VehicleOnStockException extends RuntimeException {
    public VehicleOnStockException(){System.out.println("This vehicle is already hired.");}
}
