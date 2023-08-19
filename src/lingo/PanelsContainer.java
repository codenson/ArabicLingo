/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lingo;
import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

/**
 *
 * @author guero
 */
public class PanelsContainer {
    public static  HashMap <String , JPanel> panelsMap = new HashMap();
     public static MainFrame frame;
    
     public static void addPanel(String name , JPanel pan ){
         panelsMap.put(name, pan); 
         
     }
    
    public static JPanel getContainer(String s){
        
    
    return panelsMap.get(s) ; 
    }
    
    public static void setFrame(  MainFrame frames){
         frame = frames; 
         frame.setVisible(true);
    
    }
     public static void changePanView(JPanel pan ){
         frame.frameSizeSetters(pan.getSize().width, pan.getSize().height);
         frame.updateFramSize(pan);
          ///frame.changeView(pan);
     
     }
//     public static void changePanViewTable(JPanel pan){
//         /// frame.changeView(pan);
//          frame.changeViewTable(pan);
//     
//     }
    
    
}
