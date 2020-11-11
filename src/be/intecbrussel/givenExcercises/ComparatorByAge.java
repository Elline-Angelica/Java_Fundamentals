package be.intecbrussel.givenExcercises;

import java.util.Comparator;

public class  ComparatorByAge implements Comparator<Person> {
    // sorts Persons in descending order by age

    public int compare(Person person1, Person person2) {
        return person2.getAge()- person1.getAge();
    }
}
