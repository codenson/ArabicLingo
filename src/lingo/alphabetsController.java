/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lingo;



import java.util.HashMap;
import java.util.Set;
import javax.swing.JComponent;
import javax.swing.JScrollPane;


/**
 *
 * @author guero
 */
public class alphabetsController {
    
    private HashMap < String, Alphabet> alphaMap = new HashMap(); 
    private String [] alphabetsPronunciation; 
    
    
    public alphabetsController(){
        intilizeMap(); 
       /// alphaMap.get("1").
    
    }
    /**
     * getter for hashMap. 
     * @return Alphabets HashMap. 
     */
    public HashMap getAlphaNodes(){
        return alphaMap; 
    }
    
    private void intilizeMap() {
        inti_pron(); ///initializes the alphabet Array of strings 

        for (int i = 1; i < 29; i++) {

            String n = "" + i;

            Alphabet intiaNode = new Alphabet(n);
            
            intiaNode.setAlphabetName(alphabetsPronunciation[i]);
            intiaNode.imageGetter(n);
            intiaNode.getAudioMP3(n);

            alphaMap.put(n, intiaNode);

        }
    }
    
    private void inti_pron(){
        alphabetsPronunciation = new String[29]; 
        alphabetsPronunciation[1] = "alif"; 
        alphabetsPronunciation[2] = "Baa"; 
        alphabetsPronunciation[3] = "Taa"; 
        alphabetsPronunciation[4] = "Thaa";
        alphabetsPronunciation[5] = "Jeem"; 
        alphabetsPronunciation[6] = "Haa"; 
        alphabetsPronunciation[7] = "Kha'a"; 
        alphabetsPronunciation[8] = "Daal"; 
        alphabetsPronunciation[9] = "Dhaal";
        alphabetsPronunciation[10] = "Raa'a"; 
        
   
        alphabetsPronunciation[11] = "Zaa'a"; 
        alphabetsPronunciation[12] = "Seen"; 
        alphabetsPronunciation[13] = "Sheen"; 
        alphabetsPronunciation[14] = "Saad";
        alphabetsPronunciation[15] = "Dhaad"; 
        alphabetsPronunciation[16] = "Ttaa'a"; 
        alphabetsPronunciation[17] = "Dhaad"; 
        alphabetsPronunciation[18] = "3ayn"; 
        alphabetsPronunciation[19] = "ghayn";
        alphabetsPronunciation[20] = "Faa'a"; 
        
       
        alphabetsPronunciation[21] = "9aaf"; 
        alphabetsPronunciation[22] = "Kaa'f"; 
        alphabetsPronunciation[23] = "Laam"; 
        alphabetsPronunciation[24] = "Meem";
        alphabetsPronunciation[25] = "Noon"; 
        alphabetsPronunciation[26] = "Wa'a"; 
        alphabetsPronunciation[27] = "Haa'a"; 
        alphabetsPronunciation[28] = "Yaa'a"; 

        
        
        
    
    }

    
    public static void main(String [] args){
        alphabetsController a = new alphabetsController(); 
       /// Set <String> set = a.getAlphaNodes().keySet(); 
       Set <String> set =  a.getAlphaNodes().entrySet(); 
        ///System.out.println("set: "+ set.toString());
       
      /// for (int i = 0 ; i < set.size(); i++)
       HashMap < String, Alphabet> alphaMap = a.getAlphaNodes(); 
        set =  alphaMap.keySet(); 
     
      
//       for (String s : set){
//         ////  String 
//           ///System.out.println("s: "+ s);
//           System.out.println("node.name: "+ alphaMap.get(s).nameGetter() + " alpha: "+alphaMap.get(s).AlphabetNameGetter() );
//           
//       }
alphPanel pan = new alphPanel(alphaMap);
MainFrame frame = new MainFrame(pan);

//FlashCard flash = new FlashCard(); 
//       MainFrame frame = new MainFrame(flash);
       
      ///  System.out.println("map size: "+alphaMap.size() );
        
       
       /// JScrollPane scroll = new JScrollPane(pan);
        ///scroll.setVisible( rootPaneCheckingEnabled);
        
        
      /// frame.setPanel(pan);
//       frame.setSize(1200, 600);
//       frame.setContentPane(pan);
//       
//       frame.setVisible(true);
        
    
    }
    
}
