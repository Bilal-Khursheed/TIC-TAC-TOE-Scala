/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salma_maryam_elaf;


import javax.swing.ImageIcon; 
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.FlowLayout;
//import javax.swing.BoxLayout;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

public class Welcome extends JFrame implements ActionListener{
      
    
    
    JPanel base_panel=new JPanel();
    JPanel panel_north =new JPanel();
    JPanel panel_south=new JPanel();
    JPanel panel_East=new JPanel();
    JPanel panel_Center=new JPanel();
    JPanel panel_West=new JPanel();
    
    JLabel game_lable=new JLabel("TIC TAC TOE");  
    Icon icon =new  ImageIcon(getClass().getResource("X_O.jpg"));
    JLabel icon_lable=new JLabel(icon);
    JLabel x=new JLabel("X");
    JLabel lable11=new JLabel("Player");
    static JTextField player1 =new JTextField(10);
    
    JLabel o=new JLabel("O");
    JLabel lablel2=new JLabel("Player");
   static JTextField player2 =new JTextField(10);
  
    JLabel label_r=new JLabel("NumberOfRounds"); 
    static JTextField round =new JTextField(10);
    
    JButton rules=new JButton("Rules>>");
    //...........................................................
    
      //.........................................................
     public Welcome(){
      super("WELCOME");
      
     base_panel.setLayout(new BorderLayout() );
     game_lable.setFont(new Font("Serif",Font.BOLD,100));
     game_lable.setForeground(Color.red);
     panel_north.add(game_lable);
     x.setFont(new Font("Serif",Font.BOLD,40));
     x.setForeground(Color.red);
     
     panel_south.setLayout(new FlowLayout());
     panel_south.add(x);
     lable11.setFont(new Font("Serif",Font.BOLD,45));
     panel_south.add(lable11);
     panel_south.add(player1);
    
     
     o.setFont(new Font("Serif",Font.BOLD,40));
     o.setForeground(Color.BLUE);
     panel_south.add(o);
     lablel2.setFont(new Font("Serif",Font.BOLD,45));
     panel_south.add(lablel2);
     panel_south.add(player2);
     label_r.setFont(new Font("Serif",Font.BOLD,45));
     panel_south.add(label_r);
     panel_south.add(round);
     //panel_south.add(rules);
     panel_Center.add(icon_lable);
     //panel_Center.setBackground(Color.PINK);
     //rules.setBounds(50, 50, 100, 100);;
     panel_south.add(rules);
     rules.setPreferredSize((new Dimension(100,40)));
     panel_south.setBorder(new EmptyBorder(1,90,60,100));
     base_panel.add(panel_Center,BorderLayout.CENTER);
     base_panel.add(panel_north,BorderLayout.NORTH);
     base_panel.add(panel_south,BorderLayout.SOUTH);
     this.add(base_panel);
     
     rules.addActionListener(this);
     
  }  

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource()==rules){
        Instruction frame =new Instruction();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(850,700);
        frame.setLocationRelativeTo(null);
        }
        
     
        
    }
   
    
}
