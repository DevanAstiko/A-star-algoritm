package crownofpath;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Board2 extends JPanel implements ActionListener {
    public boolean runing= true;
    private JButton B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20, B21, B22, B23, B24, B25; // Buttons
    private GameArray GArray; // Class with Array
    private boolean Player = false;
    private int PlayerMark = 1;
    runLogic logic = new runLogic();
    int count = 0;
    int xzombi=5;int yzombi=5;

    /*
     Player is the Current players turn. if false player 1 will play else player 2
     PlayerMark is to set number to the array "1" for player 1 and "2" for player 2
     */
    Board2() {

        // creates the panel
        setLayout(new GridLayout(5, 5));
        
        B1 = new JButton("");
        B2 = new JButton("");
        B3 = new JButton("");
        B4 = new JButton("");
        B5 = new JButton("");
        B6 = new JButton("");
        B7 = new JButton("");
        B8 = new JButton("");
        B9 = new JButton("");
        B10 = new JButton("");
        B11 = new JButton("");
        B12 = new JButton("");
        B13 = new JButton("");
        B14 = new JButton("");
        B15 = new JButton("");
        B16 = new JButton("");
        B17 = new JButton("");
        B18 = new JButton("");
        B19 = new JButton("");
        B20 = new JButton("");
        B21 = new JButton("");
        B22 = new JButton("");
        B23 = new JButton("");
        B24 = new JButton("");
        B25 = new JButton("");

        SetGame();

        add(B1);
        add(B2);
        add(B3);
        add(B4);
        add(B5);
        add(B6);
        add(B7);
        add(B8);
        add(B9);
        add(B10);
        add(B11);
        add(B12);
        add(B13);
        add(B14);
        add(B15);
        add(B16);
        add(B17);
        add(B18);
        add(B19);
        add(B20);
        add(B21);
        add(B22);
        add(B23);
        add(B24);
        add(B25);

        B1.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);
        B4.addActionListener(this);
        B5.addActionListener(this);
        B6.addActionListener(this);
        B7.addActionListener(this);
        B8.addActionListener(this);
        B9.addActionListener(this);
        B10.addActionListener(this);
        B11.addActionListener(this);
        B12.addActionListener(this);
        B13.addActionListener(this);
        B14.addActionListener(this);
        B15.addActionListener(this);
        B16.addActionListener(this);
        B17.addActionListener(this);
        B18.addActionListener(this);
        B19.addActionListener(this);
        B20.addActionListener(this);
        B21.addActionListener(this);
        B22.addActionListener(this);
        B23.addActionListener(this);
        B24.addActionListener(this);
        B25.addActionListener(this);
    }

    public void SetGame() {

       

        DefaultText();
        
        DisableAll(true);

        Player = false; // default Value
        PlayerMark = 1; // default Value
    }

    public void Reset() {
     
    Startgame S = new Startgame();
    S.show();

    }

    public void actionPerformed(ActionEvent E) {

        JButton Pressed = (JButton) E.getSource();

        /*
         if any button is pressed the value is sent to GameArray class
         */
        if (Pressed == B1) {
            int x = 0;
            int y = 0;

            count++;

            moveithuman();
            SetText(Pressed, Player);
            jalanzombie(x, y);
                 // chaneg button text to "X" or "O" based on player turn
            checkedlose(x, y, xzombi, yzombi);
        } else if (Pressed == B2) {
            int x = 1;
            int y = 0;

            count++;

            moveithuman();
            SetText(Pressed, Player);
            jalanzombie(x, y);
            checkedlose(x, y, xzombi, yzombi);

        } else if (Pressed == B3) {
            int x = 2;
            int y = 0;

            count++;

            moveithuman();
            SetText(Pressed, Player);
            jalanzombie(x, y);
            checkedlose(x, y, xzombi, yzombi);
        } else if (Pressed == B4) {
            int x = 3;
            int y = 0;

            count++;

            moveithuman();
            SetText(Pressed, Player);
            jalanzombie(x, y);
            checkedlose(x, y, xzombi, yzombi);
        } else if (Pressed == B5) {
            int x = 4;
            int y = 0;

            count++;

            moveithuman();
            SetText(Pressed, Player);
            jalanzombie(x, y);
            checkedlose(x, y, xzombi, yzombi);
        } else if (Pressed == B6) {
            int x = 0;
            int y = 1;

            count++;

            moveithuman();
            SetText(Pressed, Player);
            jalanzombie(x, y);
            checkedlose(x, y, xzombi, yzombi);
        } else if (Pressed == B7) {
            int x = 1;
            int y = 1;

            count++;

            moveithuman();
            SetText(Pressed, Player);
            jalanzombie(x, y);
            checkedlose(x, y, xzombi, yzombi);
        } else if (Pressed == B8) {
            int x = 2;
            int y = 1;

            count++;

            moveithuman();
            SetText(Pressed, Player);
            jalanzombie(x, y);
            checkedlose(x, y, xzombi, yzombi);
        } else if (Pressed == B9) {
            int x = 3;
            int y = 1;

            count++;

            moveithuman();
            SetText(Pressed, Player);
            jalanzombie(x, y);
            checkedlose(x, y, xzombi, yzombi);
        } else if (Pressed == B10) {
            int x = 4;
            int y = 1;

            count++;

            moveithuman();
            SetText(Pressed, Player);
            jalanzombie(x, y);
            checkedlose(x, y, xzombi, yzombi);
        } else if (Pressed == B11) {
            int x = 0;
            int y = 2;

            count++;

            moveithuman();
            SetText(Pressed, Player);
            jalanzombie(x, y);
            checkedlose(x, y, xzombi, yzombi);
        } else if (Pressed == B12) {
            int x = 1;
            int y = 2;

            count++;

            moveithuman();
            SetText(Pressed, Player);
            jalanzombie(x, y);
            checkedlose(x, y, xzombi, yzombi);
        } else if (Pressed == B13) {
            int x = 2;
            int y = 2;

            count++;

            moveithuman();
            SetText(Pressed, Player);
            jalanzombie(x, y);
            checkedlose(x, y, xzombi, yzombi);
        } else if (Pressed == B14) {
            int x = 3;
            int y = 2;

            count++;

            moveithuman();
            SetText(Pressed, Player);
            jalanzombie(x, y);
            checkedlose(x, y, xzombi, yzombi);
        } else if (Pressed == B15) {
            int x = 4;
            int y = 2;

            count++;

            moveithuman();
            SetText(Pressed, Player);
            jalanzombie(x, y);
            checkedlose(x, y, xzombi, yzombi);
        } else if (Pressed == B16) {
            int x = 0;
            int y = 3;

            count++;

            moveithuman();
            SetText(Pressed, Player);
            jalanzombie(x, y);
            checkedlose(x, y, xzombi, yzombi);
        } else if (Pressed == B17) {
            int x = 1;
            int y = 3;

            count++;

            moveithuman();
            
            SetText(Pressed, Player);
            jalanzombie(x, y);
            checkedlose(x, y, xzombi, yzombi);
        } else if (Pressed == B18) {
            int x = 2;
            int y = 3;

            count++;

            moveithuman();
            
            SetText(Pressed, Player);
            jalanzombie(x, y);
            checkedlose(x, y, xzombi, yzombi);
        } else if (Pressed == B19) {
            int x = 3;
            int y = 3;

            count++;

            moveithuman();
            
            SetText(Pressed, Player);
            jalanzombie(x, y);
            checkedlose(x, y, xzombi, yzombi);
        } else if (Pressed == B20) {
            int x = 4;
            int y = 3;

            count++;

            moveithuman();
            
            SetText(Pressed, Player);
            jalanzombie(x, y);
            checkedlose(x, y, xzombi, yzombi);
        } else if (Pressed == B21) {//finish
            int x = 0;
            int y = 4;

            count++;

            moveithuman();
            SetText(Pressed, Player);
            JOptionPane.showMessageDialog(Pressed,"Congratulations");
        } else if (Pressed == B22) {
            int x = 1;
            int y = 4;

            count++;

            moveithuman();
            
            SetText(Pressed, Player);
            jalanzombie(x, y);
            checkedlose(x, y, xzombi, yzombi);
        } else if (Pressed == B23) {
            int x = 2;
            int y = 4;

            count++;

            moveithuman();
            
            SetText(Pressed, Player);
            jalanzombie(x, y);
            checkedlose(x, y, xzombi, yzombi);
        } else if (Pressed == B24) {
            int x = 3;
            int y = 4;

            count++;

            moveithuman();
            
            SetText(Pressed, Player);
            jalanzombie(x, y);
            checkedlose(x, y, xzombi, yzombi);
        } else if (Pressed == B25) {
            int x = 4;
            int y = 4;

            count++;

            moveithuman();
            
            SetText(Pressed, Player);
            jalanzombie(x, y);
            checkedlose(x, y, xzombi, yzombi);
        }

    }

    public int SwithTurn(boolean last) {

        // if the past player was false(player 1) then swith to true(player 2)
        System.out.println();

        if (last == true) {
            Player = false;
            return 1;

        } else if (last == false) {
            Player = true;
            return 2;
        } else {
            return 3;
        }

    }

    public void ButtonDisabler(JButton Btn) {

        Btn.setEnabled(false); // Disable Button

    }

    public void DisableAll(boolean Opp) {

        // Disable  All Buttons
        B1.setEnabled(Opp);
        B2.setEnabled(Opp);
        B3.setEnabled(Opp);
        B4.setEnabled(Opp);
        B5.setEnabled(Opp);
        B6.setEnabled(Opp);
        B7.setEnabled(Opp);
        B8.setEnabled(Opp);
        B9.setEnabled(Opp);
        B10.setEnabled(Opp);
        B11.setEnabled(Opp);
        B12.setEnabled(Opp);
        B13.setEnabled(Opp);
        B14.setEnabled(Opp);
        B15.setEnabled(Opp);
        B16.setEnabled(Opp);
        B17.setEnabled(Opp);
        B18.setEnabled(Opp);
        B19.setEnabled(Opp);
        B20.setEnabled(Opp);
        B21.setEnabled(Opp);
        B22.setEnabled(Opp);
        B23.setEnabled(Opp);
        B24.setEnabled(Opp);
        B25.setEnabled(Opp);

    }

    public void SetText(JButton Btn, boolean Play) {
//change
        if (Play == true) {
            Btn.setText("HUMAN");
        } else if (Play == false) {
            Btn.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minion.jpg"));
        }

    }

    public void moveithuman() {
        B1.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B2.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        //B2.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\TicTac\\src\\images\\setan.png"));
        B3.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B4.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B5.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B6.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B7.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B8.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B9.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B10.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B11.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B12.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B13.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\asd.png"));
        B14.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B15.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B16.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B17.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B18.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B19.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B20.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B21.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\goal.jpg"));
        B22.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B23.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B24.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B25.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));

    }

    public void gonepoint() {
        B1.setText("");
        B2.setText("");
        B3.setText("");
        B4.setText("");
        B5.setText("");
        B6.setText("");
        B7.setText("");
        B8.setText("");
        B9.setText("");
        B10.setText("");
        B11.setText("");
        B12.setText("");
        B13.setText("");
        B14.setText("");
        B15.setText("");
        B16.setText("");
        B17.setText("");
        B18.setText("");
        B19.setText("");
        B20.setText("");
        B21.setText("");
        B22.setText("");
        B23.setText("");
        B24.setText("");
        B25.setText("");

    }

    public void DefaultText() {

        B1.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minion.jpg"));
        B2.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        //B2.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\TicTac\\src\\images\\setan.png"));
        B3.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B4.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B5.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B6.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B7.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B8.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B9.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B10.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B11.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B12.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B13.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\asd.png"));
        B14.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B15.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B16.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B17.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B18.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B19.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B20.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B21.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\goal.jpg"));
        B22.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B23.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B24.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\kotak1.jpg"));
        B25.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
        B25.setText(".");
    }

    public void jalanzombie(int x, int y) {

        if (".".equals(B1.getText())) {
            int xplace = 0;
            int yplace = 0;

            int hasil1 = hitung(0, 1, x, y) + count;//6
            int hasil2 = hitung(1, 0, x, y) + count;//2
            int hasil3 = hitung(1, 1, x, y) + count;//7
            gonepoint();
            if ((hasil1 <= hasil2) && (hasil1 <= hasil3)) {
                B6.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B6.setText(".");
                xzombi=0;yzombi=1;
            } else if ((hasil2 <= hasil1) && (hasil2 <= hasil3)) {
                B2.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B2.setText(".");
                xzombi=1;yzombi=0;
            } else {
                B7.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B7.setText(".");
                xzombi=1;yzombi=1;
            }
        } else if (".".equals(B2.getText())) {
            int xplace = 1;
            int yplace = 0;

            int hasil1 = hitung(2, 0, x, y) + count;//b3
            int hasil2 = hitung(2, 1, x, y) + count;//b8
            int hasil3 = hitung(1, 1, x, y) + count;//b7
            int hasil4 = hitung(0, 1, x, y) + count;//b6
            int hasil5 = hitung(0, 0, x, y) + count;//b1
            gonepoint();
            if ((hasil1 <= hasil2) && (hasil1 <= hasil3) && (hasil1 <= hasil4) && (hasil1 <= hasil5)) {
                moveithuman();
                B3.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B3.setText(".");
                xzombi=2;yzombi=0;
            } else if ((hasil2 <= hasil1) && (hasil2 <= hasil3) && (hasil2 <= hasil4) && (hasil2 <= hasil5)) {
                moveithuman();
                B8.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B8.setText(".");
                xzombi=2;yzombi=1;
            } else if ((hasil3 <= hasil2) && (hasil3 <= hasil1) && (hasil3 <= hasil4) && (hasil3 <= hasil5)) {
                moveithuman();
                B7.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B7.setText(".");
                xzombi=1;yzombi=1;
            } else if ((hasil4 <= hasil2) && (hasil4 <= hasil3) && (hasil4 <= hasil1) && (hasil4 <= hasil5)) {
                moveithuman();
                B6.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B6.setText(".");
                xzombi=0;yzombi=1;
            } else {
                moveithuman();
                B1.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B1.setText(".");
                xzombi=0;yzombi=0;

            }
        } else if (".".equals(B3.getText())) {
            int xplace = 2;
            int yplace = 0;

            int hasil1 = hitung(3, 0, x, y) + count;//b4
            int hasil2 = hitung(3, 1, x, y) + count;//b9
            int hasil3 = hitung(2, 1, x, y) + count;//b8
            int hasil4 = hitung(1, 1, x, y) + count;//b7
            int hasil5 = hitung(1, 0, x, y) + count;//b2
            gonepoint();
            if ((hasil1 <= hasil2) && (hasil1 <= hasil3) && (hasil1 <= hasil4) && (hasil1 <= hasil5)) {
                moveithuman();
                B4.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B4.setText(".");
                xzombi=3;yzombi=0;
            } else if ((hasil2 <= hasil1) && (hasil2 <= hasil3) && (hasil2 <= hasil4) && (hasil2 <= hasil5)) {
                moveithuman();
                B9.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B9.setText(".");
                xzombi=3;yzombi=1;
            } else if ((hasil3 <= hasil2) && (hasil3 <= hasil1) && (hasil3 <= hasil4) && (hasil3 <= hasil5)) {
                moveithuman();
                B8.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B8.setText(".");
                xzombi=2;yzombi=1;
            } else if ((hasil4 <= hasil2) && (hasil4 <= hasil3) && (hasil4 <= hasil1) && (hasil4 <= hasil5)) {
                moveithuman();
                B7.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B7.setText(".");
                xzombi=1;yzombi=1;
            } else {
                moveithuman();
                B2.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B2.setText(".");
                xzombi=1;yzombi=0;
            }
        } else if (".".equals(B4.getText())) {
            int xplace = 3;
            int yplace = 0;

            int hasil1 = hitung(4, 0, x, y) + count;//b5
            int hasil2 = hitung(4, 1, x, y) + count;//b10
            int hasil3 = hitung(3, 1, x, y) + count;//b9
            int hasil4 = hitung(2, 1, x, y) + count;//b8
            int hasil5 = hitung(2, 0, x, y) + count;//b3
            gonepoint();
            if ((hasil1 <= hasil2) && (hasil1 <= hasil3) && (hasil1 <= hasil4) && (hasil1 <= hasil5)) {
                moveithuman();
                B5.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B5.setText(".");
                xzombi=4;yzombi=0;
            } else if ((hasil2 <= hasil1) && (hasil2 <= hasil3) && (hasil2 <= hasil4) && (hasil2 <= hasil5)) {
                moveithuman();
                B10.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B10.setText(".");
                xzombi=4;yzombi=1;
            } else if ((hasil3 <= hasil2) && (hasil3 <= hasil1) && (hasil3 <= hasil4) && (hasil3 <= hasil5)) {
                moveithuman();
                B9.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B9.setText(".");
                xzombi=3;yzombi=1;
            } else if ((hasil4 <= hasil2) && (hasil4 <= hasil3) && (hasil4 <= hasil1) && (hasil4 <= hasil5)) {
                moveithuman();
                B8.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B8.setText(".");
                xzombi=2;yzombi=1;
            } else {
                moveithuman();
                B3.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B3.setText(".");
                xzombi=2;yzombi=0;

            }
        } else if (".".equals(B5.getText())) {
            int xplace = 4;
            int yplace = 0;

            int hasil1 = hitung(4, 1, x, y) + count;//b10
            int hasil2 = hitung(3, 0, x, y) + count;//b4
            int hasil3 = hitung(3, 1, x, y) + count;//b9
            gonepoint();
            if ((hasil1 <= hasil2) && (hasil1 <= hasil3)) {
                moveithuman();
                B10.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B10.setText(".");
                xzombi=4;yzombi=1;
            } else if ((hasil2 <= hasil1) && (hasil2 <= hasil3)) {
                moveithuman();
                B4.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B4.setText(".");
                xzombi=3;yzombi=0;
            } else {
                moveithuman();
                B9.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B9.setText(".");
                xzombi=3;yzombi=1;
            }
        } else if (".".equals(B6.getText())) {
            int xplace = 0;
            int yplace = 1;

            int hasil1 = hitung(0, 0, x, y) + count;//b1
            int hasil2 = hitung(1, 0, x, y) + count;//b2
            int hasil3 = hitung(1, 1, x, y) + count;//b7
            int hasil4 = hitung(1, 2, x, y) + count;//b12
            int hasil5 = hitung(0, 2, x, y) + count;//b11
            gonepoint();
            if ((hasil1 <= hasil2) && (hasil1 <= hasil3) && (hasil1 <= hasil4) && (hasil1 <= hasil5)) {
                moveithuman();
                B1.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B1.setText(".");
                xzombi=0;yzombi=0;
            } else if ((hasil2 <= hasil1) && (hasil2 <= hasil3) && (hasil2 <= hasil4) && (hasil2 <= hasil5)) {
                moveithuman();
                B2.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B2.setText(".");
                xzombi=1;yzombi=0;
            } else if ((hasil3 <= hasil2) && (hasil3 <= hasil1) && (hasil3 <= hasil4) && (hasil3 <= hasil5)) {
                moveithuman();
                B7.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B7.setText(".");
                xzombi=1;yzombi=1;
            } else if ((hasil4 <= hasil2) && (hasil4 <= hasil3) && (hasil4 <= hasil1) && (hasil4 <= hasil5)) {
                moveithuman();
                B12.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B12.setText(".");
                xzombi=1;yzombi=2;
            } else {
                moveithuman();
                B11.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B11.setText(".");
                xzombi=0;yzombi=2;

            }
        } else if (".".equals(B7.getText())) {
            int xplace = 1;
            int yplace = 1;

            int hasil1 = hitung(2, 1, x, y) + count;//B8
            int hasil2 = hitung(2, 0, x, y) + count;//B3
            int hasil3 = hitung(1, 0, x, y) + count;//B2
            int hasil4 = hitung(0, 0, x, y) + count;//B1
            int hasil5 = hitung(0, 1, x, y) + count;//B6
            int hasil6 = hitung(0, 2, x, y) + count;//B11
            int hasil7 = hitung(1, 2, x, y) + count;//B12
            int hasil8 = hitung(2, 2, x, y) + count;//B13
            gonepoint();
            if ((hasil1 <= hasil2) && (hasil1 <= hasil3) && (hasil1 <= hasil4) && (hasil1 <= hasil5)
                    && (hasil1 <= hasil6) && (hasil1 <= hasil7) && (hasil1 <= hasil8)) {
                B8.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B8.setText(".");
                xzombi=2;yzombi=1;
            } else if ((hasil2 <= hasil1) && (hasil2 <= hasil3) && (hasil2 <= hasil4) && (hasil2 <= hasil5)
                    && (hasil2 <= hasil6) && (hasil2 <= hasil7) && (hasil2 <= hasil8)) {
                B3.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B3.setText(".");
                xzombi=2;yzombi=0;
            } else if ((hasil3 <= hasil2) && (hasil3 <= hasil1) && (hasil3 <= hasil4) && (hasil3 <= hasil5)
                    && (hasil3 <= hasil6) && (hasil3 <= hasil7) && (hasil3 <= hasil8)) {
                B2.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B2.setText(".");
                xzombi=1;yzombi=0;
            } else if ((hasil4 <= hasil2) && (hasil4 <= hasil3) && (hasil4 <= hasil1) && (hasil4 <= hasil5)
                    && (hasil4 <= hasil6) && (hasil4 <= hasil7) && (hasil4 <= hasil8)) {
                B1.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B1.setText(".");
                xzombi=0;yzombi=0;
            } else if ((hasil5 <= hasil2) && (hasil5 <= hasil3) && (hasil5 <= hasil4) && (hasil5 <= hasil1)
                    && (hasil5 <= hasil6) && (hasil5 <= hasil7) && (hasil5 <= hasil8)) {
                B6.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B6.setText(".");
                xzombi=0;yzombi=1;
            } else if ((hasil6 <= hasil2) && (hasil6 <= hasil3) && (hasil6 <= hasil4) && (hasil6 <= hasil5)
                    && (hasil6 <= hasil1) && (hasil6 <= hasil7) && (hasil6 <= hasil8)) {
                B11.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B11.setText(".");
                xzombi=0;yzombi=2;
            } else if ((hasil7 <= hasil2) && (hasil7 <= hasil3) && (hasil7 <= hasil4) && (hasil7 <= hasil5)
                    && (hasil7 <= hasil6) && (hasil7 <= hasil1) && (hasil7 <= hasil8)) {
                B12.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B12.setText(".");
                xzombi=1;yzombi=2;
            } else {
                B13.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B13.setText(".");
                xzombi=2;yzombi=2;
            }
        } else if (".".equals(B8.getText())) {
            int xplace = 2;
            int yplace = 1;

            int hasil1 = hitung(2, 2, x, y) + count;//B13
            int hasil2 = hitung(1, 2, x, y) + count;//B17
            int hasil3 = hitung(1, 1, x, y) + count;//b7
            int hasil4 = hitung(1, 0, x, y) + count;//B2
            int hasil5 = hitung(2, 0, x, y) + count;//B3
            int hasil6 = hitung(3, 0, x, y) + count;//B4
            int hasil7 = hitung(3, 1, x, y) + count;//B9
            int hasil8 = hitung(3, 2, x, y) + count;//B14
            gonepoint();
            if ((hasil1 <= hasil2) && (hasil1 <= hasil3) && (hasil1 <= hasil4) && (hasil1 <= hasil5)
                    && (hasil1 <= hasil6) && (hasil1 <= hasil7) && (hasil1 <= hasil8)) {
                B13.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B13.setText(".");
                xzombi=2;yzombi=2;
            } else if ((hasil2 <= hasil1) && (hasil2 <= hasil3) && (hasil2 <= hasil4) && (hasil2 <= hasil5)
                    && (hasil2 <= hasil6) && (hasil2 <= hasil7) && (hasil2 <= hasil8)) {
                B17.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B17.setText(".");
                xzombi=1;yzombi=3;
            } else if ((hasil3 <= hasil2) && (hasil3 <= hasil1) && (hasil3 <= hasil4) && (hasil3 <= hasil5)
                    && (hasil3 <= hasil6) && (hasil3 <= hasil7) && (hasil3 <= hasil8)) {
                B7.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B7.setText(".");
                xzombi=1;yzombi=1;
            } else if ((hasil4 <= hasil2) && (hasil4 <= hasil3) && (hasil4 <= hasil1) && (hasil4 <= hasil5)
                    && (hasil4 <= hasil6) && (hasil4 <= hasil7) && (hasil4 <= hasil8)) {
                B2.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B2.setText(".");
                xzombi=1;yzombi=0;
            } else if ((hasil5 <= hasil2) && (hasil5 <= hasil3) && (hasil5 <= hasil4) && (hasil5 <= hasil1)
                    && (hasil5 <= hasil6) && (hasil5 <= hasil7) && (hasil5 <= hasil8)) {
                B3.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B3.setText(".");
                xzombi=2;yzombi=0;
            } else if ((hasil6 <= hasil2) && (hasil6 <= hasil3) && (hasil6 <= hasil4) && (hasil6 <= hasil5)
                    && (hasil6 <= hasil1) && (hasil6 <= hasil7) && (hasil6 <= hasil8)) {
                B4.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B4.setText(".");
                xzombi=3;yzombi=0;
            } else if ((hasil7 <= hasil2) && (hasil7 <= hasil3) && (hasil7 <= hasil4) && (hasil7 <= hasil5)
                    && (hasil7 <= hasil6) && (hasil7 <= hasil1) && (hasil7 <= hasil8)) {
                B9.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B9.setText(".");
                xzombi=3;yzombi=1;
            } else {
                B14.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B14.setText(".");
                xzombi=3;yzombi=2;
            }
        } else if (".".equals(B9.getText())) {
            int xplace = 3;
            int yplace = 1;

            int hasil1 = hitung(3, 2, x, y) + count;//B14
            int hasil2 = hitung(2, 2, x, y) + count;//B13
            int hasil3 = hitung(2, 1, x, y) + count;//B8
            int hasil4 = hitung(2, 0, x, y) + count;//B3
            int hasil5 = hitung(3, 0, x, y) + count;//B4
            int hasil6 = hitung(4, 0, x, y) + count;//B5
            int hasil7 = hitung(4, 1, x, y) + count;//B10
            int hasil8 = hitung(4, 2, x, y) + count;//B15
            gonepoint();
            if ((hasil1 <= hasil2) && (hasil1 <= hasil3) && (hasil1 <= hasil4) && (hasil1 <= hasil5)
                    && (hasil1 <= hasil6) && (hasil1 <= hasil7) && (hasil1 <= hasil8)) {
                B14.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B14.setText(".");
                xzombi=3;yzombi=2;
            } else if ((hasil2 <= hasil1) && (hasil2 <= hasil3) && (hasil2 <= hasil4) && (hasil2 <= hasil5)
                    && (hasil2 <= hasil6) && (hasil2 <= hasil7) && (hasil2 <= hasil8)) {
                B13.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B13.setText(".");
                xzombi=2;yzombi=2;
            } else if ((hasil3 <= hasil2) && (hasil3 <= hasil1) && (hasil3 <= hasil4) && (hasil3 <= hasil5)
                    && (hasil3 <= hasil6) && (hasil3 <= hasil7) && (hasil3 <= hasil8)) {
                B8.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B8.setText(".");
                xzombi=2;yzombi=1;
            } else if ((hasil4 <= hasil2) && (hasil4 <= hasil3) && (hasil4 <= hasil1) && (hasil4 <= hasil5)
                    && (hasil4 <= hasil6) && (hasil4 <= hasil7) && (hasil4 <= hasil8)) {
                B3.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B3.setText(".");
                xzombi=2;yzombi=0;
            } else if ((hasil5 <= hasil2) && (hasil5 <= hasil3) && (hasil5 <= hasil4) && (hasil5 <= hasil1)
                    && (hasil5 <= hasil6) && (hasil5 <= hasil7) && (hasil5 <= hasil8)) {
                B4.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B4.setText(".");
                xzombi=3;yzombi=0;
            } else if ((hasil6 <= hasil2) && (hasil6 <= hasil3) && (hasil6 <= hasil4) && (hasil6 <= hasil5)
                    && (hasil6 <= hasil1) && (hasil6 <= hasil7) && (hasil6 <= hasil8)) {
                B5.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B5.setText(".");
                xzombi=4;yzombi=0;
            } else if ((hasil7 <= hasil2) && (hasil7 <= hasil3) && (hasil7 <= hasil4) && (hasil7 <= hasil5)
                    && (hasil7 <= hasil6) && (hasil7 <= hasil1) && (hasil7 <= hasil8)) {
                B10.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B10.setText(".");
                xzombi=4;yzombi=1;
            } else {
                B15.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B15.setText(".");
                xzombi=4;yzombi=2;
            }
        } else if (".".equals(B10.getText())) {
            int xplace = 4;
            int yplace = 1;

            int hasil1 = hitung(4, 2, x, y) + count;//b15
            int hasil2 = hitung(3, 2, x, y) + count;//b14
            int hasil3 = hitung(3, 1, x, y) + count;//b9
            int hasil4 = hitung(3, 0, x, y) + count;//b4
            int hasil5 = hitung(4, 0, x, y) + count;//b5
            gonepoint();
            if ((hasil1 <= hasil2) && (hasil1 <= hasil3) && (hasil1 <= hasil4) && (hasil1 <= hasil5)) {
                moveithuman();
                B15.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B15.setText(".");
                xzombi=4;yzombi=2;
            } else if ((hasil2 <= hasil1) && (hasil2 <= hasil3) && (hasil2 <= hasil4) && (hasil2 <= hasil5)) {
                moveithuman();
                B14.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B14.setText(".");
                xzombi=3;yzombi=2;
            } else if ((hasil3 <= hasil2) && (hasil3 <= hasil1) && (hasil3 <= hasil4) && (hasil3 <= hasil5)) {
                moveithuman();
                B9.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B9.setText(".");
                xzombi=3;yzombi=1;
            } else if ((hasil4 <= hasil2) && (hasil4 <= hasil3) && (hasil4 <= hasil1) && (hasil4 <= hasil5)) {
                moveithuman();
                B4.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B4.setText(".");
                xzombi=3;yzombi=0;
            } else {
                moveithuman();
                B5.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B5.setText(".");
                xzombi=4;yzombi=0;

            }
        } else if (".".equals(B11.getText())) {
            int xplace = 0;
            int yplace = 2;

            int hasil1 = hitung(0, 1, x, y) + count;//b6
            int hasil2 = hitung(1, 1, x, y) + count;//b7
            int hasil3 = hitung(1, 2, x, y) + count;//b12
            int hasil4 = hitung(1, 3, x, y) + count;//b17
            int hasil5 = hitung(0, 3, x, y) + count;//b16
            gonepoint();
            if ((hasil1 <= hasil2) && (hasil1 <= hasil3) && (hasil1 <= hasil4) && (hasil1 <= hasil5)) {
                moveithuman();
                B6.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B6.setText(".");
                xzombi=0;yzombi=1;
            } else if ((hasil2 <= hasil1) && (hasil2 <= hasil3) && (hasil2 <= hasil4) && (hasil2 <= hasil5)) {
                moveithuman();
                B7.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B7.setText(".");
                xzombi=1;yzombi=1;
            } else if ((hasil3 <= hasil2) && (hasil3 <= hasil1) && (hasil3 <= hasil4) && (hasil3 <= hasil5)) {
                moveithuman();
                B12.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B12.setText(".");
                xzombi=1;yzombi=2;
            } else if ((hasil4 <= hasil2) && (hasil4 <= hasil3) && (hasil4 <= hasil1) && (hasil4 <= hasil5)) {
                moveithuman();
                B17.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B17.setText(".");
                xzombi=1;yzombi=3;
            } else {
                moveithuman();
                B16.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B16.setText(".");
                xzombi=0;yzombi=3;

            }
        } else if (".".equals(B12.getText())) {
            int xplace = 1;
            int yplace = 2;

            int hasil1 = hitung(1, 3, x, y) + count;//B17
            int hasil2 = hitung(0, 3, x, y) + count;//B16
            int hasil3 = hitung(0, 2, x, y) + count;//B11
            int hasil4 = hitung(0, 1, x, y) + count;//B6
            int hasil5 = hitung(1, 1, x, y) + count;//B7
            int hasil6 = hitung(2, 1, x, y) + count;//B8
            int hasil7 = hitung(2, 2, x, y) + count;//B13
            int hasil8 = hitung(2, 3, x, y) + count;//B18
            gonepoint();
            if ((hasil1 <= hasil2) && (hasil1 <= hasil3) && (hasil1 <= hasil4) && (hasil1 <= hasil5)
                    && (hasil1 <= hasil6) && (hasil1 <= hasil7) && (hasil1 <= hasil8)) {
                B17.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B17.setText(".");
                xzombi=1;yzombi=3;

            } else if ((hasil2 <= hasil1) && (hasil2 <= hasil3) && (hasil2 <= hasil4) && (hasil2 <= hasil5)
                    && (hasil2 <= hasil6) && (hasil2 <= hasil7) && (hasil2 <= hasil8)) {
                B16.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B16.setText(".");
                xzombi=0;yzombi=3;
            } else if ((hasil3 <= hasil2) && (hasil3 <= hasil1) && (hasil3 <= hasil4) && (hasil3 <= hasil5)
                    && (hasil3 <= hasil6) && (hasil3 <= hasil7) && (hasil3 <= hasil8)) {
                B11.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B11.setText(".");
                xzombi=0;yzombi=2;
            } else if ((hasil4 <= hasil2) && (hasil4 <= hasil3) && (hasil4 <= hasil1) && (hasil4 <= hasil5)
                    && (hasil4 <= hasil6) && (hasil4 <= hasil7) && (hasil4 <= hasil8)) {
                B6.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B6.setText(".");
                xzombi=0;yzombi=1;
            } else if ((hasil5 <= hasil2) && (hasil5 <= hasil3) && (hasil5 <= hasil4) && (hasil5 <= hasil1)
                    && (hasil5 <= hasil6) && (hasil5 <= hasil7) && (hasil5 <= hasil8)) {
                B7.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B7.setText(".");
                xzombi=1;yzombi=1;
            } else if ((hasil6 <= hasil2) && (hasil6 <= hasil3) && (hasil6 <= hasil4) && (hasil6 <= hasil5)
                    && (hasil6 <= hasil1) && (hasil6 <= hasil7) && (hasil6 <= hasil8)) {
                B8.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B8.setText(".");
                xzombi=2;yzombi=1;
            } else if ((hasil7 <= hasil2) && (hasil7 <= hasil3) && (hasil7 <= hasil4) && (hasil7 <= hasil5)
                    && (hasil7 <= hasil6) && (hasil7 <= hasil1) && (hasil7 <= hasil8)) {
                B13.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B13.setText(".");
                xzombi=2;yzombi=2;
            } else {
                B18.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B18.setText(".");
                xzombi=2;yzombi=3;
            }
        } else if (".".equals(B13.getText())) {
            B13.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\TicTac\\src\\images\\fall.jpg"));
                
            
            
            
            
            
        } else if (".".equals(B14.getText())) {
            int xplace = 3;
            int yplace = 2;

            int hasil1 = hitung(3, 3, x, y) + count;//B19
            int hasil2 = hitung(2, 3, x, y) + count;//B18
            int hasil3 = hitung(2, 2, x, y) + count;//B13
            int hasil4 = hitung(2, 1, x, y) + count;//B8
            int hasil5 = hitung(3, 1, x, y) + count;//B9
            int hasil6 = hitung(4, 1, x, y) + count;//B10
            int hasil7 = hitung(4, 2, x, y) + count;//B15
            int hasil8 = hitung(4, 3, x, y) + count;//B20
            gonepoint();
            if ((hasil1 <= hasil2) && (hasil1 <= hasil3) && (hasil1 <= hasil4) && (hasil1 <= hasil5)
                    && (hasil1 <= hasil6) && (hasil1 <= hasil7) && (hasil1 <= hasil8)) {
                B19.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B19.setText(".");
                xzombi=3;yzombi=3;
            } else if ((hasil2 <= hasil1) && (hasil2 <= hasil3) && (hasil2 <= hasil4) && (hasil2 <= hasil5)
                    && (hasil2 <= hasil6) && (hasil2 <= hasil7) && (hasil2 <= hasil8)) {
                B18.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B18.setText(".");
                xzombi=2;yzombi=3;
            } else if ((hasil3 <= hasil2) && (hasil3 <= hasil1) && (hasil3 <= hasil4) && (hasil3 <= hasil5)
                    && (hasil3 <= hasil6) && (hasil3 <= hasil7) && (hasil3 <= hasil8)) {
                B13.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B13.setText(".");
                xzombi=2;yzombi=2;
            } else if ((hasil4 <= hasil2) && (hasil4 <= hasil3) && (hasil4 <= hasil1) && (hasil4 <= hasil5)
                    && (hasil4 <= hasil6) && (hasil4 <= hasil7) && (hasil4 <= hasil8)) {
                B8.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B8.setText(".");
                xzombi=2;yzombi=1;
            } else if ((hasil5 <= hasil2) && (hasil5 <= hasil3) && (hasil5 <= hasil4) && (hasil5 <= hasil1)
                    && (hasil5 <= hasil6) && (hasil5 <= hasil7) && (hasil5 <= hasil8)) {
                B9.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B9.setText(".");
                xzombi=3;yzombi=1;
            } else if ((hasil6 <= hasil2) && (hasil6 <= hasil3) && (hasil6 <= hasil4) && (hasil6 <= hasil5)
                    && (hasil6 <= hasil1) && (hasil6 <= hasil7) && (hasil6 <= hasil8)) {
                B10.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B10.setText(".");
                xzombi=4;yzombi=1;
            } else if ((hasil7 <= hasil2) && (hasil7 <= hasil3) && (hasil7 <= hasil4) && (hasil7 <= hasil5)
                    && (hasil7 <= hasil6) && (hasil7 <= hasil1) && (hasil7 <= hasil8)) {
                B15.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B15.setText(".");
                xzombi=4;yzombi=2;
            } else {
                B20.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B20.setText(".");
                xzombi=4;yzombi=3;
            }
        } else if (".".equals(B15.getText())) {
            int xplace = 4;
            int yplace = 2;

            int hasil1 = hitung(4, 3, x, y) + count;//b20
            int hasil2 = hitung(3, 3, x, y) + count;//b19
            int hasil3 = hitung(3, 2, x, y) + count;//b14
            int hasil4 = hitung(3, 1, x, y) + count;//b9
            int hasil5 = hitung(4, 1, x, y) + count;//b10
            gonepoint();
            if ((hasil1 <= hasil2) && (hasil1 <= hasil3) && (hasil1 <= hasil4) && (hasil1 <= hasil5)) {
                moveithuman();
                B20.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B20.setText(".");
                xzombi=4;yzombi=3;
            } else if ((hasil2 <= hasil1) && (hasil2 <= hasil3) && (hasil2 <= hasil4) && (hasil2 <= hasil5)) {
                moveithuman();
                B19.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B19.setText(".");
                xzombi=3;yzombi=3;
            } else if ((hasil3 <= hasil2) && (hasil3 <= hasil1) && (hasil3 <= hasil4) && (hasil3 <= hasil5)) {
                moveithuman();
                B14.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B14.setText(".");
                xzombi=3;yzombi=2;
            } else if ((hasil4 <= hasil2) && (hasil4 <= hasil3) && (hasil4 <= hasil1) && (hasil4 <= hasil5)) {
                moveithuman();
                B9.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B9.setText(".");
                xzombi=3;yzombi=1;
            } else {
                moveithuman();
                B10.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B10.setText(".");
                xzombi=4;yzombi=1;

            }
        } else if (".".equals(B16.getText())) {
            int xplace = 0;
            int yplace = 3;

            int hasil1 = hitung(0, 2, x, y) + count;//b11
            int hasil2 = hitung(1, 2, x, y) + count;//b12
            int hasil3 = hitung(1, 3, x, y) + count;//b17
            int hasil4 = hitung(1, 4, x, y) + count;//b22
            gonepoint();
            if ((hasil1 <= hasil2) && (hasil1 <= hasil3) && (hasil1 <= hasil4)) {
                moveithuman();
                B11.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B11.setText(".");
                xzombi=0;yzombi=2;
            } else if ((hasil2 <= hasil1) && (hasil2 <= hasil3) && (hasil2 <= hasil4)) {
                moveithuman();
                B12.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B12.setText(".");
                xzombi=1;yzombi=2;
            } else if ((hasil3 <= hasil2) && (hasil3 <= hasil1) && (hasil3 <= hasil4)) {
                moveithuman();
                B17.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B17.setText(".");
                xzombi=1;yzombi=3;
            } else if ((hasil4 <= hasil2) && (hasil4 <= hasil3) && (hasil4 <= hasil1)) {
                moveithuman();
                B22.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B22.setText(".");
                xzombi=1;yzombi=4;
            }
        } else if (".".equals(B17.getText())) {
            int xplace = 1;
            int yplace = 3;

            int hasil1 = hitung(1, 4, x, y) + count;//B22
            int hasil2 = hitung(0, 3, x, y) + count;//B16
            int hasil3 = hitung(0, 2, x, y) + count;//B11
            int hasil4 = hitung(1, 2, x, y) + count;//B12
            int hasil5 = hitung(2, 2, x, y) + count;//B13
            int hasil6 = hitung(2, 3, x, y) + count;//B18
            int hasil7 = hitung(2, 4, x, y) + count;//B23
            gonepoint();
            if ((hasil1 <= hasil2) && (hasil1 <= hasil3) && (hasil1 <= hasil4) && (hasil1 <= hasil5)
                    && (hasil1 <= hasil6) && (hasil1 <= hasil7)) {
                B22.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B22.setText(".");
                xzombi=1;yzombi=4;
            } else if ((hasil2 <= hasil1) && (hasil2 <= hasil3) && (hasil2 <= hasil4) && (hasil2 <= hasil5)
                    && (hasil2 <= hasil6) && (hasil2 <= hasil7)) {
                B16.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B16.setText(".");
                xzombi=0;yzombi=3;
            } else if ((hasil3 <= hasil2) && (hasil3 <= hasil1) && (hasil3 <= hasil4) && (hasil3 <= hasil5)
                    && (hasil3 <= hasil6) && (hasil3 <= hasil7)) {
                B11.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B11.setText(".");
                xzombi=0;yzombi=2;
            } else if ((hasil4 <= hasil2) && (hasil4 <= hasil3) && (hasil4 <= hasil1) && (hasil4 <= hasil5)
                    && (hasil4 <= hasil6) && (hasil4 <= hasil7)) {
                B12.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B12.setText(".");
                xzombi=1;yzombi=2;
            } else if ((hasil5 <= hasil2) && (hasil5 <= hasil3) && (hasil5 <= hasil4) && (hasil5 <= hasil1)
                    && (hasil5 <= hasil6) && (hasil5 <= hasil7)) {
                B13.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B13.setText(".");
                xzombi=2;yzombi=2;
            } else if ((hasil6 <= hasil2) && (hasil6 <= hasil3) && (hasil6 <= hasil4) && (hasil6 <= hasil5)
                    && (hasil6 <= hasil1) && (hasil6 <= hasil7)) {
                B18.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B18.setText(".");
                xzombi=2;yzombi=3;
            } else if ((hasil7 <= hasil2) && (hasil7 <= hasil3) && (hasil7 <= hasil4) && (hasil7 <= hasil5)
                    && (hasil7 <= hasil6) && (hasil7 <= hasil1)) {
                B23.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B23.setText(".");
                xzombi=2;yzombi=4;
            }
        } else if (".".equals(B18.getText())) {
            int xplace = 2;
            int yplace = 3;

            int hasil1 = hitung(2, 4, x, y) + count;//B23
            int hasil2 = hitung(1, 4, x, y) + count;//B22
            int hasil3 = hitung(1, 3, x, y) + count;//B17
            int hasil4 = hitung(1, 2, x, y) + count;//B12
            int hasil5 = hitung(2, 2, x, y) + count;//B13
            int hasil6 = hitung(3, 2, x, y) + count;//B14
            int hasil7 = hitung(3, 3, x, y) + count;//B19
            int hasil8 = hitung(3, 4, x, y) + count;//B24
            gonepoint();
            if ((hasil1 <= hasil2) && (hasil1 <= hasil3) && (hasil1 <= hasil4) && (hasil1 <= hasil5)
                    && (hasil1 <= hasil6) && (hasil1 <= hasil7) && (hasil1 <= hasil8)) {
                B23.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B23.setText(".");
                xzombi=2;yzombi=4;

            } else if ((hasil2 <= hasil1) && (hasil2 <= hasil3) && (hasil2 <= hasil4) && (hasil2 <= hasil5)
                    && (hasil2 <= hasil6) && (hasil2 <= hasil7) && (hasil2 <= hasil8)) {
                B22.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B22.setText(".");
                xzombi=1;yzombi=4;
            } else if ((hasil3 <= hasil2) && (hasil3 <= hasil1) && (hasil3 <= hasil4) && (hasil3 <= hasil5)
                    && (hasil3 <= hasil6) && (hasil3 <= hasil7) && (hasil3 <= hasil8)) {
                B17.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B17.setText(".");
                xzombi=1;yzombi=3;
            } else if ((hasil4 <= hasil2) && (hasil4 <= hasil3) && (hasil4 <= hasil1) && (hasil4 <= hasil5)
                    && (hasil4 <= hasil6) && (hasil4 <= hasil7) && (hasil4 <= hasil8)) {
                B12.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B12.setText(".");
                xzombi=1;yzombi=2;
            } else if ((hasil5 <= hasil2) && (hasil5 <= hasil3) && (hasil5 <= hasil4) && (hasil5 <= hasil1)
                    && (hasil5 <= hasil6) && (hasil5 <= hasil7) && (hasil5 <= hasil8)) {
                B13.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B13.setText(".");
                xzombi=2;yzombi=2;
            } else if ((hasil6 <= hasil2) && (hasil6 <= hasil3) && (hasil6 <= hasil4) && (hasil6 <= hasil5)
                    && (hasil6 <= hasil1) && (hasil6 <= hasil7) && (hasil6 <= hasil8)) {
                B14.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B14.setText(".");
                xzombi=3;yzombi=2;
            } else if ((hasil7 <= hasil2) && (hasil7 <= hasil3) && (hasil7 <= hasil4) && (hasil7 <= hasil5)
                    && (hasil7 <= hasil6) && (hasil7 <= hasil1) && (hasil7 <= hasil8)) {
                B19.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B19.setText(".");
                xzombi=3;yzombi=3;
            } else {
                B24.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B24.setText(".");
                xzombi=3;yzombi=4;
            }
        } else if (".".equals(B19.getText())) {
            int xplace = 3;
            int yplace = 3;

            int hasil1 = hitung(3, 4, x, y) + count;//B24
            int hasil2 = hitung(2, 4, x, y) + count;//B23
            int hasil3 = hitung(2, 3, x, y) + count;//B18
            int hasil4 = hitung(2, 2, x, y) + count;//B13
            int hasil5 = hitung(3, 2, x, y) + count;//B14
            int hasil6 = hitung(4, 2, x, y) + count;//B15
            int hasil7 = hitung(4, 3, x, y) + count;//B20
            int hasil8 = hitung(4, 4, x, y) + count;//B25
            gonepoint();
            if ((hasil1 <= hasil2) && (hasil1 <= hasil3) && (hasil1 <= hasil4) && (hasil1 <= hasil5)
                    && (hasil1 <= hasil6) && (hasil1 <= hasil7) && (hasil1 <= hasil8)) {
                B24.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B24.setText(".");
                xzombi=3;yzombi=4;
            } else if ((hasil2 <= hasil1) && (hasil2 <= hasil3) && (hasil2 <= hasil4) && (hasil2 <= hasil5)
                    && (hasil2 <= hasil6) && (hasil2 <= hasil7) && (hasil2 <= hasil8)) {
                B23.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B23.setText(".");
                xzombi=2;yzombi=4;
            } else if ((hasil3 <= hasil2) && (hasil3 <= hasil1) && (hasil3 <= hasil4) && (hasil3 <= hasil5)
                    && (hasil3 <= hasil6) && (hasil3 <= hasil7) && (hasil3 <= hasil8)) {
                B18.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B18.setText(".");
                xzombi=2;yzombi=3;
            } else if ((hasil4 <= hasil2) && (hasil4 <= hasil3) && (hasil4 <= hasil1) && (hasil4 <= hasil5)
                    && (hasil4 <= hasil6) && (hasil4 <= hasil7) && (hasil4 <= hasil8)) {
                B13.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B13.setText(".");
                xzombi=2;yzombi=2;
            } else if ((hasil5 <= hasil2) && (hasil5 <= hasil3) && (hasil5 <= hasil4) && (hasil5 <= hasil1)
                    && (hasil5 <= hasil6) && (hasil5 <= hasil7) && (hasil5 <= hasil8)) {
                B14.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B14.setText(".");
                xzombi=3;yzombi=2;
            } else if ((hasil6 <= hasil2) && (hasil6 <= hasil3) && (hasil6 <= hasil4) && (hasil6 <= hasil5)
                    && (hasil6 <= hasil1) && (hasil6 <= hasil7) && (hasil6 <= hasil8)) {
                B15.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B15.setText(".");
                xzombi=4;yzombi=2;
            } else if ((hasil7 <= hasil2) && (hasil7 <= hasil3) && (hasil7 <= hasil4) && (hasil7 <= hasil5)
                    && (hasil7 <= hasil6) && (hasil7 <= hasil1) && (hasil7 <= hasil8)) {
                B20.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B20.setText(".");
                xzombi=4;yzombi=3;
            } else {
                B25.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B25.setText(".");
                xzombi=4;yzombi=4;
            }
        } else if (".".equals(B20.getText())) {
            int xplace = 4;
            int yplace = 3;

            int hasil1 = hitung(4, 4, x, y) + count;//b25
            int hasil2 = hitung(3, 4, x, y) + count;//b24
            int hasil3 = hitung(3, 3, x, y) + count;//b19//
            int hasil4 = hitung(3, 2, x, y) + count;//b14
            int hasil5 = hitung(4, 2, x, y) + count;//b15
            gonepoint();
            if ((hasil1 <= hasil2) && (hasil1 <= hasil3) && (hasil1 <= hasil4) && (hasil1 <= hasil5)) {
                moveithuman();
                B25.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B25.setText(".");
                xzombi=4;yzombi=4;
            } else if ((hasil2 <= hasil1) && (hasil2 <= hasil3) && (hasil2 <= hasil4) && (hasil2 <= hasil5)) {
                moveithuman();
                B24.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B24.setText(".");
                xzombi=3;yzombi=4;
            } else if ((hasil3 <= hasil2) && (hasil3 <= hasil1) && (hasil3 <= hasil4) && (hasil3 <= hasil5)) {
                moveithuman();
                B19.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B19.setText(".");
                xzombi=3;yzombi=3;
            } else if ((hasil4 <= hasil2) && (hasil4 <= hasil3) && (hasil4 <= hasil1) && (hasil4 <= hasil5)) {
                moveithuman();
                B14.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B14.setText(".");
                xzombi=3;yzombi=2;
            } else {
                moveithuman();
                B15.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B15.setText(".");
                xzombi=4;yzombi=2;
            }
        } else if (".".equals(B21.getText())) {
            // karena ada goal  
        } else if (".".equals(B22.getText())) {
            int xplace = 1;
            int yplace = 4;

            int hasil2 = hitung(0, 3, x, y) + count;//b16
            int hasil3 = hitung(1, 3, x, y) + count;//b17
            int hasil4 = hitung(2, 3, x, y) + count;//b18
            int hasil5 = hitung(2, 4, x, y) + count;//b23
            gonepoint();
            if ((hasil2 <= hasil3) && (hasil2 <= hasil4) && (hasil2 <= hasil5)) {
                moveithuman();
                B16.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B16.setText(".");
                xzombi=0;yzombi=3;
            } else if ((hasil3 <= hasil2) && (hasil3 <= hasil4) && (hasil3 <= hasil5)) {
                moveithuman();
                B17.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B17.setText(".");
                xzombi=1;yzombi=3;
            } else if ((hasil4 <= hasil2) && (hasil4 <= hasil3) && (hasil4 <= hasil5)) {
                moveithuman();
                B18.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B18.setText(".");
                xzombi=2;yzombi=3;
            } else {
                moveithuman();
                B23.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B23.setText(".");
                xzombi=2;yzombi=4;

            }
        } else if (".".equals(B23.getIcon())) {
            int xplace = 2;
            int yplace = 4;

            int hasil1 = hitung(1, 4, x, y) + count;//b22
            int hasil2 = hitung(1, 3, x, y) + count;//b17
            int hasil3 = hitung(2, 3, x, y) + count;//b18
            int hasil4 = hitung(3, 3, x, y) + count;//b19
            int hasil5 = hitung(3, 4, x, y) + count;//b24
            gonepoint();
            if ((hasil1 <= hasil2) && (hasil1 <= hasil3) && (hasil1 <= hasil4) && (hasil1 <= hasil5)) {
                moveithuman();
                B22.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B22.setText(".");
                xzombi=1;yzombi=4;
            } else if ((hasil2 <= hasil1) && (hasil2 <= hasil3) && (hasil2 <= hasil4) && (hasil2 <= hasil5)) {
                moveithuman();
                B17.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B17.setText(".");
                xzombi=1;yzombi=3;
            } else if ((hasil3 <= hasil2) && (hasil3 <= hasil1) && (hasil3 <= hasil4) && (hasil3 <= hasil5)) {
                moveithuman();
                B18.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B18.setText(".");
                xzombi=2;yzombi=3;
            } else if ((hasil4 <= hasil2) && (hasil4 <= hasil3) && (hasil4 <= hasil1) && (hasil4 <= hasil5)) {
                moveithuman();
                B19.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B19.setText(".");
                xzombi=3;yzombi=3;
            } else {
                moveithuman();
                B24.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B24.setText(".");
                xzombi=3;yzombi=4;

            }
        } else if (".".equals(B24.getText())) {

            int xplace = 3;
            int yplace = 4;

            int hasil1 = hitung(2, 4, x, y) + count;//b23
            int hasil2 = hitung(2, 3, x, y) + count;//b18
            int hasil3 = hitung(3, 3, x, y) + count;//b19
            int hasil4 = hitung(4, 3, x, y) + count;//b20
            int hasil5 = hitung(4, 4, x, y) + count;//b25
            gonepoint();
            if ((hasil1 <= hasil2) && (hasil1 <= hasil3) && (hasil1 <= hasil4) && (hasil1 <= hasil5)) {
                moveithuman();
                B23.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B23.setText(".");
                xzombi=2;yzombi=4;
            } else if ((hasil2 <= hasil1) && (hasil2 <= hasil3) && (hasil2 <= hasil4) && (hasil2 <= hasil5)) {
                moveithuman();
                B18.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B18.setText(".");
                xzombi=2;yzombi=3;
            } else if ((hasil3 <= hasil2) && (hasil3 <= hasil1) && (hasil3 <= hasil4) && (hasil3 <= hasil5)) {
                moveithuman();
                B19.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B19.setText(".");
                xzombi=3;yzombi=3;
            } else if ((hasil4 <= hasil2) && (hasil4 <= hasil3) && (hasil4 <= hasil1) && (hasil4 <= hasil5)) {
                moveithuman();
                B20.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B20.setText(".");
                xzombi=4;yzombi=3;
            } else {
                moveithuman();
                B25.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B25.setText(".");
                xzombi=4;yzombi=4;

            }

        } else if (".".equals(B25.getText())) {
            int xplace = 4;
            int yplace = 4;

            int hasil1 = hitung(4, 3, x, y) + count;//20
            int hasil2 = hitung(3, 3, x, y) + count;//19
            int hasil3 = hitung(3, 4, x, y) + count;//24
            gonepoint();
            if ((hasil1 <= hasil2) && (hasil1 <= hasil3)) {
                moveithuman();
                B20.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B20.setText(".");
                xzombi=4;yzombi=3;
            } else if ((hasil2 <= hasil1) && (hasil2 <= hasil3)) {
                B19.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B19.setText(".");
                xzombi=3;yzombi=3;
            } else {
                B24.setIcon(new ImageIcon("C:\\Users\\devan\\Documents\\NetBeansProjects\\Crownofpath\\src\\images\\minionzombie.jpg"));
                B24.setText(".");
                xzombi=3;yzombi=4;
            }
        }

    }

    public int hitung(int x, int y, int xgoal, int ygoal) {
        int orto = logic.ortho(x, y, xgoal, ygoal);
        int diag = 0 - orto;

        int hasil = logic.hpatern(orto, diag);

        return hasil;
    }

    
    public void checkedlose(int xplayer, int yplayer, int xzombie, int yzombie){
        if(( xplayer == xzombie)&&(yplayer==yzombie)){
            JOptionPane.showMessageDialog(this, "Sorry You Lose !");
            runing=false;
            
            
        }
    }
    
    
}
