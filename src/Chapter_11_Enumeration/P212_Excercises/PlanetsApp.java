package Chapter_11_Enumeration.P212_Excercises;

public class PlanetsApp {

    public static void main(String[] args) {

        System.out.println();
        Planets[] planets = Planets.values();
        for(Planets temp : planets){
            System.out.print("Name: " + temp.name() + " Order: " + temp.ordinal() + " - ");
            System.out.println(temp);
        }


    }

}
