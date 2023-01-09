package Praktikum9;

import javax.swing.*;
import java.awt.*;
public class ButtonFrame extends JFrame {

    private static final int FRAME_WIDTH    = 300;
    private static final int FRAME_HEIGHT   = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;

    private JButton cancelButton;
    private JButton okButton;

    public static void main(String[] args) {
        ButtonFrame frame = new ButtonFrame();
        frame.setVisible(true);

    }

    public ButtonFrame (){

        Container contentPane = getContentPane();

        // set the frame properties
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setResizable(false);
        setTitle("Program Button Frame");
        setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);

        // set the layout manager
        contentPane.setLayout(new FlowLayout());

        // create and place tho button on the frame`s content pane
        okButton = new JButton("OKE");
        contentPane.add(okButton);

        cancelButton = new JButton("BATAL");
        contentPane.add(cancelButton);

        // register `exit upon closing` as a default close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
