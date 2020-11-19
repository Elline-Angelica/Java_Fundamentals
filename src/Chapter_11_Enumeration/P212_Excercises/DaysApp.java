package Chapter_11_Enumeration.P212_Excercises;

public class DaysApp {

    public static void main(String[] args) {

        Day day = Day.SATURDAY;
        System.out.println(day);

        Day[] days = Day.values();
        for(Day temp : days){
            System.out.println(temp.name());
            System.out.println(temp.ordinal());
        }
    }

}
