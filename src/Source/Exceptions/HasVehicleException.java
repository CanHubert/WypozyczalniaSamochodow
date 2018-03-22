package Source.Exceptions;

public class HasVehicleException extends RuntimeException{
    public HasVehicleException(){
        System.out.println("Please, return vehicle first!");
    }
}
