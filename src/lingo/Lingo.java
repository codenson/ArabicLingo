/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lingo;




import javax.swing.JScrollPane;

/**
 *
 * @author guero
 */
public class Lingo {
    MainFrame frame; 
    MainMenu menu; 
    alphPanel table; 
    alphabetsController tableController; 
    FlashCard flashCards ; 
   /// JScrollPane scroll ;/// = new JScrollPane(pan);
        ///scroll.setVisible( rootPaneCheckingEnabled)
    
    public void displayMainMenu(){
        menu= new MainMenu(this);
        PanelsContainer.addPanel("MainMenu", menu); 
       
       /// addPanel("menu",menu );
        //FlashCard flash = new FlashCard(); 
        ///scroll = new JScrollPane(menu);
        ///scroll.setVisible( true);
      /// scroll.setVisible( true);
        frame = new MainFrame(menu);
        PanelsContainer.setFrame(frame);
       
        
       
        ///frame.setVisible(true);
    
    }
    
    public void displayTable(){
       
       tableController = new  alphabetsController();
       table = new alphPanel(tableController.getAlphaNodes()); 
       PanelsContainer.addPanel("table", table);
       
       ///menu.setVisible(false);
       ///table.setVisible(true); 
       ///frame.setPanel(table );
       ///frame = new MainFrame(table);
       
       /// frame.changeView(table);
       /// PanelsContainer.changePanView(table);
        PanelsContainer.changePanViewTable(table);
        
        
       
    
    }
    
    public void setFlashCards(){
        flashCards = new FlashCard();
        PanelsContainer.addPanel("flashCards", flashCards);
        
        //menu.setVisible(false);
//        frame.setPanel(flashCards);
//        ///flashCards.setVisible(true);
//        frame.repaint();
//        frame.revalidate();

            frame.changeView(flashCards);
             PanelsContainer.changePanView(flashCards);
        
            //frame = new MainFrame(flashCards);
    
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /// PanelsContainer panels = new PanelsContainer(); 
        Lingo start = new Lingo(); 
        start.displayMainMenu();
    }
    
}
