package Chapter2._1_FileIO.WritingToFile;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    /*
    write some text to a file on a particular path in src/main/resources.
     */
    public void write(String filepath, String text) {
        try {
            FileWriter writer = new FileWriter("/Users/vontecarter/Desktop/Full Stack/Java/src/main/resources/Files/BlankFile.txt");
            writer.write("success");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
