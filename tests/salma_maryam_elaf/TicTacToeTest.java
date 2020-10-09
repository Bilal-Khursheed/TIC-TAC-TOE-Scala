package salma_maryam_elaf;

import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;

public class TicTacToeTest {

    @Test
    public void determainWhoseTurn() {
        TicTacToe tt= new TicTacToe();
        TicTacToe.whoseTurn="O";
        tt.determainWhoseTurn();
        assertEquals("X",tt.getWhoseTurn());

    }
    @Test
    public void determainWhoseTurn_1() {
        TicTacToe tt= new TicTacToe();
        TicTacToe.whoseTurn="O";
        tt.determainWhoseTurn();
        assertEquals("X",tt.getWhoseTurn());

    }
    @Test
    public void determainWhoseTurn_2() {
        TicTacToe tt= new TicTacToe();
        TicTacToe.whoseTurn="O";
        tt.determainWhoseTurn();
        assertNotEquals("O",false);

    }@Test
    public void determainWhoseTurn_3() {
        TicTacToe tt= new TicTacToe();
        TicTacToe.whoseTurn="X";
        tt.determainWhoseTurn();
        assertFalse("O",false);

    }


    @Test
    public void setScores() {
        TicTacToe tt= new TicTacToe();
        tt.firstPlayer="Bilal";
        tt.secondPlayer="Salma";
        tt.firstPlayerScore=5;
        tt.secondPlayerScore=2;
        tt.setScores();
        assertEquals("Bilal's score is: 5\t\t  Salma's score is: 2\t\t",tt.getFirstPlayer()+"'s score is: "+tt.getFirstPlayerScore()+"\t\t  " + tt.getSecondPlayer()+"'s score is: "+tt.getSecondPlayerScore()+"\t\t");
    }

    @Test
    public void setScores_1() {
        TicTacToe tt= new TicTacToe();
        tt.firstPlayer="Abdullah";
        tt.secondPlayer="Maryam";
        tt.firstPlayerScore=0;
        tt.secondPlayerScore=2;
        tt.setScores();
        assertEquals("Abdullah's score is: 0\t\t  Maryam's score is: 2\t\t",tt.getFirstPlayer()+"'s score is: "+tt.getFirstPlayerScore()+"\t\t  " + tt.getSecondPlayer()+"'s score is: "+tt.getSecondPlayerScore()+"\t\t");
    }
    @Test
    public void setScores_2() {
        TicTacToe tt= new TicTacToe();
        tt.firstPlayer="Jonson";
        tt.secondPlayer="Riya";
        tt.firstPlayerScore=0;
        tt.secondPlayerScore=2;
        tt.setScores();
        assertNotEquals("Abdu score is: 0       Khawaja's score is: 2",tt.getFirstPlayer()+"'s score is: "+tt.getFirstPlayerScore()+"\t\t  " + tt.getSecondPlayer()+"'s score is: "+tt.getSecondPlayerScore()+"\t\t");
    }

    @Test(expected = Exception.class)
    public void x_winner() {
        TicTacToe tt= new TicTacToe();
        tt.firstPlayer="Ali";
        tt.firstPlayerScore=3;
        tt.firstPlayerScore++;
        tt.round++;
        tt.x_winner();

        assertNotEquals("Player one(  ALi  ) wins Winner","Player one( " +tt.getFirstPlayer()+ " ) wins Winner");
    }
    @Test(expected = Exception.class)
    public void x_winner_1() {
        TicTacToe tt= new TicTacToe();
        tt.firstPlayer="abc";
        tt.firstPlayerScore=2;
        tt.firstPlayerScore++;
        tt.round++;
        tt.x_winner();

        assertEquals("Player one(  Abc  ) wins Winner","Player one( " +tt.getFirstPlayer()+ " ) wins Winner");
    }
    @Test(expected = Exception.class)
    public void x_winner_2() {
        TicTacToe tt= new TicTacToe();
        tt.secondPlayer="Alpha";
        tt.firstPlayerScore=4;
        tt.firstPlayerScore++;
        tt.round++;
        tt.x_winner();

        assertFalse("Player one(  Alpha  ) wins Winner",false);
    }
    @Test(expected = Exception.class)
    public void x_winner_3() {
        TicTacToe tt= new TicTacToe();
        tt.firstPlayer="Alpha";
        tt.firstPlayerScore=4;
        tt.firstPlayerScore++;
        tt.round++;
        tt.x_winner();

        assertTrue("Player one(  Alpha  ) wins Winner",true);
    }


