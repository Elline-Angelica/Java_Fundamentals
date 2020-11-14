package Chapter_05_ProgrammingBasics;

public class P104_BmiApplication {

    public static void main(String[] args) {

        System.out.println("Enter your length (cm)");
        float height = P104_KeyboardUtility.readIntCM();
        System.out.println("Enter your weight (kg)");
        float weight  = P104_KeyboardUtility.readIntKG();
        float bmi = P104_BmiUtility.calculateBmi(weight,height);
        System.out.println("Your bmi is "+ bmi);
        System.out.println(P104_BmiUtility.printDiagnose(bmi));

    }
}
