import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button_Ex
{
    public static void main(String args[])
    {
        JFrame frame=new JFrame("Application 1");
        JTextField textbox=new JTextField();
        textbox.setBounds(50,50,150,20);
        JButton button=new JButton("Click");
        button.setBounds(50,100,95,30);
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                textbox.setText("Welcome");
            }
        });
        frame.add(button);
        frame.add(textbox);
        frame.setSize(250,250);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
