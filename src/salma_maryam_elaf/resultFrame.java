/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salma_maryam_elaf;


import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Image;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 *
 * @author Dr.Salma
 */
public class resultFrame  extends JFrame{
  
    
    ImageIcon icon =new  ImageIcon(getClass().getResource("ba.jpg"));
    JLabel icon_label=new JLabel(icon);
    ImageIcon con_icon =new  ImageIcon(getClass().getResource("g.png"));
    JLabel con_label=new JLabel(con_icon);
    JLabel name_label =new JLabel();
    JLabel scoure_label =new JLabel();
    JPanel panel=new JPanel();
    JLabel win;
    
public resultFrame(){

    super("Result");
     String p1=Welcome.player1.getText();
     String p2=Welcome.player2.getText();
     int x_counter=TicTacToe.firstPlayerScore;
     int o_counter=TicTacToe.secondPlayerScore;
     int tie_counter=TicTacToe.tie_counter;
    
    
     if(x_counter>o_counter){
         
       win=new JLabel("        "+p1+" wins"); 
       win.setFont(new Font("Serif",Font.BOLD,60));
       win.setForeground(Color.BLUE);
     }
     else if(o_counter>x_counter){
         
       win=new JLabel("        "+p2+" wins"); 
       win.setFont(new Font("Serif",Font.BOLD,60));
       win.setForeground(Color.BLUE);
     }
     else {
       win=new JLabel("     "+"The Game is Tie"); 
       win.setFont(new Font("Serif",Font.BOLD,60));
       win.setForeground(Color.BLUE);
         }

    add(icon_label);

   panel.setBounds(180, 180, 600, 500);
   panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
   panel.add(con_label);
   panel.add(name_label);
   panel.add(scoure_label);
   name_label.setText("    "+p1+"          "+p2);
   name_label.setForeground(Color.red);

   scoure_label.setText("        "+x_counter+"                   "+ o_counter);

  scoure_label.setFont(new Font("Serif",Font.BOLD,60));
  name_label.setFont(new Font("Serif",Font.BOLD,60));
  panel.add(win);
  panel.setBackground(new Color(0,0,0,0));
  icon_label.add(panel);

}
    
    
}
