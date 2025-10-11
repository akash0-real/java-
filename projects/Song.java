package projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
public class Song {
    public static void main(String[] args) {
        String path = "projects/meltdown.wav";
        File file = new File(path);
        try(Scanner scanner = new Scanner(System.in);AudioInputStream one = AudioSystem.getAudioInputStream(file)){
            
                Clip clip = AudioSystem.getClip();
                clip.open(one);
                boolean isRun = true;
                String choice;
                while(isRun){
                    System.out.println("p = play!");
                    System.out.println("S = stop");
                    System.out.println("r = reset!");
                    System.out.println("q to quit!");
                    System.out.print("Enter your chiice: ");
                    choice = scanner.nextLine().toLowerCase();

                    switch(choice){
                        case "p" ->{
                            clip.start();
                        }
                        case "s" ->{
                            clip.stop();
                        }
                        case "r" -> {
                            clip.setMicrosecondPosition(0);
                        }
                        case "q" -> {
                            System.out.println("bye...");
                            isRun = false;
                        }
                        default -> {
                            System.out.println("enter a valid string!!");
                        }
                    }

                }

            
        }catch(InputMismatchException e){
            System.out.println("enter a valid String!");
        }
        catch(FileNotFoundException e){
            System.out.println("Couldnt locate the file!");
        } 
        
        catch(LineUnavailableException e){
            System.out.println("unable to access audio resource!!!!");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported!!");
        }
        catch (IOException e) {
            System.out.println("Something happened");
        }
        
    }
}
