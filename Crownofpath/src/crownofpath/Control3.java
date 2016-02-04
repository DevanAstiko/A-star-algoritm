package crownofpath;

import java.awt.*;
import javax.swing.*;

public class Control3 extends JFrame {

    /*
     this is the main controler that controls
     and combines different components of the game.
     */
    private Board3 GameBoard;     private Tools3 TButtons; 
    Control3() {

        setLayout(new BorderLayout());

        GameBoard = new Board3();
        TButtons = new Tools3();

        TButtons.SetObject(GameBoard);

        add(GameBoard, BorderLayout.CENTER);
        add(TButtons, BorderLayout.SOUTH);

        setVisible(true);
        setSize(540, 590);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        
    }

}
