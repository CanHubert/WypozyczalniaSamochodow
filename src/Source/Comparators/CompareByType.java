package Source.Comparators;

import Source.Vehicles.Vehicle;

import java.util.Comparator;


public class CompareByType implements Comparator<Vehicle>{
    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        String s1 = o1.getClass().toString();
        String s2 = o2.getClass().toString();
        return s1.compareTo(s2);
    }
}
