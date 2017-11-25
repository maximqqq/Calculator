import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.ColorModel;
import java.util.ArrayList;
import java.util.List;

public class Calculator extends JFrame {
    JTextArea textArea;
    JButton button1;



    public Calculator()
    {
        this.setTitle("КАЛЬКУЛЯТОР");
        this.setSize(300,200);
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

        textArea = new JTextArea(5,20);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);


        textArea.setSize(10,10);
        add(panel,BorderLayout.SOUTH);
        panel.add(textArea);

        button1 = new JButton("=");

        button1.setSize(10,20);
        button1.addActionListener(new ButtonListener());

        panel.add(button1);



        this.setVisible(true);
    }

    public class ButtonListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {

        String temp = null;
        temp = textArea.getText();

        String[] num;
        num = temp.split("[-+/*]");

        char[] z;
        z = temp.toCharArray();

            List<Character> znac = new ArrayList<>();

            for (int i =0; i<z.length; i++)
            {
                if(z[i]=='+'||z[i]=='-'||z[i]=='/'||z[i]=='*')
                {
                    znac.add(z[i]);
                }

            }

            double[] numbers = new double[num.length];

            for(int i = 0; i<num.length;i++)
            {
                numbers[i]=Double.parseDouble(num[i]);
            }

            double result = 0;

            result += numbers[0];

            for(int i = 0; i<znac.size();i++)
            {
                char buf = znac.get(i);
                switch (buf)
                {
                    case'+':
                        result += numbers[i+1];
                        break;
                    case'-':
                        result -= numbers[i+1];
                        break;
                    case'/':
                        result /= numbers[i+1];
                        break;
                    case'*':
                        result *= numbers[i+1];
                        break;
                }
            }

            textArea.setText(String.valueOf(result));

        }
    }






}
