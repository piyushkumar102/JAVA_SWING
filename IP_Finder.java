import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;
public class IP_Finder
{
    public static void main(String args[])
    {
        JFrame frame = new JFrame("IP Finder");
        JTextField textbox = new JTextField();
        JButton button = new JButton("Find IP");
        JLabel label = new JLabel();
        textbox.setBounds(50,50,300,20);
        button.setBounds(50,80,300,20);
        label.setBounds(50,110,300,20);
        frame.add(textbox);
        frame.add(label);
        frame.add(button);
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String website=textbox.getText();
                String ip_address= null;
                try
                {
                    ip_address = InetAddress.getByName(website).getHostAddress();
                } catch (UnknownHostException unknownHostException)
                {
                    unknownHostException.printStackTrace();
                }
                label.setText("IP Address :"+ip_address);
            }
        });
        frame.setSize(500,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
