package Praktikum9;

import javax.swing.*;
import java.awt.*;

public class ButtonEvent extends JFrame {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;

    public static void main(String[] args) {
        ButtonEvent frame = new ButtonEvent();
        frame.setVisible(true);
    }

    public ButtonEvent () {

        Container contentPane = getContentPane();

        //set the frame properties
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setResizable(false);
        setTitle("Program Button Frame");
        setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);

        // set the layout manager
        contentPane.setLayout(new FlowLayout());

        // create and place two button on the frame`s content pane
        JButton okButton = new JButton("OKE");
        contentPane.add(okButton);

        JButton cancelButton = new JButton("BATAL");
        contentPane.add(cancelButton);

        /* registering a ButtonHandler as an action listener of the two Button
         */
        ButtonHandler handler = new ButtonHandler();
        cancelButton.addActionListener(handler);
        okButton.addActionListener(handler);

        // register `Exit upon closing` as a default close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}

