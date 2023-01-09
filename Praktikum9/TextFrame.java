package Praktikum9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
    class TextFrame extends JFrame implements ActionListener {
        private static final int FRAME_WIDTH = 300;
        private static final int FRAME_HEIGHT = 200;
        private static final int FRAME_X_ORIGIN = 150;
        private static final int FRAME_Y_ORIGIN = 250;

        private final JTextField inputLine;

        public static void main(String[] args) {
            TextFrame frame = new TextFrame();
            frame.setVisible(true);
        }

        public TextFrame() {
            Container contentPane;

            // setter properti Frame
            setSize(FRAME_WIDTH, FRAME_HEIGHT);
            setResizable(false);
            setTitle("Program JFrame kedua");
            setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

            contentPane = getContentPane();
            contentPane.setLayout(new FlowLayout());

            inputLine = new JTextField();
            inputLine.setColumns(22);
            contentPane.add(inputLine);

            inputLine.addActionListener(this);

            //create and place two button to the frame
            JButton okButton = new JButton("OKE");
            contentPane.add(okButton);

            JButton cancelButton = new JButton("BATAL");
            contentPane.add(cancelButton);

            // register this frame as anaction listener of the two button
            cancelButton.addActionListener(this);
            okButton.addActionListener(this);

            // register `Exit upon closing`as a default close operation
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }

        public void actionPerformed(ActionEvent event) {
            if (event.getSource() instanceof JButton clickedButton) {

                String buttonText = clickedButton.getText();
                setTitle("KAMU KLIK `" + inputLine.getText() + "`");

            } else {//event source adalah inputline
                setTitle("KAMU MASUK `" + inputLine.getText() + "`");
            }
        }
}
