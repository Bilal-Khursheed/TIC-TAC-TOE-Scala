/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salma_maryam_elaf;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TicTacToe extends JFrame{
   
    JButton Button1=new JButton(); 
    JButton Button2=new JButton(); 
    JButton Button3=new JButton(); 
    JButton Button4=new JButton(); 
    JButton Button5=new JButton(); 
    JButton Button6=new JButton(); 
    JButton Button7=new JButton(); 
    JButton Button8=new JButton(); 
    JButton Button9=new JButton(); 
    //.........................................
     
    JTextField player1_Text=new JTextField("0",5);
    JTextField player2_Text=new JTextField("0",5);
    JTextField tie_Text=new JTextField(5);
    JTextField round_Text=new JTextField(5);
    //................................
    JLabel  player1_label=new JLabel();
    JLabel  player2_label=new JLabel();
    JLabel  tie_label=new JLabel("Tie");
    JLabel  round_label=new JLabel("nO Of round");
    //................................
    static String whoseTurn ="X";
     String firstPlayer="Player One";
     String secondPlayer="Player Two";
     static int firstPlayerScore=0;
     static int secondPlayerScore=0;
     static int tie_counter=0;
      int round=0;
    
    
    
    
    private JLabel jLabel1=new JLabel();
    
    ButtonHandler handler= new ButtonHandler();
    private JPanel panel_game=new JPanel();
    private JPanel panel_scores=new JPanel();
    private JPanel panel_basic=new JPanel();
   
    JPanel panel1=new JPanel();
    
  
   public TicTacToe  (){
       super("x and o with two player");
       panel_game.setLayout(new GridLayout(3,3,5,5));
       
       firstPlayer=Welcome.player1.getText();
       secondPlayer=Welcome.player2.getText();
     
           setScores();
     
       add(panel_basic);
       panel_basic.setLayout(new BoxLayout(panel_basic,BoxLayout.Y_AXIS));
       //.................................................................set font size
       Button1.setFont(new Font("Serif",Font.BOLD,200));
       Button2.setFont(new Font("Serif",Font.BOLD,200));
       Button3.setFont(new Font("Serif",Font.BOLD,200));
       Button4.setFont(new Font("Serif",Font.BOLD,200));
       Button5.setFont(new Font("Serif",Font.BOLD,200));
       Button6.setFont(new Font("Serif",Font.BOLD,200));
       Button7.setFont(new Font("Serif",Font.BOLD,200));
       Button8.setFont(new Font("Serif",Font.BOLD,200));
       Button9.setFont(new Font("Serif",Font.BOLD,200));
       //.................................................................
     
    
       //...............................................................add button
       panel_game.add(Button1);
       panel_game.add(Button2);
       panel_game.add(Button3);
       panel_game.add(Button4);
       panel_game.add(Button5);
       panel_game.add(Button6);
       panel_game.add(Button7);
       panel_game.add(Button8);
       panel_game.add(Button9);
       panel_game.setPreferredSize(new Dimension(500,800));
       panel_basic.add(panel_game);
       panel_basic.add(panel_scores);
       //......................................
       
    
       Button1.addActionListener(handler);
       Button2.addActionListener(handler);
       Button3.addActionListener(handler);
       Button4.addActionListener(handler);
       Button5.addActionListener(handler);
       Button6.addActionListener(handler);
       Button7.addActionListener(handler);
       Button8.addActionListener(handler);
       Button9.addActionListener(handler);  
       
   }

    public static String getWhoseTurn() {
        return whoseTurn;
    }

    public String getFirstPlayer() {
        return firstPlayer;
    }

    public String getSecondPlayer() {
        return secondPlayer;
    }

    public static int getFirstPlayerScore() {
        return firstPlayerScore;
    }

    public static int getSecondPlayerScore() {
        return secondPlayerScore;
    }

    public static int getTie_counter() {
        return tie_counter;
    }


    //to alter the turn between two players
  public void determainWhoseTurn(){
    if (whoseTurn.equalsIgnoreCase("X"))  
      whoseTurn="O";
      else
      whoseTurn="X";  
  }
  
  
  //print each player score
  public void setScores(){
  
  jLabel1.setText(firstPlayer+"'s score is: "+String.valueOf(firstPlayerScore)+"\t\t     "+"        "
               + ""+secondPlayer+"'s score is:"+String.valueOf(secondPlayerScore)+"\t\t");
  jLabel1.setFont(new Font("Serif",Font.BOLD,30));
  panel_scores.setPreferredSize(new Dimension(500,100));
  panel_scores.add(jLabel1);
  }//setScores()
  
  
  //print message when x wins
  public void x_winner(){
  
  JOptionPane.showMessageDialog(rootPane, "Player one( " +firstPlayer+ " ) wins", "Winner",JOptionPane.INFORMATION_MESSAGE);
    
  firstPlayerScore++;
  round++;
  
  player1_Text.setText(""+ firstPlayerScore);
  setScores();
//to over the game
   if(round==Integer.parseInt(Welcome.round.getText())){
        resultFrame R= new resultFrame();
        R.setVisible(true);
        R.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        R.setSize(1000,1000);
        R.setLocationRelativeTo(null);
       }
  reset();
  
  }//x_winner()
  
  
  //print message when o wins
  public void o_winner(){
  
  JOptionPane.showMessageDialog(rootPane, "Player Two( " +secondPlayer+ " ) wins", "Winner",JOptionPane.INFORMATION_MESSAGE);
  
  
  secondPlayerScore++;
  round++;
   player2_Text.setText(""+ secondPlayerScore);
   setScores();
   
   //to over the game
   if(round==Integer.parseInt(Welcome.round.getText())){
   resultFrame R= new resultFrame();
       R.setVisible(true);
        R.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        R.setSize(1000,1000);
        R.setLocationRelativeTo(null);
       }
  reset();
  
  }//o_winner()
  //to reset the game for next round
  public void reset (){
  
    Button1.setText("");
    Button2.setText("");
    Button3.setText("");
    Button4.setText("");
    Button5.setText("");
    Button6.setText("");
    Button7.setText("");
    Button8.setText("");
    Button9.setText("");
    whoseTurn ="X";
  
  }
  
  
  //winner conditions
  public void whenWin(){
      
      
    String one=Button1.getText();
    String two=Button2.getText();
    String three=Button3.getText();
    String four=Button4.getText();
    String five=Button5.getText();
    String six=Button6.getText();
    String seven=Button7.getText();
    String eight=Button8.getText();
    String nine=Button9.getText();
      
      
      
      //x_winner conditions
      if(one=="X" && two=="X" && three=="X")
          x_winner();
      
      if(four=="X" && five=="X" && six=="X")
          x_winner();
      
      if(seven=="X" && eight=="X" && nine=="X")
          x_winner();
      
      if(one=="X" && four=="X" && seven=="X")
          x_winner();
      
      if(two=="X" && five=="X" && eight=="X")
          x_winner();
      
      if(three=="X" && six=="X" && nine=="X")
          x_winner();
      
      if(one=="X" && five=="X" && nine=="X")
          x_winner();
      
      if(three=="X" && five=="X" && seven=="X")
          x_winner();
      
     //............................................ 
      
      //o_winner conditions
      
      if(one=="O" && two=="O" && three=="O")
          o_winner();
      
      if(four=="O" && five=="O" && six=="O")
          o_winner();
      
      if(seven=="O" && eight=="O" && nine=="O")
          o_winner();
      
      if(one=="O" && four=="O" && seven=="O")
          o_winner();
      
      if(two=="O" && five=="O" && eight=="O")
          o_winner();
      
      if(three=="O" && six=="O" && nine=="O")
          o_winner();
      
      if(one=="O" && five=="O" && nine=="O")
          o_winner();
      
      if(three=="O" && five=="O" && seven=="O")
          o_winner();
  
  }//whenWin()
  
 //...................................................... 
  // no one wins
  public void tie_Game(){
      
    String one=Button1.getText();
    String two=Button2.getText();
    String three=Button3.getText();
    String four=Button4.getText();
    String five=Button5.getText();
    String six=Button6.getText();
    String seven=Button7.getText();
    String eight=Button8.getText();
    String nine=Button9.getText();
      
  
  if (one !="" && two !="" && three !="" && four !="" && five !=""
          && six !="" && seven !="" && eight !="" && nine !="" ){
      
     JOptionPane.showMessageDialog(rootPane,"Game is a tie", "Tie game",JOptionPane.INFORMATION_MESSAGE);
     tie_counter++;
     round++;
     tie_Text.setText(""+tie_counter);
  
  //to over the game
      if(round==Integer.parseInt(Welcome.round.getText())){
          resultFrame R= new resultFrame();
          R.setVisible(true);
         R.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         R.setSize(1000,1000);
         R.setLocationRelativeTo(null);
           }
  
  reset();}
  }//tie_Game()
  
 
  //inner class to make the button preform some action
     private class ButtonHandler implements ActionListener {

        
  // action for button 1
    public void actionPerformed(ActionEvent e) {
        
       // for (int i=1;i<=round;i++){
        if (e.getSource()==Button1){
            Button1.setText(whoseTurn);
           if (whoseTurn.equalsIgnoreCase("X")){
             Button1.setForeground(Color.red);   
              }
            else{
             Button1.setForeground(Color.blue);
               } 
       determainWhoseTurn();
       whenWin();
       tie_Game();
        
        }
       
  //----------------------------     
         if (e.getSource()==Button2){
            Button2.setText(whoseTurn);
           if (whoseTurn.equalsIgnoreCase("X")){
             Button2.setForeground(Color.red);   
              }
            else{
             Button2.setForeground(Color.blue);
             } 
       determainWhoseTurn();
       whenWin();
       tie_Game();
       
               } 
  //--------------------
    if (e.getSource()==Button3){
      Button3.setText(whoseTurn);
       if (whoseTurn.equalsIgnoreCase("X")){
          Button3.setForeground(Color.red);   
              }
        else{
             Button3.setForeground(Color.blue);
              } 
       determainWhoseTurn();
       whenWin();
       tie_Game();
     
        }
       
  //--------------------
       if (e.getSource()==Button4){
            Button4.setText(whoseTurn);
           if (whoseTurn.equalsIgnoreCase("X")){
             Button4.setForeground(Color.red);   
              }
            else{
             Button4.setForeground(Color.blue);
                } 
           //Round(round);
       determainWhoseTurn();
       whenWin();
       tie_Game();
          }
       
    if (e.getSource()==Button5){
          Button5.setText(whoseTurn);
       if (whoseTurn.equalsIgnoreCase("X")){
         Button5.setForeground(Color.red);   
              }
        else{
         Button5.setForeground(Color.blue);
       } 
       determainWhoseTurn();
       whenWin();
       tie_Game();
       
        } 
       
  //---------------------
    
    if (e.getSource()==Button6){
          Button6.setText(whoseTurn);
       if (whoseTurn.equalsIgnoreCase("X")){
         Button6.setForeground(Color.red);   
              }
        else{
         Button6.setForeground(Color.blue);
       } 
       determainWhoseTurn();
       whenWin();
       tie_Game();
      
        }     
         
      //...........................................
     if (e.getSource()==Button7){
          Button7.setText(whoseTurn);
       if (whoseTurn.equalsIgnoreCase("X")){
         Button7.setForeground(Color.red);   
              }
        else{
         Button7.setForeground(Color.blue);
           } 
       determainWhoseTurn();
       whenWin();
       tie_Game();
       
        } 
  //--------------------------
      if (e.getSource()==Button8){
          Button8.setText(whoseTurn);
       if (whoseTurn.equalsIgnoreCase("X")){
         Button8.setForeground(Color.red);   
              }
        else{
         Button8.setForeground(Color.blue);
          } 
       determainWhoseTurn();
       whenWin();
       tie_Game();
       
        } 
      //-----------------
       if (e.getSource()==Button9){
          Button9.setText(whoseTurn);
       if (whoseTurn.equalsIgnoreCase("X")){
         Button9.setForeground(Color.red);   
              }
        else{
         Button9.setForeground(Color.blue);
       } 
       determainWhoseTurn();
       whenWin();
       tie_Game();
       
        }
       
        }//end action Performed
 
          
     }//end inner class
    
    
}//class
