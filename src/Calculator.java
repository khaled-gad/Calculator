import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//how would you split this code into multiple files?
public class Calculator implements ActionListener {

    JFrame frame;
    JTextField textfield;
    JButton[] numbuttons = new JButton[10];
    JButton[] funcbuttons = new JButton[8];
    JButton addButton, subButton, mulButton, divButton, decButton, equButton, ACButton, negButton;
    JPanel panel,panel2;
    //suuper cool font
    Font font = new Font("Comic Sans MS", Font.BOLD, 32);
    Font font2 = new Font("Comic Sans MS", Font.BOLD, 27);

    // Color pink = new Color(255, 0, 255);


    double num1 = 0, num2 = 0, result = 0;
    char operator;

    Calculator() {
        frame = new Frame();
        textfield = new Textfield();        

        panel2 = new JPanel();
        panel2.setSize(300, 50);
        panel2.setLayout(new GridLayout(1, 1, 5, 5));
        panel2.setBackground(Color.BLACK);
        panel2.add(textfield);
        
        
        addButton = new Button("+");
        subButton = new Button("-");
        mulButton = new Button("x");
        divButton = new Button("÷");
        decButton = new Button(".");
        equButton = new Button("=");
        ACButton  = new Button("AC");
        negButton = new Button("+/-");
        
        ACButton.setForeground(Color.RED);

        JButton[] functionButtons = {addButton, subButton, mulButton, divButton, decButton, equButton, ACButton, negButton};
        
        
        for (JButton button : functionButtons){
            button.addActionListener(this);   
        }
        for (int i=0 ; i<10 ; i++){
            numbuttons[i] = new Button(String.valueOf(i));
            numbuttons[i].addActionListener(this);
        }
        
        
        
        JLabel extraLabel = new JLabel(" Extra");
        extraLabel.setFont(font2);
        extraLabel.setForeground(Color.GRAY);
        
        
        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 5, 5));
        panel.setBackground(Color.BLACK);
        
        panel.add(numbuttons[1]);
        panel.add(numbuttons[2]);
        panel.add(numbuttons[3]);
        panel.add(subButton);
        panel.add(numbuttons[4]);
        panel.add(numbuttons[5]);
        panel.add(numbuttons[6]);
        panel.add(addButton);
        panel.add(numbuttons[7]);
        panel.add(numbuttons[8]);
        panel.add(numbuttons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numbuttons[0]);
        panel.add(equButton);
        panel.add(divButton);
        panel.add(extraLabel);
        panel.add(negButton);
        panel.add(ACButton);
        
        frame.add(panel2, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {

        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent click ) {
        

        for (int i = 0; i < 10; i++) {
            if (click.getSource() == numbuttons[i]) {
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
            }
        }
        if (click.getSource() == decButton) {
            textfield.setText(textfield.getText().concat("."));
        }
        if (click.getSource() == addButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '+';
            textfield.setText("");
        }
        if (click.getSource() == subButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '-';
            textfield.setText("");
        }
        if (click.getSource() == mulButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '*';
            textfield.setText("");
        }
        if (click.getSource() == divButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '/';
            textfield.setText("");
        }
        if (click.getSource() == equButton) {
            num2 = Double.parseDouble(textfield.getText());

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            textfield.setText(String.valueOf(result));
            num1 = result;
        }
        if (click.getSource() == ACButton) {
            textfield.setText("");
        }
        if (click.getSource() == negButton) {
            double temp = Double.parseDouble(textfield.getText());
            temp *= -1;
            textfield.setText(String.valueOf(temp));
        }
    }
}
