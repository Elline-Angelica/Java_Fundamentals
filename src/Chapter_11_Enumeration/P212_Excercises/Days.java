package Chapter_11_Enumeration.P212_Excercises;

enum Day {

    MONDAY(true,1),
    TUESDAY(true,2),
    WEDNESDAY(true,3),
    THURSDAY(true,4),
    FRIDAY(true,5),
    SATURDAY(false,6),
    SUNDAY(false,7);

    private final boolean isWeekday;
    private final int dayIndication;

    Day(boolean isWeekday, int dayIndication){
        this.isWeekday = isWeekday;
        this.dayIndication = dayIndication;
    }

    public int getDayIndication() {
        return dayIndication;
    }

    @Override
    public String toString() {
        return "{Day " + dayIndication +
                ": Is this a weekday? -> " + isWeekday + "}";
    }
}




