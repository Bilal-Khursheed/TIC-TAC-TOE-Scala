/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salma_maryam_elaf;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Instruction extends JFrame implements ActionListener{
    
  JLabel label =new JLabel("RULES OF TIC TAC TOE");
  JTextArea text_instruction =new JTextArea();   
  JButton game_button =new JButton("START GAME");  
   
    
 public Instruction  (){
    setLayout(new FlowLayout() ); 
    add(label);
    label.setFont(new Font("Serif",Font.BOLD,60));
    label.setForeground(Color.BLUE);
    text_instruction.setText("");
    text_instruction.setEditable(false);
    text_instruction.setPreferredSize(new Dimension(800,500));
    text_instruction.setText("\n1.The game is played on a grid that is 3x3 squares\n2.you are X and your frind is O.Players take turns puting there marks in empty squares.\n"
            + "3.if one of the players put his marks in a row (Up,Down,Across)he will be the winner and a score will be counted\n4.when all 9 squares are full,the Game is over.if no player has 3 marks in a row"
            + "the Game ends in a tie.\n\n"+"    ************************************************");
    text_instruction.setWrapStyleWord(true);
    text_instruction.setLineWrap(true);
    text_instruction.setFont(new Font("Serif",Font.BOLD,30));
    add(text_instruction);
    
    add(game_button);
   game_button.setPreferredSize((new Dimension(150,50)));
    
    game_button.addActionListener(this);
    
     
 } 

    @Override
    public void actionPerformed(ActionEvent e) {
        
         TicTacToe frm=new TicTacToe();
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(1000,1000);
        frm.setLocationRelativeTo(null);
        
    }
    
    
    
    
    
}
