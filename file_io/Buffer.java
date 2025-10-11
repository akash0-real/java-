package file_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Buffer {
    public static void main(String[] args) {
        String file_path = "//home//ayush//project//java//Test.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(file_path));){
            String line;
            while((line = reader.readLine())!= null){
                System.out.println(line);

            }

        } catch (FileNotFoundException e) {
            System.out.println("Coudnt locate file!");
        }
        catch(IOException e){
            System.out.println("something went wrong!");

        }


    }
}
