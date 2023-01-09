package Praktikum9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public abstract class TextFrame2 extends JFrame implements ActionListener {
    private JLabel prompt;
    private JLabel image;

    public static void main(String[] args) {
        TextFrame2 frame = new TextFrame2() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        frame.setVisible(true);
    }
    public TextFrame2(){
        image = new JLabel(new ImageIcon("cate.gif"));
        image.setSize(50,50);
        getContentPane().add(image);

        prompt = new JLabel();
        prompt.setText("Masukan Namamu");
        prompt.setSize(150,25);
        getContentPane().add(image);
    }
}
