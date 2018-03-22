package Source.Comparators;

import Source.Vehicles.Vehicle;

import java.util.Comparator;


public class CompareByID implements Comparator<Vehicle>{

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        String s1= String.valueOf(o1.getID());
        String s2= String.valueOf(o2.getID());
        return s1.compareTo(s2);
    }
}
