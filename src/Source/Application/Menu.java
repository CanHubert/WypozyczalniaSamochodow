package Source.Application;

import Source.Database.Database;
import Source.Exceptions.*;
import Source.Vehicles.*;
import Source.Users.*;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Menu {

    public static  void menu(Database db){
        int option;
        do {option= InputInt("Menu:\n\n1 - Add/remove user\n2 - Add/remove Vehicle\n3 - Hires\n4 - Display\n0 - Save&Exit");
            switch(option){
                case 1: {optionUser(db);}break;
                case 2: {optionVehicle(db);}break;
                case 3: {optionHires(db);}break;
                case 4: {optionDisplays(db);}break;
                default:{}}
        } while (option!=0);
    }

    private static void Wait(){
        System.out.println("Press any button to continue...");
        String sc =new Scanner(System.in).nextLine();
    }
    private static void optionUser(Database db){
        int option;
        option= InputInt("User:\n  1 - Add User\n  2 - Remove User\n  0 - Back");
        switch (option){
            case 1:{optionAddUser(db);Wait();}break;
            case 2:{optionRemoveUser(db);Wait();}break;
            case 0:{}break;}
    }
    private static void  optionAddUser(Database db){
        System.out.println("Insert name:");
        String name= new Scanner(System.in).nextLine();
        User u = new User(name,db);
        db.getUsers().add(u);
        System.out.println("User successful added to database.");
        System.out.println("Your ID :"+(u.getId()));
    }
    private static void optionRemoveUser(Database db){
        int id= InputInt("Remove users with ID:");
        User user =db.getUsers().getUserbyID(id);
        try {db.getUsers().remove(user,db);
            System.out.println("User with ID "+id+" removed from database.");
        } catch (UserExistException| HasVehicleException e) {}
    }
    private static void optionVehicle(Database db){
        int veh;
        veh= InputInt("Vehicle: \n  1 - Add truck\n  2 - Add personal car\n  3 - Add motorcycle\n  4 - Remove vehicle\n  0 - Back");
        switch (veh){
            case 1:{addTruck(db);}break;
            case 2: {addPersonalCar(db);}break;
            case 3:{addMotorcycle(db);}break;
            case 4:{removeVehicle(db);}break;
            case 0:{}break;
            default:{};}
    }
    private static void addTruck(Database db){
        System.out.println("Insert name:");
        String name = new Scanner(System.in).nextLine();
        double milage = InputDouble("Insert milage:");
        int load = InputInt("Insert load:");
        Truck t = new Truck(name, milage,load,db);
        db.getVehicles().add(t);
        System.out.println("Truck ID :"+ t.getID());
        Wait();
    }
    private static void addPersonalCar(Database db){
        System.out.println("Insert name:");
        String name = new Scanner(System.in).nextLine();
        double milage = InputDouble("Insert milage:");
        int trans;
        String transmission=null;
        do {
            trans = InputInt("Choose transmission: 1 - Auto, 2 - Manual)");
            switch (trans){
                case 1: {transmission= "Auto";}break;
                case 2: {transmission= "Manual";}
                default:
                    System.out.println("Try again");}
        } while (trans!=1 && trans!=2);
        PersonalCar pc = new PersonalCar(name, milage, transmission,db);
        db.getVehicles().add(pc);
        System.out.println("Car ID :"+ pc.getID());
        Wait();
    }
    private static void addMotorcycle(Database db){
        System.out.println("Insert name:");
        String name = new Scanner(System.in).nextLine();
        double milage = InputDouble("Insert milage:");
        double weight = InputDouble("Insert weight:");
        Motorcycle m = new Motorcycle(name,milage,weight,db);
        db.getVehicles().add(m);
        System.out.println("Motorcycle ID :"+m.getID());
        Wait();
    }
    private static void removeVehicle(Database db){
        int id = InputInt("Remove vehicle with ID: ");
        Vehicle v= db.getVehicles().getVehicleByID(id);
        try {db.getVehicles().remove(v,db);
            System.out.println("Vehicle with ID "+id+" removed from database");
        } catch (VehicleOnStockException|VehicleExistException e) {}
    }
    private static void optionHires(Database db){
        int option= InputInt("Hires:\n  1 - Hire a vehicle\n  2 - Return a vehicle\n  0 - Back");
        switch (option){
            case 1:{optionHireVehicle(db);}break;
            case 2:{optionReturnVehicle(db);}break;
            case 0:{}break;
            default:{};}
    }
    private static void optionHireVehicle(Database db)throws RuntimeException{
        int idUser =  InputInt("Insert User's ID");
        int idVeh = InputInt("Insert Vehicle ID");
        int day = InputInt("How many days to hire?");
        try {db.getHires().HireAVehicle(idUser, idVeh, day,db);
            System.out.println("User ("+db.getUsers().getUserbyID(idUser).toString2()+") hired ("+db.getVehicles().getVehicleByID(idVeh).toString2()+")");
        }catch (UserExistException|VehicleExistException|DuplicateVehicleHireException|VehicleOnStockException e){}
        Wait();
    }
    private static void optionReturnVehicle(Database db) throws RuntimeException{
        int idUser =InputInt("Insert User's ID");
        try{db.getHires().returnVehicle(idUser,db);
            System.out.println("Vehicle successfully returned.");
        }catch (UserExistException | NoHiredVehicleException e){}
        Wait();
    }
    private static void optionDisplays(Database db){
        int option;
        do {option = InputInt("Display:\n  1 - Users\n  2 - Vehicles\n  3 - Hires\n  0 - Back");
            switch (option){
                case 1 :{optionDisplayUser(db);}break;
                case 2:{optionDisplayVehicles(db);}break;
                case 3:{optionDisplayHires(db);}break;
                default:{}
            }} while (option!=0);
    }
    private static void optionDisplayUser(Database db){
        int i =InputInt("Display: Users\n  1 - All\n  2 - With vehicles\n  3 - Without vehicles\n  4 - By ID\n  0 - Back");
        switch (i){
            case 1:{
                System.out.println(db.getUsers());
                Wait();
            }break;
            case 2:{
                System.out.println("Users with vehicles:");
                System.out.println(db.getUsers().printByVehicle(db,true));
                Wait();
            }break;
            case 3:{
                System.out.println("Users without vehicles:");
                System.out.println(db.getUsers().printByVehicle(db,false));
                Wait();
            }break;
            case 4:{
                int a = InputInt("Search by specific ID");
                try {
                    System.out.println(db.getUsers().printByID(a,db));
                } catch (UserExistException e) {}
                Wait();
            }break;
            case 0:{

            }break;
            default:{}
        }
    }
    private static void optionDisplayVehicles(Database db){
        int i = InputInt("Display: Vehicles\n  1 - All by ID\n  2 - All by type\n  3 - By ID\n  0 - Back");
        switch (i){
            case 1:{
                System.out.println("Vehicles sorted by ID:");
                System.out.println(db.getVehicles().printByID()); Wait();
            }break;
            case 2:{
                System.out.println("Vehicles sorted by type:");
                System.out.println(db.getVehicles().printByType()); Wait();
            }break;
            case 3:{
                int a = InputInt("Search by specific ID");
                try{
                    System.out.println(db.getVehicles().printBySpecID(a,db)); Wait();
                }catch (VehicleExistException e){}
            }break;
            case 0:{

            }break;
            default:{}
        }
    }
    private static void optionDisplayHires(Database db){
    int i= InputInt("Display: Hires\n  1 - All\n  2 - Hired\n  3 - Returned\n  0 - Back");
    switch(i){
        case 1:{System.out.println(db.getHires());Wait();}break;
        case 2:{System.out.println(db.getHires().PrintByStatus(true));Wait();}break;
        case 3:{System.out.println(db.getHires().PrintByStatus(false));Wait();}break;
        case 0:{}break;
        default:

    }}
    private static int InputInt(String s){
        System.out.println(s);
        int i;
        try{
            i= new Scanner(System.in).nextInt();
            if(i<0){
                System.out.println("Please insert value more than 0");
                return InputInt(s);
            }
            else return i;
        }catch(InputMismatchException e){
            System.out.println("Inserted value is invalid. Try again...\n");
            return InputInt(s);
        }
    }

    private static double InputDouble(String s){
        System.out.println(s);
        double d;
        try{
            d= new Scanner(System.in).nextDouble();
            if(d<0){
                System.out.println("Please insert value more than 0");
                return InputDouble(s);
            }
           else return d;
        }catch (InputMismatchException e){
            System.out.println("Inserted value is invalid. Try again...\n");
            return InputDouble(s);
        }
    }


}
