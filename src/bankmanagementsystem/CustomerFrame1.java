package bankmanagementsystem;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CustomerFrame1 extends JFrame
{
    JFrame thisFrame;
    JMenuBar menuBar;
    
    JLabel Lable1;
    
    JLabel ID;
    JLabel NameC;
    JLabel Email;
    JLabel Mobile;
    JLabel Address;
    JLabel balanceC;
    
    JTextField IDS;
    JTextArea IDs;
    JTextArea NameCS;
    JTextArea EmailS;
    JTextArea MobileS;
    JTextArea AddressS;
    JTextArea balanceCS;
    
    JLabel UserID;
    JLabel Name;
    JLabel balance;
    
    JTextArea userIdT;
    JTextArea NameT;
    JTextArea balanceT;
    
    JLabel amount;
    JTextField amountC;
               
    JButton Logout;
   
    public CustomerFrame1()
    {
        
        super("Customer Frame for Saving Account");
        this.setSize(600, 400);
        setLocation(200,200);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addContentCF();
        
    }
    
    void addContentCF()
    {
        menuBar = new JMenuBar();
        
        JMenu jMenuOption = new JMenu("Option");
        JMenu jMenuHelp = new JMenu("Help");
        
        JMenuItem jmI1 = new JMenuItem("Withdraw");
        JMenuItem jmI2 = new JMenuItem("Deposit");
        JMenuItem jmI3 = new JMenuItem("Transfar");
        JMenuItem jmI4 = new JMenuItem("Interest");
        JMenuItem jmI5 = new JMenuItem("Change Password");
        JMenuItem jmI6 = new JMenuItem("showInfo");
        
        JMenuItem jmI7 = new JMenuItem("Contact");
       
        
        jMenuOption.add(jmI1);
        jMenuOption.add(jmI2);
        jMenuOption.add(jmI3);
        jMenuOption.add(jmI4);
        jMenuOption.add(jmI5);
        jMenuOption.add(jmI6);

        jMenuHelp.add(jmI7);
        
        menuBar.add(jMenuOption);
        menuBar.add(jMenuHelp);
        this.setJMenuBar(menuBar);
        
        this.setJMenuBar(menuBar);
        
        UserID = new JLabel("User ID:");
        UserID.setBounds(0,5,100,20);
        this.add(UserID);

        userIdT = new JTextArea();
        userIdT.setBounds(50,5,100,20);
        this.add(userIdT);
        
        Name = new JLabel("Name:");
        Name.setBounds(0,25,100,20);
        this.add(Name);

        NameT = new JTextArea();
        NameT.setBounds(50,25,100,20);
        this.add(NameT);
        
        balance = new JLabel("Balance:");
        balance.setBounds(0,45,100,20);
        this.add(balance);

        balanceT = new JTextArea();
        balanceT.setBounds(50,45,100,20);
        this.add(balanceT);

        Logout = new JButton("Logout");
        Logout.setBounds(450,5,100,20);
        this.add(Logout);
        
        ActionListener a1 = new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                showInfo();
                setResizable(false);   
                validate();  
            }
        };
        jmI6.addActionListener(a1);
        
        ActionListener a2 = new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            { 
                dispose();
                WithdrawAddFrame w1 = new WithdrawAddFrame();
                w1.setResizable(true); 
                w1.setVisible(true);
            }
        };
        jmI1.addActionListener(a2);
        
        ActionListener a3 = new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                dispose();
                DepositAddFrame d1 = new DepositAddFrame();
                d1.setResizable(false);
                d1.setVisible(true); 
            }
        };
        jmI2.addActionListener(a3);
      
        ActionListener a4 = new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                dispose();
                TransfarAddFrame t1 = new TransfarAddFrame();
                t1.setResizable(false);   
                t1.setVisible(true);
            }
        };
       jmI3.addActionListener(a4);
  
        ActionListener a5 = new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                dispose();
                InterestAddFrame i1 = new InterestAddFrame();
                i1.setResizable(false);   
                i1.setVisible(true);
            }
        };
        jmI4.addActionListener(a5);
        
        ActionListener a6 = new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                dispose();
                ChangePasswordFrame p1 = new ChangePasswordFrame();
                p1.setResizable(false);   
                p1.setVisible(true);
            }
        };
       jmI5.addActionListener(a6);
       
      ActionListener a7 = new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                dispose();
                LoginFrame3 f1 = new LoginFrame3();
                f1.setResizable(false);
                f1.setVisible(true);
            }
        };
       Logout.addActionListener(a7);
      
    } 
        
    
    public void showInfo()
    {
        Lable1 = new JLabel("Rawan Bank Limited.");
        Lable1.setBounds(220, 80, 300, 50);
        this.add(Lable1);
        
        NameC = new JLabel("Name:");
        NameC.setBounds(160, 130, 300, 50);
        this.add(NameC);

        userIdT = new JTextArea();
        userIdT.setBounds(240, 145, 150, 20);
        this.add(userIdT);

        Address = new JLabel("Address:");
        Address.setBounds(160, 160, 300, 50);
        this.add(Address);

        AddressS = new JTextArea();
        AddressS.setBounds(240, 175, 150, 20);
        this.add(AddressS);

        Email = new JLabel("Email:");
        Email.setBounds(160, 190, 300, 50);
        this.add(Email);

        EmailS = new JTextArea();
        EmailS.setBounds(240, 205, 150, 20);
        this.add(EmailS);

        Mobile = new JLabel("Mobile No.:");
        Mobile.setBounds(160, 220, 300, 50);
        this.add(Mobile);

        balanceCS = new JTextArea();
        balanceCS.setBounds(240, 235, 150, 20);
        this.add(balanceCS); 
        
        ID = new JLabel("ID:");
        ID.setBounds(160, 250, 300, 50);
        this.add(ID);

        IDs = new JTextArea();
        IDs.setBounds(240, 265, 150, 20);
        this.add(IDs); 
        
        balanceC = new JLabel("Balance:");
        balanceC.setBounds(160, 280, 300, 50);
        this.add(balanceC);

        balanceCS = new JTextArea();
        balanceCS.setBounds(240, 295, 150, 20);
        this.add(balanceCS); 
    }
       
}
