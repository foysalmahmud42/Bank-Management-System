package bankmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class EmployeeFrame extends JFrame
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
    JTextField NameCS;
    JTextField EmailS;
    JTextField MobileS;
    JTextField AddressS;
    JTextField balanceCS;
    
    JLabel UserID;
    JLabel Name;
    JLabel balance;
    JTextField userIdT;
    JTextField NameT;
    JTextField balanceT;
    
    JLabel pass;
    JLabel newPass;   
    JTextField passC;
    JTextField newPassC;
    
    JButton Logout;
    JButton submit;
    
    public EmployeeFrame()
    {
        super("Employee");
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
        JMenu jMenucustomer = new JMenu("Customer");
               
        JMenuItem jmI1 = new JMenuItem("Change Password");
        JMenuItem jmI2 = new JMenuItem("Show Info");
        
        JMenuItem jmC1 = new JMenuItem("Add");
        JMenuItem jmC2 = new JMenuItem("Remove");
                
        jMenuOption.add(jmI1);
        jMenuOption.add(jmI2);
        jMenucustomer.add(jmC1);
        jMenucustomer.add(jmC2);
        
        menuBar.add(jMenuOption);
        menuBar.add(jMenucustomer);
        menuBar.add(jMenuHelp);
        this.setJMenuBar(menuBar);
        
        UserID = new JLabel("User ID:");
        UserID.setBounds(0,5,100,20);
        this.add(UserID);

        userIdT = new JTextField();
        userIdT.setBounds(45,5,100,20);
        this.add(userIdT);
        
        Name = new JLabel("Name:");
        Name.setBounds(0,25,100,20);
        this.add(Name);

        NameT = new JTextField();
        NameT.setBounds(45,25,100,20);
        this.add(NameT);
        
        balance = new JLabel("Balance:");
        balance.setBounds(0,45,100,20);
        this.add(balance);

        balanceT = new JTextField();
        balanceT.setBounds(45,45,100,20);
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
                setVisible(true);
            }
        };
        jmI2.addActionListener(a1);
        
        ActionListener a2 = new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                dispose();
                ChangePasswordFrame4 c1 = new ChangePasswordFrame4();
                c1.setResizable(false); 
                c1.setVisible(true);
            }
        };
       jmI1.addActionListener(a2);
       
       ActionListener a3 = new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                dispose();
                CustomerFormFrame f1 = new CustomerFormFrame();
                f1.setResizable(false); 
                f1.setVisible(true);
            }
        };
       jmC1.addActionListener(a3);
       
       ActionListener a4 = new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                dispose();
                CustomerRemoveFrame r1 = new CustomerRemoveFrame();
                r1.setResizable(false); 
                r1.setVisible(true);
            }
        };
       jmC2.addActionListener(a4);
     /* ActionListener a3 = new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                setResizable(false); 
                setVisible(true);
            }
        };
        jmC1.addActionListener(a3);
        
        ActionListener a4 = new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                setResizable(false); 
                setVisible(true);
            }
        };
       jmC2.addActionListener(a4);*/
       
        ActionListener a5 = new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                dispose();
                LoginFrame2 f1 = new LoginFrame2();
                f1.setResizable(false);
                f1.setVisible(true);
            }
        };
        Logout.addActionListener(a5);
    }
    public void showInfo()
    {
        Lable1 = new JLabel("Rawan Bank Limited.");
        Lable1.setBounds(220, 80, 300, 50);
        this.add(Lable1);
        
        NameC = new JLabel("Name:");
        NameC.setBounds(160, 130, 300, 50);
        this.add(NameC);

        userIdT = new JTextField();
        userIdT.setBounds(240, 145, 150, 20);
        this.add(userIdT);

        Address = new JLabel("Address:");
        Address.setBounds(160, 160, 300, 50);
        this.add(Address);

        AddressS = new JTextField();
        AddressS.setBounds(240, 175, 150, 20);
        this.add(AddressS);

        Email = new JLabel("Email:");
        Email.setBounds(160,  190, 300, 50);
        this.add(Email);

        EmailS = new JTextField();
        EmailS.setBounds(240, 205, 150, 20);
        this.add(EmailS);

        Mobile = new JLabel("Mobile No.:");
        Mobile.setBounds(160, 220, 300, 50);
        this.add(Mobile);

        balanceCS = new JTextField();
        balanceCS.setBounds(240, 235, 150, 20);
        this.add(balanceCS); 
        
        ID = new JLabel("ID:");
        ID.setBounds(160, 250, 300, 50);
        this.add(ID);

        IDS = new JTextField();
        IDS.setBounds(240, 265, 150, 20);
        this.add(IDS); 
        
        balanceC = new JLabel("Balance:");
        balanceC.setBounds(160, 280, 300, 50);
        this.add(balanceC);

        balanceCS = new JTextField();
        balanceCS.setBounds(240, 295, 150, 20);
        this.add(balanceCS); 
    }
     public void changePassword()
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

        passC = new JTextField();
        passC.setBounds(250, 175, 150, 20);
        this.add(passC);
        
        newPass = new JLabel("New Password:");
        newPass.setBounds(160, 190, 300, 50);
        this.add(newPass);

        newPassC = new JTextField();
        newPassC.setBounds(250, 205, 150, 20);;
        this.add(newPassC);
        
        submit = new JButton("Submit");
        submit.setBounds(240, 235, 100, 20);
        this.add(submit);
    }

}
