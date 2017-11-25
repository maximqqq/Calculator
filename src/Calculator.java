import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {

    private  JButton button_addition;
    private JTextArea textArea;
    private JTextField textField;
    private JLabel label;



    public Calculator()
    {
        this.setTitle("КАЛЬКУЛЯТОР");
        this.setSize(500,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }



}
