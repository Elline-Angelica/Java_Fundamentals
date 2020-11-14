package be.intecbrussel.associations_aggregations.Part2;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    public int compare(Person a, Person b){
        return b.getAge() - a.getAge();
    }
}
