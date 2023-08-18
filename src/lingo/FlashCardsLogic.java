/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marouane Guerouji
 */
package lingo;

import java.util.HashMap;
import java.util.Random;
import javax.swing.ImageIcon;
import java.util.random.RandomGenerator; 

public class FlashCardsLogic {
    alphabetsController logic ; 
    HashMap < String, Alphabet> map;
    String alphabet = ""; 
    int counter = 0; 
    
    /**
     * Constructor. 
     */
    public FlashCardsLogic(int counter){
        logic = new alphabetsController();
        map = logic.getAlphaNodes();
        this.counter = counter; 
        this.alphabet = counter + ""; 
      
    
    }
    /**
     * Method to help generate a random letter. 
     */
    public void getRandomAlphabet(){
        Random rand = new Random();
        counter = rand.nextInt(28) + 1;
        alphabet  = ""+counter; 
      
    
    }
    /**
     * Method to set the next letter if the current letter is not the last one. 
     */
    public void next(){
        if (counter < 28){
             alphabet = ++counter +""; 
        }
     
    }
    /**
     * Picture to set the previous letter if the current letter is not the first one. 
     */
    public void setPrev(){
        if (counter >1 )
            alphabet = --counter +""; 
    
    }
    
    /**
     * Method to retrieve alphabet picture. 
     * @return The retrieved picture. 
     */

    public ImageIcon getImage(){
       return  map.get(alphabet).imageGetter(); 
    
    }
    /**
     * Method to get alphabet audio. 
     */
    public void getAudio(){
        map.get(alphabet).getAudio();
        
    
    }
    /**
     * method to get the pronunciation literals. 
     * @return the correct pronunciation. 
     */
    public String getPonunciation(){
       return  map.get(alphabet).AlphabetNameGetter();   
    }
    
    
    

    
    public static void main(String [] arg){
        //FlashCardsLogic
        FlashCard flash = new FlashCard(); 
       MainFrame frame = new MainFrame(flash);
     // FlashCardsLogic m = new FlashCardsLogic();
     /// m.getRandomAlphabet();
     /// m.getAudio();
    
    
    }
    
    
    
}
