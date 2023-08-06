/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lingo;


import java.util.HashMap;
import java.util.Set;
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
   /// private ArrayInit
    private void intilizeMap(){
         Alphabet node[] = new Alphabet[29] ; 
        
//         for (int i = 1; i < 4; i++){
//             String n = ""+ i; 
//             node[i] = new Alphabet(n);
//            /// node[i].name= n; 
//             node[i].imageGetter(node[i].name); 
//             node[i].getAudioMP3(n); 
//         
//         }
         int l = 1; 
         System.err.println("node.length: "+node.length);
        for (int i = 1; i < node.length; i++)
        {
            //int m = i; 
           
           /// if (i != 0)
            { 
                String n = ""+ i; 
            node[i]  = new Alphabet(n);
           /// System.out.println("i: "+l++ + " node[i]: "+node[i].nameGetter());
            //if (i != 10 || i != 11)
            {
            node[i].imageGetter(n); 
            
            node[i].getAudioMP3(n); 
            alphaMap.put(n, node[i]); 
            }
            
            }
           
         
        
        }
        System.out.println("map Si: "+ alphaMap.size());
        System.out.println("28: "+ alphaMap.get("28").name);
    
    }
    
    
    public static void main(String [] args){
        alphabetsController a = new alphabetsController(); 
        Set <String> set = a.getAlphaNodes().keySet(); 
       ///Set <String> set =  a.getAlphaNodes().entrySet(); 
        ///System.out.println("set: "+ set.toString());
       
      /// for (int i = 0 ; i < set.size(); i++)
       HashMap < String, Alphabet> alphaMap = a.getAlphaNodes(); 
     
      
//       for (String s : set){
//         ////  String 
//           ///System.out.println("s: "+ s);
//           System.out.println("node.name: "+ alphaMap.get(s).nameGetter());
//           
//       }
alphPanel pan = new alphPanel(alphaMap);
       MainFrame frame = new MainFrame(pan);
       
        System.out.println("map size: "+alphaMap.size() );
        
       
       /// JScrollPane scroll = new JScrollPane(pan);
        ///scroll.setVisible( rootPaneCheckingEnabled);
        
        
      /// frame.setPanel(pan);
//       frame.setSize(1200, 600);
//       frame.setContentPane(pan);
//       
//       frame.setVisible(true);
        
    
    }
    
}
