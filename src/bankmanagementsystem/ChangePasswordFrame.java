
package bankmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ChangePasswordFrame extends JFrame 
{
    JLabel Lable1;
    JLabel pass;
    JPasswordField passC;
    JLabel date;
    JTextField dateC;
    JLabel newPass;
    JPasswordField newPassC;
    JLabel ID;
    JTextField IDS;
    
    String old;
    String newp;
    
    JButton submit;
    JButton back;

    public ChangePasswordFrame()
    {
        super("Change Password for Saving Account");
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
                CustomerFrame1 c1 = new CustomerFrame1();
                c1.setResizable(false);
                c1.setVisible(true);
              }
        };
        back.addActionListener(a1);
       
        ActionListener a2 = new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
               old = passC.getText();
               newp = newPassC.getText();
               SavingAccount sa = new SavingAccount();
               sa.passChange(old, newp);
            }
        };
        submit.addActionListener(a2);
    }
    public void addContent()
    {
        Lable1 = new JLabel("Rawan Bank Limited.");
        Lable1.setBounds(220, 80, 300, 50);
        this.add(Lable1);
        
        ID = new JLabel("ID:");
        ID.setBounds(160, 130, 300, 50);
        this.add(ID);

        IDS = new JTextField();
        IDS.setBounds(250, 145, 150, 20);
        this.add(IDS); 
        
        pass = new JLabel("Old Password:");
        pass.setBounds(160, 160, 300, 50);
        this.add(pass);

        passC = new JPasswordField();
        passC.setBounds(250, 175, 150, 20);
        this.add(passC);
        
        newPass = new JLabel("New Password:");
        newPass.setBounds(160, 190, 300, 50);
        this.add(newPass);

        newPassC = new JPasswordField();
        newPassC.setBounds(250, 205, 150, 20);;
        this.add(newPassC);
        
        submit = new JButton("Submit");
        submit.setBounds(240, 235, 100, 20);
        this.add(submit);
        
        back = new JButton("Back");
        back.setBounds(450,5,100,20);
        this.add(back);
    }
    
}
