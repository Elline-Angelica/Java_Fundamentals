package be.intecbrussel.carInheritance;

public class MainApp {

    public static void main(String[] args) {
        Car suv = new SUV();
        suv.setColor("Red");
        suv.setHp(250);

        Car cabrio = new Cabrio(); //polymorphisme
        cabrio.setColor("Yellow");
        cabrio.setHp(200);

        ElektrischeWagen ecar = new ElektrischeWagen();
        ecar.setColor("Green");
        ecar.charge(60);

        suv.accelerater(50);
        cabrio.accelerater(50);
        ecar.accelerater(50);
        System.out.println("speed suv: " + suv.getSpeed());
        System.out.println("speed cabrio: " + cabrio.getSpeed());
        System.out.println("speed ecar: " + ecar.getSpeed());

        Car[] parkArray = new Car[]{suv,cabrio,ecar}; //polymorphisme
        for(Car elem : parkArray){
            elem.park();
        }

        System.out.println();
        System.out.println(suv.toString());
        System.out.println(cabrio.toString());
        System.out.println(ecar);

    }

}
