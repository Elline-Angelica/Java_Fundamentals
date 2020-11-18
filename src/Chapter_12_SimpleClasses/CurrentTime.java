package Chapter_12_SimpleClasses;

import java.text.SimpleDateFormat;
import java.util.*;

public class CurrentTime {

    public static void main(String[] args) {

        // https://docs.oracle.com/javase/7/docs...

        Date currentDate = new Date();
        System.out.println(currentDate);

        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
        System.out.println(timeFormat.format(currentDate));

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(dateFormat.format(currentDate));

        SimpleDateFormat weekdayFormat = new SimpleDateFormat("EEEE");
        System.out.println(weekdayFormat.format(currentDate));

        SimpleDateFormat clockFormat = new SimpleDateFormat("h:mm a");
        System.out.println(clockFormat.format(currentDate));

    }
}
