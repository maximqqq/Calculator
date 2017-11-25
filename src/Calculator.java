import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Calculator extends JFrame {

    private  JButton button_addition;
    private JTextArea textArea;
    private JTextField textField;
    private JLabel label;



    public Calculator()
    {
        this.setTitle("КАЛЬКУЛЯТОР");
        this.setSize(300,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
////////////////////////////////////////////////////////////////////////////////////////
        setLayout(new BorderLayout());

        JMenuBar menuBar =new JMenuBar();

        JMenu menu = new JMenu();
        menu.setText("Файл");


        JMenuItem open = new JMenuItem();
        open.setText("Открыть");
        JMenuItem save = new JMenuItem();
        save.setText("Сохранить");
        JMenuItem close = new JMenuItem();
        close.setText("Закрыть");
        JSeparator separator = new JSeparator();
        JMenuItem exit = new JMenuItem();
        exit.setText("Выйти");

        menu.add(open);
        menu.add(save);
        menu.add(close);
        menu.add(exit);

        menuBar.add(menu);

        add(menuBar,BorderLayout.NORTH);//добавляем элементы в саму форму
//////////////////////////////////////////////////////////////////////////////////////////
        JMenu options = new JMenu();
        options.setText("Опции");

        ButtonGroup group = new ButtonGroup();


        JRadioButtonMenuItem plus = new JRadioButtonMenuItem("+",false);
        group.add(plus);
        JRadioButtonMenuItem minus = new JRadioButtonMenuItem("-",true);
        group.add(minus);
        JRadioButtonMenuItem umnojit = new JRadioButtonMenuItem("*",false);
        group.add(umnojit);
        JRadioButtonMenuItem delit = new JRadioButtonMenuItem("/",false);
        group.add(delit);

        options.add(plus);
        options.add(minus);
        options.add(umnojit);
        options.add(delit);

        menuBar.add(options);
//////////////////////////////////////////////////////////////////////////////////////////

        JPanel panel = new JPanel();
       // panel.setSize(50,50);

        JTextArea textArea = new JTextArea(5,20);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setSize(10,10);
        add(panel,BorderLayout.SOUTH);
        panel.add(textArea);

        JButton button1 = new JButton("=");

        button1.setSize(10,20);

        panel.add(button1);

///////////////////////////////////////////////////////////////////////////////////////////





///////////////////////////////////////////////////////////////////////////////////////////






        this.setVisible(true);
    }




}
