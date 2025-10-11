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
        String path2 = "projects/like_that.wav";
        File file = new File(path);
        File file2 = new File(path2);
        
        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream one = AudioSystem.getAudioInputStream(file);
            AudioInputStream two = AudioSystem.getAudioInputStream(file2)) {
            
            Clip clip1 = AudioSystem.getClip();
            clip1.open(one);
            Clip clip2 = AudioSystem.getClip();
            clip2.open(two);
            
            boolean isRun = true;
            String choice;
            
            while(isRun) {
                System.out.println("which song m = meltdown/l = likethat: ");
                String input = scanner.nextLine().toLowerCase();
                System.out.println("p = play!");
                System.out.println("S = stop");
                System.out.println("r = reset!");
                System.out.println("q to quit!");
                System.out.print("Enter your choice: ");
                choice = scanner.nextLine().toLowerCase();
                
                switch(input) {
                    case "m" -> {
                        switch(choice) {
                            case "p" -> {
                                clip1.start();
                            }
                            case "s" -> {
                                clip1.stop();
                            }
                            case "r" -> {
                                clip1.setMicrosecondPosition(0);
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
                    case "l" -> {
                        switch(choice) {
                            case "p" -> {
                                clip2.start();
                            }
                            case "s" -> {
                                clip2.stop();
                            }
                            case "r" -> {
                                clip2.setMicrosecondPosition(0);
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
                    default -> {
                        System.out.println("Enter a valid string!!");
                    }
                }
            }
            
        } catch(InputMismatchException e) {
            System.out.println("enter a valid String!");
        } catch(FileNotFoundException e) {
            System.out.println("Couldnt locate the file!");
        } catch(LineUnavailableException e) {
            System.out.println("unable to access audio resource!!!!");
        } catch(UnsupportedAudioFileException e) {
            System.out.println("Audio file is not supported!!");
        } catch (IOException e) {
            System.out.println("Something happened");
        }
    }
}