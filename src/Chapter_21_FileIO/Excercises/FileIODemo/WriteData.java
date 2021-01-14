package Chapter_21_FileIO.Excercises.FileIODemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {

    public void writeStringToFile(String myText) {

        File myTextFile = new File("resources/MyTextFile");

        try {
            FileWriter fileWriter = new FileWriter(myTextFile, true);
            fileWriter.write(myText);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
