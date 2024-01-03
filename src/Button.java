import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Button extends JButton{
    Font font = new Font("Comic Sans MS", Font.BOLD, 32);
        public Button(String text){
            super(text);
            setFont(font);
            setFocusable(false);
            setBackground(Color.BLACK);
            setOpaque(true); // Set the opaque property to true
        }
    }