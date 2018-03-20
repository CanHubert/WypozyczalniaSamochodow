/**
 * Created by canhu on 21.05.2017.
 */

public class Application {
    public static void main(String[] args) throws RuntimeException {
        Vehicles veh = new Vehicles();
        Users u= new Users();
        Hires h = new Hires(veh, u);


        veh.add( new Motorcycle("Honda",30000, 350,true));
        veh.add( new Truck("Volkswagen",10000,5000,true));
        veh.add( new PersonalCar("Polonez",112000,"Manual",true));
        veh.add( new Motorcycle("x1", 200,100,true));
        //veh.remove(2);
        u.add( new User("Hubert"));
        u.add( new User("Angelika"));
        u.add( new User("Michał"));

        Motorcycle m = new Motorcycle("x1", 200,100,false);

        System.out.println(h.userHasVehicle(5));//poprawic~!
        System.out.println(u);
//        System.out.println(veh);
//    try{
//        h.HireAVehicle(1,1,2);
//
//        h.HireAVehicle(2,2,4);
//
//    }catch (DuplicateVehicleHireException e){
//        System.out.println("This user already has a vehicle");
//    }catch(VehicleOnStockException e){
//        System.out.println("brak pojazdu na stanie");
//    }


      try{
        h.returnVehicle(5);
      }catch (NoHiredVehicleException e){
          System.out.println("brak pojazdu do oddania");

      }
        System.out.println(h);
//        System.out.println(u);
//        System.out.println(veh);






        //System.out.println(u);
        //System.out.println(veh);
    }

}
