package file_io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Random_acc {
    public static void main(String[] args) {
        String path = "Test.txt";
        try(RandomAccessFile one = new RandomAccessFile(path,"r")){
            String line;
            while((line = one.readLine())!= null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Couldnt locate the file!!");
        }
        catch(IOException e){
            System.out.println("Something went wrong!!");
        }
    }
}
