/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lingo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random; 

/**
 *
 * @author guero
 */
public class QuizTaker {
    
    alphabetsController alphabets; 
    private HashMap < String, Alphabet> alphaMap; 
    private  HashMap < Integer, Boolean> picked; 
     ArrayList <String> list = new ArrayList() ; 
    
    int counter = 0; 
    int score= 0; 
    Alphabet alph1Correct; 
    Alphabet alph2; 
    Alphabet alph3; 
    
    public QuizTaker(){
        alphabets = new alphabetsController(); 
        alphaMap = alphabets.getAlphaNodes(); 
      ///  alphaMap = new alphabetsController().getAlphaNodes(); 
        picked = new HashMap();
        ///alphabets.getAlphaNodes().
        ///System.out.println("lingo.QuizTaker.<init>()" + alphaMap.get("1").AlphabetNameGetter());
       /// alphaMap.get("1"); 
        
    }
    public Alphabet CorrectAlphGetter(){
       return this.alph1Correct; 
    }
    
    public ArrayList<String> ramdomanizeOptions(){
           list = new ArrayList();
            ///System.out.println("Here are the alph:       "+alph2.AlphabetNameGetter()+ " \n alph3: "+ alph3.AlphabetNameGetter() );
            list.add(this.alph1Correct.AlphabetNameGetter()); 
            list.add(this.alph2.AlphabetNameGetter()); 
            list.add(this.alph3.AlphabetNameGetter()); 

             System.out.println("Listhere:  : "+ list);
            Collections.shuffle(list);
            Collections.shuffle(list);
     
       /// System.out.println("lingo.QuizTaker.ramdomanizeOptions()");


            
            
            return list;
    
      }
    
    public boolean comparepick(String pick){
        return pick.equals(this.alph1Correct.AlphabetNameGetter());
    
    }
    public int updateScore(){
        return ++score;
    }
    /**
     * method to keep track of rounds. 
     * @return current round. 
     */
    public int roundNumber(){
        
    
    return ++counter; 
    }
    public void updateRoundNumber(){
        counter++; 
    
    }
    
    public boolean setUpNewRound(){
        if (counter < 5){
        assignTestAlphabets(); 
        counter++; 
        return true; 
        }
        return false; 
        
    
    }
            
            
    public void assignTestAlphabets(){
        alph1Correct = pickRandom(); 
        ///System.out.println("alph1Correct : "+ alph1Correct.alphabetName);
        //list.add(alph1Correct.AlphabetNameGetter());
        
        ///num1 = rand.nextInt(28)+1; 
        
        alph2 = pickTestAlph(alph1Correct, null);
        //list.add(alph2.AlphabetNameGetter());
       /// System.out.println("alph2 : "+alph2.AlphabetNameGetter() );
        alph3 = pickTestAlph(alph1Correct, alph2); 
        ///list.add(alph3.AlphabetNameGetter()); 
        ///System.out.println("alp3: : "+ alph3.alphabetName);
            //System.out.println("\n");
            
            /// System.out.println("\n");
           // System.err.println("List: "+ list);
           // Collections.shuffle(list);
            ///System.out.println("random: "+ list);
        
         ///ramdomanizeOptions();
        
       
        
        
    }
    /**
     * method to pick a blaff test material for multiple choice questions. 
     */
    private Alphabet pickTestAlph(Alphabet alphCompare, Alphabet second){
        int num = -1; 
        Alphabet alph= null; 
        for (int i = 0; i < 29; i++){
             Random rand = new Random(); 
              num = rand.nextInt(28)+1;
             if (!picked.containsKey(num)  )
             {
                 if (alphaMap.get(num) != second)
                  break; 
                 //return  alph = alphaMap.get(num+""); 
             }
        
        
        }
        return  alph = alphaMap.get(num+""); 
      //  return null; 
        
//        while(  alph == alphCompare  || alph == second ){
//            System.out.println("here");
//        
//        
//               Random rand = new Random(); 
//                int num = rand.nextInt(28)+1; 
//                alph = alphaMap.get(num); 
//        }
//        return alph; 
        
    
    }
    
    /**
     * Method to pick an alphabet that has not showed up as a question in the test yet. 
     * @return alphabet that has not been picked yet. 
     */
    private Alphabet pickRandom (){ 
        int num =-1; 
        for (int i = 0; i < 29; i++){
            Random rand = new Random(); 
            num = rand.nextInt(28)+1; 
            if (!picked.containsKey(i)){
                 picked.put(num, Boolean.TRUE); 
            break; 
            }
            
        
        }
        
//        while (picked.containsKey(num+"")){
//            System.out.println("lingo.QuizTaker.pickRandom()");
//            
//                Random rand = new Random(); 
//                num = rand.nextInt(28)+1; 
//                        
//        }
       /// picked.put(num, Boolean.TRUE); 
       /// System.out.println("here: "+ num +" alpCorrect : "+ alphaMap.get(num+"").AlphabetNameGetter() );
        Alphabet m = alphaMap.get(num+""); 
        return m; 
        
       /// return alphaMap.get(num); 
     
    }
    
    
    public static void main(String [] args){
        QuizTaker m = new QuizTaker();
       // m.assignTestAlphabets();
      //  m.
      QuizPanel pan = new QuizPanel(m);
MainFrame frame = new MainFrame(pan);
        
        
    
    
    }
    
    
    
    
    
}
