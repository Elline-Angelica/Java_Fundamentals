package Chapter_11_Enumeration.P212_Excercises;

public class DaysApp {

    public static void main(String[] args) {

        Day[] daysArr = Day.values();

        System.out.println(daysArr[2]);

        Day day = Day.SATURDAY;

        System.out.println("Is this day a weekday?");
        System.out.println(day);
        System.out.println(day.getDayIndication());
    }

}
