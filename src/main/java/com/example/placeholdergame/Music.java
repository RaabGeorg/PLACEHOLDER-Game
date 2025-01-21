package com.example.placeholdergame;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Music {

    private Clip clip;

    public void playMusic(String location) { //wav file path

        new Thread(() -> {

            //if something goes wrong, otherwise carry on as usual
            try {
                System.out.println("Attempting to play music from: " + location);
                File musicPath = new File(location);
                //checks if the file we assigned exists
                if (musicPath.exists()) {
                    System.out.println("Music file found!");
                    //create input stream with file path to our music
                    AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);

                    //creating clip object
                    clip = AudioSystem.getClip();
                    if (clip.isOpen()) {
                        clip.stop();    // Stop the clip if it's still open
                        clip.close();  // Close the clip
                    }
                    //opening file - hand file to clip
                    clip.open(audioInput);
                    //loops indefinitely, clip.loop(2) loops 2x
                    clip.loop(Clip.LOOP_CONTINUOUSLY);
                    //starting file
                    clip.start();

                } else {
                    System.out.println("File not found.");
                }

            } //prints the error so we know what went wrong
            catch (Exception e) {
                System.out.println("Error occurred while playing music: " + e);
            }

        }).start();

    }
}