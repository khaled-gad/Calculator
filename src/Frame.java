import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame extends JFrame{
        public Frame(){
            super("Calculator");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(370, 490);
            setLayout(new BorderLayout());
            getContentPane().setBackground(Color.BLACK);
            setLocationRelativeTo(null);
            setResizable(false);
        }
    }