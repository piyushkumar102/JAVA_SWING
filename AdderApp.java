import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdderApp implements ActionListener
{
    JTextField textbox1,textbox2,textbox3;
    JButton button,button1;
    AdderApp()
    {
        JFrame frame = new JFrame("Adder");
        textbox1 = new JTextField();
        textbox2 = new JTextField();
        textbox3 = new JTextField();
        button=new JButton("+");
        button1=new JButton("-");
        textbox1.setBounds(50,50,150,20);
        textbox2.setBounds(50,80,150,20);
        textbox3.setBounds(50,110,150,20);
        textbox3.setEditable(false);
        button.setBounds(50,140,50,30);
        button1.setBounds(150,140,50,30);
        frame.add(textbox1);
        frame.add(textbox2);
        frame.add(textbox3);
        frame.add(button);
        frame.add(button1);
        button.addActionListener(this);
        button1.addActionListener(this);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String a=textbox1.getText();
        String b=textbox2.getText();
        int ai=Integer.parseInt(a);
        int bi=Integer.parseInt(b);
        int c;
        if(e.getSource()==button)
        {
            c=ai+bi;
        }
        else
        {
            c=ai-bi;
        }
        String answer=String.valueOf(c);
        textbox3.setText(answer);
    }
    public static void main(String[] args)
    {
        new AdderApp();
    }
}

