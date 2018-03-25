package Source.Exceptions;

public class HasVehicleException extends RuntimeException{
    @Override
    public String toString() {
        return "Please, return vehicle first!";
    }

    public HasVehicleException(){
        System.out.println("Please, return vehicle first!");
    }
}
