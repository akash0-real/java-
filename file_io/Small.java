package file_io;

import java.io.FileWriter;
import java.io.IOException;

public class Small {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("Test.txt");){
            writer.write("I like momos");
            System.out.println("file has been writtten!");

        }catch (IOException e) {
            System.out.println("couldnt write files!!");
        }
    }
}

