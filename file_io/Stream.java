package file_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Stream {
    public static void main(String[] args) {
        String file_path = "Test.txt";
        try(FileInputStream one = new FileInputStream(file_path)){
            int data;
            while((data=one.read()) != -1){
                System.out.print((char)data);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Coudlnt locate the file!");
        }
        catch(IOException e){
            System.out.println("Something went wrong!");
        }
    }
}
