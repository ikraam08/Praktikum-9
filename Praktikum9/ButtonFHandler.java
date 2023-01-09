package Praktikum9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ButtonFHandler extends JFrame implements ActionListener {

    private static final int FRAME_WIDTH     = 300;
    private static final int FRAME_HEIGHT    = 300;
    private static final int FRAME_X_ORIGIN  = 300;
    private static final int FRAME_Y_ORIGIN = 300;

    private JButton cancelButton;
    private JButton okButton;

    public static void main(String[] args) {
        ButtonFHandler frame = new ButtonFHandler();
        frame.setVisible(true);
    }
    public ButtonFHandler (){
        Container contentPane = getContentPane();
        // setter pada property frame
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setResizable(false);
        setTitle("Program Button Frame Handler");
        setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);

        // setter pada Layout manager
        contentPane.setLayout(new FlowLayout());

        // membuat and menempatkan dua tombol pada frame content pane
        okButton = new JButton("OKE");
        contentPane.add(okButton);

        cancelButton = new JButton("BATAL");
        contentPane.add(cancelButton);

        //daftar frame diatas sebagai action listener pada dua tombol
        cancelButton.addActionListener(this);
        okButton.addActionListener(this);

        //daftar register `Exit upon closing` as a default close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void actionPerformed (ActionEvent event){
        JButton clickedButton = (JButton) event.getSource();
        String buttonText = clickedButton.getText();
        setTitle("Kamu klik " + buttonText);
    }

}
