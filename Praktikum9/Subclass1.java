package Praktikum9;

import javax.swing.*;

public class Subclass1 extends JFrame {

    private static final int FRAME_WIDTH    = 300;
    private static final int FRAME_HEIGHT   = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;

    public Subclass1 (){

        setTitle("Subclass Pertama Saya");
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
