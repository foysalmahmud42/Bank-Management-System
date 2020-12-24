package bankmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LoginFrame1 extends JFrame
{
    JLabel Lable1;
    JLabel Lable2;
    JLabel Lable3;
    
    JButton emplPress;
    JButton cusPress;
    
    public LoginFrame1() 
    {
        super("Login");
        this.setSize(630, 400);
        this.setLayout(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLocation(300, 200);   // almost Middle
        addContent();
        action();
    }
    void addContent()
    {
        Lable1 = new JLabel("Rawan Bank Limited");
        Lable1.setBounds(180, 30, 300, 50);
        this.add(Lable1);
        
        Lable2 = new JLabel("Join Rawan Bank Limited now !!");
        Lable2.setBounds(200, 50, 300, 50);
        this.add(Lable2); 
        
        Lable3 = new JLabel("we insure your safety and protect your privacy.");
        Lable3.setBounds(220, 70, 300, 50);
        this.add(Lable3);  
        
        emplPress = new JButton("Login As Employee");
        emplPress.setBounds(150, 130, 300, 50);
        this.add(emplPress);
        
        cusPress = new JButton("Login As customer");
        cusPress.setBounds(150, 200, 300, 50);
        this.add(cusPress);
    }
    public void action()
    {
        ActionListener a1 = new ActionListener()
        {
              public void actionPerformed(ActionEvent e)
              {
                dispose();
                LoginFrame2 f2 = new LoginFrame2();             
                f2.setResizable(false);
                f2.setVisible(true);               
              }
        };
        emplPress.addActionListener(a1);
        ActionListener a2 = new ActionListener()
        {
              public void actionPerformed(ActionEvent e)
              {
                dispose();
                LoginFrame3 f3 = new LoginFrame3();               
                f3.setResizable(false);
                f3.setVisible(true);               
              }
        };
       cusPress.addActionListener(a2);
        
    } 
}
