import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Forms
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Forms");
        JOptionPane.showMessageDialog(frame,"Warning","Alert",JOptionPane.WARNING_MESSAGE);


        JTextField first_name = new JTextField("First Name");
        JTextField last_name = new JTextField("Last Name");
        first_name.setBounds(50,50,150,20);
        last_name.setBounds(50,80,150,20);
        frame.add(first_name);frame.add(last_name);

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        male.setBounds(50,120,100,20);
        female.setBounds(150,120,100,20);
        frame.add(male);frame.add(female);
        ButtonGroup group=new ButtonGroup();
        group.add(male);
        group.add(female);

        JCheckBox subjectsC = new JCheckBox("C");
        JCheckBox subjectsJ  = new JCheckBox("Java");
        JCheckBox subjectsP = new JCheckBox("Python");
        JCheckBox subjectsCPP= new JCheckBox("CPP");
        subjectsC.setBounds(50,150,50,20);
        subjectsJ.setBounds(100,150,80,20);
        subjectsP.setBounds(180,150,80,20);
        subjectsCPP.setBounds(260,150,80,20);
        frame.add(subjectsC);frame.add(subjectsJ);
        frame.add(subjectsP);frame.add(subjectsCPP);


        JPasswordField pass = new JPasswordField();
        pass.setToolTipText("Enter Password");
        pass.setBounds(50,180,150,20);
        frame.add(pass);

        String[] countries ={"India","Pakistan","USA","United Kingdom","Bangladesh"};
        JComboBox country=new JComboBox(countries);
        country.setBounds(50, 210,150,20);
        frame.add(country);


        JMenuBar menu=new JMenuBar();
        JMenu menu1=new JMenu("Form");
        JMenu sub=new JMenu("Forms");
        JMenuItem item1=new JMenuItem("New Form");
        JMenuItem item2=new JMenuItem("Save Form");
        JMenuItem item3=new JMenuItem("Clear Form");
        menu1.add(item1);
        sub.add(item2);
        sub.add(item3);
        menu1.add(sub);
        menu.add(menu1);
        frame.setJMenuBar(menu);
        frame.setJMenuBar(menu);

        JPopupMenu popupmenu = new JPopupMenu("Edit");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");
        popupmenu.add(cut); popupmenu.add(copy); popupmenu.add(paste);
        frame.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                popupmenu.show(frame , e.getX(), e.getY());
            }
        });
        frame.add(popupmenu);

        JButton button = new JButton("Submit");
        button.setBounds(50,300,150,20);
        frame.add(button);

        JTextArea ta=new JTextArea("Hello");
        JPanel tab1=new JPanel();
        tab1.add(ta);
        JPanel tab2=new JPanel();
        JPanel tab3=new JPanel();
        JTabbedPane tabs=new JTabbedPane();
        tabs.setBounds(50,340,200,200);
        tabs.add("Notes",tab1);
        tabs.add("Notes",tab2);
        tabs.add("Notes",tab3);
        frame.add(tabs);

        frame.setSize(1000,1000);
        frame.setLayout(null);
        frame.setVisible(true);
    }

}
