//Create Frame with Button
import javax.swing.*;
public class Sample1 extends  JFrame
{
    Sample1()
    {
        JButton button=new JButton("Click Here");
        button.setBounds(150,150,100,50);   //Create Button
        add(button); //Add the Button to the frame
        setSize(400,400); //Frame Size
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new Sample1();
    }
}
