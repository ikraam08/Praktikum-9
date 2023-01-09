# PRAKTIKUM9
## Pemrograman Orientasi Objek

````shell
Nama   : Ikram Ramadhan
Nim    : 312110478
Matkul : Pemrograman Orientasi Objek
````


### 1. File ButtonEvent.java
* *CODINGAN FILE 1

```java
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


```
* *Hasil output program:*
  ![img 1](ssan/ssan1.png)

### 2.ButtonFrame.java
* *CODINGAN FILE 2
```java
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

```
* *Hasil output program:*
  ![img 1](ssan/ssan1.png)

### 3.ButtonHandler.java
* *CODINGAN FILE 3
```java
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

```
* *Hasil output program:*
  ![img 1](ssan/ssan1.png)

### 4.ButtonFHandler.java
* *CODINGAN FILE 4
```java
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

```
* *Hasil output program:*
  ![img 1](ssan/ssan1.png)

### 5.Defaultjframe.java
* *CODINGAN FILE 5
```java
package Praktikum9;

import javax.swing.*;

public class DefaultJframe {

  public static void main(String[] args) {
    JFrame defaultJFrame;

    defaultJFrame = new JFrame();
    defaultJFrame.setVisible(true);
  }

}

```
* *Hasil output program:*
  ![img 1](ssan/ssan1.png)

### 6.JFrametestsub1.java
* *CODINGAN FILE 6
```java
package Praktikum9;

public class JFrametestsub1 {
  public static void main(String[] args) {


    Subclass1 myFrame;

    myFrame = new Subclass1();
    myFrame.setVisible(true);

  }
}

```
* *Hasil output program:*
  ![img 1](ssan/ssan1.png)

### 7.MessageDialog.java
* *CODINGAN FILE 7
```java
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

```
* *Hasil output program:*
  ![img 1](ssan/ssan1.png)

### 8.Subclass1.java
* *CODINGAN FILE 8
```java
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

```
* *Hasil output program:*
  ![img 1](ssan/ssan1.png)

### 9.Subclass2.java
* *CODINGAN FILE 9

```java
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

```
* *Hasil output program:*
  ![img 1](ssan/ssan1.png)

### 10.TextFrame.java
* *CODINGAN FILE 10
```java
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

```
* *Hasil output program:*
  ![img 1](ssan/ssan1.png)

### 11.ButtonFHandler.java
* *CODINGAN FILE 4
```java
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

```
* *Hasil output program:*
  ![img 1](ssan/ssan1.png)

### 11.TextFrame2.java
* *CODINGAN FILE 11
```java
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

```
* *Hasil output program:*
  ![img 1](ssan/ssan1.png)

### 12.TextFrame3.java
* *CODINGAN FILE 12
```java
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
```
* *Hasil output program:*
  ![img 1](ssan/ssan1.png)