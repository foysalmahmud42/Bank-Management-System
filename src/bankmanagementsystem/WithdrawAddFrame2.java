package bankmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class WithdrawAddFrame2 extends JFrame
{
    JLabel Lable1;
    JLabel amount;
    JTextField amountC;
    JLabel pass;
    JTextField passC;
    
    JButton withdraw;
    JButton back;
    
    public WithdrawAddFrame2()
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
        withdraw.addActionListener(a2);
    }
    public void addContent()
    {
        
        Lable1 = new JLabel("Rawan Bank Limited.");
        Lable1.setBounds(220, 80, 300, 50);
        this.add(Lable1);
        
        amount = new JLabel("Amount:");
        amount.setBounds(160, 130, 300, 50);
        this.add(amount);

        amountC = new JTextField();
        amountC.setBounds(240, 145, 150, 20);
        this.add(amountC);

        pass = new JLabel("Password:");
        pass.setBounds(160, 160, 300, 50);
        this.add(pass);

        passC = new JTextField();
        passC.setBounds(240, 175, 150, 20);
        this.add(passC);
        
        withdraw = new JButton("Withdraw");
        withdraw.setBounds(230, 205, 100, 20);
        this.add(withdraw);
        
        back = new JButton("Back");
        back.setBounds(450,5,100,20);
        this.add(back);
    }
}