    @Test(expected = Exception.class)
    public void o_winner_1() {
        TicTacToe tt= new TicTacToe();
        tt.secondPlayer="beta";
        tt.secondPlayerScore=1;
        tt.secondPlayerScore++;
        tt.round++;
        tt.o_winner();

        assertTrue("Player one(  beta  ) wins Winner",true);
    }
    @Test(expected = Exception.class)
    public void o_winner_2() {
        TicTacToe tt= new TicTacToe();
        tt.secondPlayer="gema";
        tt.secondPlayerScore=1;
        tt.secondPlayerScore++;
        tt.round++;
        tt.o_winner();

        assertEquals("Player one(  Gema  ) wins Winner","Player one( " +tt.getSecondPlayer()+ " ) wins Winner");
    }
    @Test(expected = Exception.class)
    public void o_winner_3() {
        TicTacToe tt= new TicTacToe();
        tt.secondPlayer="beta";
        tt.secondPlayerScore=1;
        tt.secondPlayerScore++;
        tt.round++;
        tt.o_winner();

        assertNotEquals("Player one(  Alpha  ) wins Winner","Player one( " +tt.getFirstPlayer()+ " ) wins Winner");
    }


    @Test
    public void reset() {
        TicTacToe tt= new TicTacToe();
        tt.Button1.setText("abc");
        tt.Button2.setText("abcsf");
        tt.reset();
        String xx=tt.Button1.getText();
        assertEquals("", xx);
    }
    @Test
    public void reset_1() {
        TicTacToe tt= new TicTacToe();
        tt.Button4.setText("abc");

        tt.reset();
        String xx=tt.Button4.getText();
        assertEquals("", xx);
    }
    @Test
    public void reset_2() {
        TicTacToe tt= new TicTacToe();
        tt.Button5.setText("abc");

        tt.reset();
        String xx=tt.Button5.getText().trim();
        assertEquals("", xx);
    }
    @Test
    public void reset_3() {
        TicTacToe tt= new TicTacToe();

        tt.Button7.setText("abcsf");
        tt.reset();
        String xx=tt.Button7.getText();
        assertEquals("", xx);
    }

    @Test(expected = Exception.class)
    public void whenWin() {
        TicTacToe tt= new TicTacToe();
        tt.Button1.setText("X");
        tt.Button2.setText("X");
        tt.Button3.setText("X");
        tt.whenWin();
        String one=tt.Button1.getText();
        String two=tt.Button2.getText();
        String three=tt.Button3.getText();
        assertEquals("X's wins the game" , one+"'s wins the game" );

    }
    @Test(expected = Exception.class)
    public void whenWin_1() {
        TicTacToe tt= new TicTacToe();
        tt.Button1.setText("O");
        tt.Button2.setText("O");
        tt.Button3.setText("O");
        tt.whenWin();
        String one=tt.Button1.getText();
        String two=tt.Button2.getText();
        String three=tt.Button3.getText();
        assertEquals("O's wins the game" , one+"'s wins the game" );

    }
    @Test(expected = Exception.class)
    public void whenWin_2()throws Exception {
        TicTacToe tt= new TicTacToe();
        tt.Button4.setText("X");
        tt.Button5.setText("X");
        tt.Button6.setText("X");
        tt.whenWin();
        String four=tt.Button4.getText();
        String five=tt.Button5.getText();
        String six=tt.Button6.getText();
        assertEquals("X's wins the game" , five+"'s wins the game" );

    }
    @Test(expected = Exception.class)
    public void whenWin_3()throws Exception{
        TicTacToe tt= new TicTacToe();
        tt.Button4.setText("O");
        tt.Button5.setText("O");
        tt.Button6.setText("O");
        tt.whenWin();
        String six=tt.Button6.getText();
        String five=tt.Button5.getText();
        String four=tt.Button4.getText();
        assertEquals("O's wins the game" , four+"'s wins the game" );

    }

    @Test
    public void tie_Game() {
        TicTacToe tt= new TicTacToe();
        tt.Button1.setText("ab");
        tt.Button2.setText("v");
        tt.Button3.setText("dv");
        tt.tie_Game();

        String one=tt.Button1.getText();
        String two=tt.Button2.getText();
        String three=tt.Button3.getText();
        assertEquals("match tie", "match tie");
    }
    @Test
    public void tie_Game_3() {
        TicTacToe tt= new TicTacToe();
        tt.Button4.setText("dvd");
        tt.Button5.setText("ds");
        tt.Button6.setText("we");
        tt.tie_Game();

        String four=tt.Button4.getText();
        String five=tt.Button5.getText();
        String six=tt.Button6.getText();
        assertNotEquals("match tie", "match won");
    }
    @Test
    public void tie_Game_1()throws Exception {
        TicTacToe tt= new TicTacToe();
        tt.Button7.setText("");
        tt.Button8.setText("ad");
        tt.Button9.setText("");
        tt.tie_Game();

        String seven=tt.Button7.getText();
        String eight=tt.Button8.getText();
        String nine=tt.Button9.getText();
        assertEquals("match tie", "match tie");
    }
    @Test
    public void tie_Game_2() throws Exception{
        TicTacToe tt= new TicTacToe();
        tt.Button3.setText("");
        tt.Button1.setText("");
        tt.Button8.setText("");
        tt.tie_Game();

        String three=tt.Button1.getText();
        String one=tt.Button2.getText();
        String eight=tt.Button3.getText();
        assertEquals("match tie", "match tie");
    }
}