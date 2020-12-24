package bankmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InterestAddFrame2 extends JFrame
{
     
    JLabel Lable1;
    JLabel pass;
    JTextField passC;
    JLabel date;
    JTextField dateC;
    JLabel newPass;
    JTextField newPassC;
    
    JButton giveInterest;
    JButton back;
    JButton back2;
    
    public InterestAddFrame2()
    {
        super("Customer Frame for Saving Account");
        this.setSize(600, 400);
        setLocation(200,200);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addContent();
        
        ActionListener a1 = new ActionListener()
        {
              public void actionPerformed(ActionEvent e)
              {
                dispose();
                Customerframe2 c1 = new Customerframe2();
                c1.setResizable(false);
                c1.setVisible(true);
              }
        };
        back.addActionListener(a1);
        
        ActionListener a2 = new ActionListener()
        {
              public void actionPerformed(ActionEvent e)
              {
                
              }
        };
        giveInterest.addActionListener(a2);
    }
    public void addContent()
    {
    
        Lable1 = new JLabel("Rawan Bank Limited.");
        Lable1.setBounds(220, 80, 300, 50);
        this.add(Lable1);
        
        date = new JLabel("Date:");
        date.setBounds(160, 130, 300, 50);
        this.add(date);

        dateC = new JTextField();
        dateC.setBounds(240, 145, 150, 20);
        this.add(dateC);
         
        pass = new JLabel("Password:");
        pass.setBounds(160, 160, 300, 50);
        this.add(pass);

        passC = new JTextField();
        passC.setBounds(240, 175, 150, 20);
        this.add(passC);
        
        giveInterest = new JButton("Show Interest");
        giveInterest.setBounds(220, 205, 120, 20);
        this.add(giveInterest);
        
        back = new JButton("Back");
        back.setBounds(450,5,100,20);
        this.add(back);
    }
}
