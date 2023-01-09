package Praktikum9;

import javax.swing.*;
import java.awt.*;

public class Subclass2 extends JFrame {

    private static final int FRAME_WIDTH    = 300;
    private static final int FRAME_HEIGHT   = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;

    public static void main(String[] args) {
        Subclass2 frame = new Subclass2();
        frame.setVisible(true);
    }
    public Subclass2(){

        setTitle("Yellow Background JFrame Subclass");
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        changeBkcolor();
    }

    private void changeBkcolor(){

        Container contentPane = getContentPane();
        contentPane.setBackground(Color.yellow);

    }

}
