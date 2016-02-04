package crownofpath;

import java.awt.*;
import javax.swing.*;

public class Control2 extends JFrame {

    /*
     this is the main controler that controls
     and combines different components of the game.
     */
    private Board2 GameBoard;     private Tools2 TButtons; 
    Control2() {

        setLayout(new BorderLayout());

        GameBoard = new Board2();
        TButtons = new Tools2();

        TButtons.SetObject(GameBoard);

        add(GameBoard, BorderLayout.CENTER);
        add(TButtons, BorderLayout.SOUTH);

        setVisible(true);
        setSize(540, 590);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        
    }

}
