package Praktikum9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonHandler implements ActionListener {
   public ButtonHandler(){
   }

   public void actionPerformed(ActionEvent event){
       JButton clickedButton = (JButton) event.getSource();

       JRootPane rootPane = clickedButton.getRootPane();
       Frame frame        = (JFrame) rootPane.getParent();
       String buttonText  = clickedButton.getText();
       frame.setTitle("KAMU KLIK " + buttonText);

   }

}
