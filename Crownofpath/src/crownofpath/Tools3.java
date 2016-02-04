package crownofpath;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Tools3 extends JPanel {

private JButton Exit, Reset;
private Board3 Brd;

Tools3() {

    setLayout(new FlowLayout());

    Exit = new JButton("Exit");
    Reset = new JButton("Reset");

    Exit.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent ae) {
            System.exit(0);
        }
    });

    Reset.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent ae) {
            
            Brd.Reset();

        }

    });

    add(Exit);
    add(Reset);
}

public void SetObject(Board3 B) {

    Brd = B;

}

}