package com.example.placeholdergame;

import javax.sound.sampled.AudioInputStream; //read audio data from audio file or stream
import javax.sound.sampled.AudioSystem;     //methods to interact with audio
import javax.sound.sampled.Clip;           //handles and plays audio file
import java.io.File;                      //create and manipulate file objects (paths, existence)

public class Music {

    private Clip clip; // This variable holds the audio clip that will be played

    // This method accepts the file path of a .wav file and plays the music from that location
    public void playMusic(String location) { // location is the path to the .wav file

        // Using a new thread to handle audio playback to avoid blocking the main thread
        new Thread(() -> {

            try {
                System.out.println("Attempting to play music from: " + location);
                File musicPath = new File(location); // Create a File object for the specified music file location

                // Check if the file exists at the given location
                if (musicPath.exists()) {
                    System.out.println("Music file found!");

                    // Create an AudioInputStream from the music file to load the audio
                    AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);

                    // Create a Clip object, which is used to play the audio
                    clip = AudioSystem.getClip();

                    // If the clip is already open (from a previous use), stop and close it before reusing
                    if (clip.isOpen()) {
                        clip.stop();    // Stop the clip if it's currently playing
                        clip.close();   // Close the clip to release resources
                    }

                    // Open the clip and load the audio data from the AudioInputStream
                    clip.open(audioInput);

                    // Loop the clip indefinitely (Clip.LOOP_CONTINUOUSLY)
                    clip.loop(Clip.LOOP_CONTINUOUSLY);

                    // Start playing the audio clip
                    clip.start();

                } else {
                    // If the file doesn't exist at the provided path, print a message
                    System.out.println("File not found.");
                }

            } catch (Exception e) {
                // If an error occurs (e.g., invalid file path, issue with audio format), print the error message
                System.out.println("Error occurred while playing music: " + e);
            }

        }).start(); // Start the thread to run the music-playing logic asynchronously

    }
}
