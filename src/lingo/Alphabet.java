/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lingo;

import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
  
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import jaco.mp3.player.MP3Player;
import javax.swing.Icon;
import javax.swing.ImageIcon;



/**
 *
 * @author guero
 */
public class Alphabet {
     String name = ""; 
     String alphabetName=""; 
     Clip clip;
    
    public Alphabet (String name){
        this.name = name;
    
    }
     public Alphabet (String name, String alphabetName){
        this.name = name;
        this.alphabetName= alphabetName;
    
    }
    /**
     * getter. 
     * @return 
     */
    public String nameGetter(){
        return this.name; 
    }
    
    /**
     * setter. 
     * @param alphabetName 
     */
    public void setAlphabetName(String alphabetName ){
        this.alphabetName= alphabetName;
    }
    /**
     * getter 
     * @return 
     */
    public String AlphabetNameGetter(){
    return this.alphabetName; 
    }
    
    /**
     * method to load an  image from the file. 
     * @return alphabet image to be used for display. 
     */
    public ImageIcon  imageGetter(String name){
        BufferedImage img = null;
        String s="C:\\Users\\guero\\OneDrive\\Documents\\NetBeansProjects\\Lingo\\src\\lingo\\Images\\";
        s+=  name+ ".png"; 
       /// System.out.println("lingo.Alphabet.imageGetter()"+ s);
      
        
try {
    img = ImageIO.read(new File(s));
} catch (IOException e) {
}
        
        return  new ImageIcon(img);
    }
    
    /**
     * Method to retrieve MP3 audio file off the path and plays an alphabet audio. 
     */
public void getAudio(){
    String fileName = "C:\\Users\\guero\\OneDrive\\Documents\\NetBeansProjects\\Lingo\\Audio\\"; 
    fileName+= this.nameGetter()+".MP3"; 
    
    /////MP3Player player = new MP3Player();
    MP3Player sound = new MP3Player(new File(fileName));
    sound.play();

}
/**
 * Method to retrieve audio from folder. 
 * @param aud audio to be retreived name. 
 * @return the MP3 audio requested.
 */
public MP3Player getAudioMP3(String aud){
    String fileName = "C:\\Users\\guero\\OneDrive\\Documents\\NetBeansProjects\\Lingo\\Audio\\a.MP3"; 
    /////MP3Player player = new MP3Player();
    String s="C:\\Users\\guero\\OneDrive\\Documents\\NetBeansProjects\\Lingo\\Audio\\"; 
        s+=  name+ ".MP3"; 
    MP3Player sound = new MP3Player(new File(s));
    ///sound.play();
    return sound; 

}

     public static void main (String [] args) throws LineUnavailableException, IOException, UnsupportedAudioFileException{
         Alphabet a = new Alphabet("a");
         ///a.getAudio();  
         alphabetsPanel p = new alphabetsPanel();
         ///p.setVisible(true);
         FrameDisp f = new FrameDisp(); 
        /// p.setVisible(true);
        f.setPanel(p); 
       
         
         ////f.add(p);
         
         f.setVisible(true);
         
         
         

}
}
