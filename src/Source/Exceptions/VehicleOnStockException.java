package Source.Exceptions;

public class VehicleOnStockException extends RuntimeException {

    @Override
    public String toString() {
        return "This vehicle is already hired.";
    }

    public VehicleOnStockException(){System.out.println("This vehicle is already hired.");}
}
