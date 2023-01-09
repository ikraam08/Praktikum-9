package Praktikum9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

class Textframe3 extends JFrame implements ActionListener {

    private static final int FRAME_WIDTH       = 300;
    private static final int FRAME_HEIGHT      = 250;
    private static final int FRAME_X_ORIGIN    = 150;
    private static final int FRAME_Y_ORIGIN    = 250;

    private static final String EMPTY_STRING ="";
    private static final String NEWLINE
            = System.clearProperty("line.separator");
    private final JButton addButton;
    private final JTextField inputLine;
    private final JTextArea textArea;

    public static void main(String[] args) {
        Textframe3 frame = new Textframe3();
        frame.setVisible(true);
    }

    public Textframe3(){
        Container contentPane = new Container();

        // setter frame properties
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setResizable(false);
        setTitle("Program Text Frame 3");
        setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);

        textArea = new JTextArea();
        textArea.setColumns(22);
        textArea.setRows(8);
        textArea.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        textArea.setEditable(false);
        contentPane.add(textArea);

        inputLine = new JTextField();
        inputLine.setColumns(22);
        contentPane.add(inputLine);

        inputLine.addActionListener(this);

        // membuat and menempatkan dua tombol pada frame
        addButton = new JButton("ADD");
        contentPane.add(addButton);

        JButton clearButton = new JButton("CLEAR");
        contentPane.add(clearButton);

        // register `exit upon closing` as a default close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent event){

        if (event.getSource() instanceof JButton clickedButton){

            if (clickedButton == addButton){
                addText (inputLine.getText());
            }else {  // the event source is inputline
                    addText(inputLine.getText());
            }
        }
    }

    private void addText(String text) {
        textArea.append(text + NEWLINE);
        inputLine.setText("");
    }
    private void clearText (){
        textArea.setText(EMPTY_STRING);
        inputLine.setText(EMPTY_STRING);
    }
}