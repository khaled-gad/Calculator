import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Textfield extends JTextField{
    Font font = new Font("Comic Sans MS", Font.BOLD, 32);

        public Textfield(){
            super();
            setBounds(0, 0, 300, 100);
            setFont(font);
            setEditable(false);
            setBackground(Color.BLACK);
            setForeground(Color.WHITE);
        }
    }