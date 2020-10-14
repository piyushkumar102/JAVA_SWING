import javax.swing.*;

public class JLabel_Example
{
    public static void main(String args[])
    {
        JFrame frame=new JFrame("Labels");
        JLabel label1=new JLabel("Test 1");
        JLabel label2=new JLabel("Test 2");
        label1.setBounds(50,50,100,30);
        label2.setBounds(50,80,100,30);
        frame.add(label1);
        frame.add(label2);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
