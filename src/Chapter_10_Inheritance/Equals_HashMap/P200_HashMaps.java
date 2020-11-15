package Chapter_10_Inheritance.Equals_HashMap;

import java.util.HashMap;

public class P200_HashMaps {
    public static void main(String[] args) {

        HashMap<String, Integer> numStorage = new HashMap<>();
        numStorage.put("a",5);
        numStorage.put("b",10);
        numStorage.put("c",15);

        System.out.println(numStorage);
        System.out.println(numStorage.get("b"));

        HashMap<String, String> logInData = new HashMap<>();
        logInData.put("EllineMedrano1408", "Angelica"); //left = key, right = value
        logInData.put("SofiaMedrano2805", "ImNotADog");
        logInData.put("ArianaGrande2607", "IRunPop");

        logInData.remove("ArianaGrande2607");
        System.out.println(logInData);
        System.out.println(logInData.containsValue("ImNotADog")); //returns boolean
        System.out.println(logInData.size());
        System.out.println(logInData.replace("EllineMedrano1408","ANGELICA!"));
        System.out.println(logInData);
        System.out.println(logInData.keySet());

        //similar to arrays except can't rely on order only through keys and values
    }

}
