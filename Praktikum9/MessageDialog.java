package Praktikum9;

import javax.swing.*;
import javax.swing.JOptionPane;

public class MessageDialog {

    public static void main(String[] args) {
        JFrame jFrame;

        jFrame = new JFrame();
        jFrame.setSize(400, 300);
        jFrame.setVisible(true);

        JOptionPane.showInputDialog("People said?");
        JOptionPane.showMessageDialog(jFrame,"Said Terima kasih than :3");
    }


}
