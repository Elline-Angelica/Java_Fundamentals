package Chapter_A_5_ProgrammingBasics;

public class P104_BmiUtility {

    private static float calc;

    public static float calculateBmi(float weight, float height) {
        calc = weight / (height*height);
        return calc;
    }

    public static String printDiagnose(float bmi) {
        if (calc < 18.5) {
            return "Your weight status = underweight";
        } else if (calc >= 18.5 && calc <= 24.9) {
            return "Your weight status = normal";
        } else if (calc >= 25.0 && calc <= 29.9) {
            return "Your weight status = Overweight";
        } else if (calc >= 30.0) {
            return "Your weight status = Obese";
        } else {
            return "Please enter valid inputs";
        }
    }
}
