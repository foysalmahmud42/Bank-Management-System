package bankmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CustomerFormFrame extends JFrame
{
    JLabel Lable1;
    JLabel Lable2;
    JLabel Lable3;
    JLabel Lable4;
    
    JLabel UserID;
    JLabel Pass;
    JLabel Name;
    JLabel Gender;
    JLabel Email;
    JLabel Mobile;
    JLabel Address;
    JLabel DateofBirth;
    JLabel Date;
    JLabel Account;
   
    JTextField userIdT;
    JPasswordField passT;
    JTextField NameT;
    JComboBox GenderT;
    JComboBox DateT;
    JComboBox AccountT;
    JTextField EmailT;
    JTextField MobileT;
    JTextField AddressT;
    JTextField DateofBirthT;
   
    JButton submit;
    JButton Back;
    
    int id;
    String nam;
    String gend;
    String Ema;
    String add;
    int mob;
    String pas;
    String dat;
    
    
    
    String[] genderType = {"Male", "Female"};
    String[] dateType = {"2018-04-01", "2018-04-02","2018-04-03", "2018-04-04","2018-04-05", "2018-04-06","2018-04-07", "2018-04-08","2018-04-09", "2018-04-10","2018-04-11", "2018-04-12","2018-04-13", "2018-04-14","2018-04-15", "2018-04-16","2018-04-17", "2018-04-18","2018-04-19", "2018-04-20","2018-04-21", "2018-04-22","2018-04-23", "2018-04-24","2018-04-25", "2018-04-26","2018-04-27", "2018-04-28","2018-04-29", "2018-04-30"};
    String[] accountType = {"Saving Account", "Loan Account"};
    
    public CustomerFormFrame() 
    {
        super("Customer Sign Up Form");
        this.setSize(750, 500);
        this.setLayout(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLocation(300, 150);
           addContent();
           
        ActionListener a1 = new ActionListener()
        {
            
            public void actionPerformed(ActionEvent e)
            { 
                DateFormat df = new SimpleDateFormat("yy-MM-dd"); 
                Calendar calobj = Calendar.getInstance();
                if(genderType.equals("Male"))
                {
                    gend = "Male";
                }
                else
                {
                    gend = "Female";
                }
                id =  Integer.parseInt(userIdT.getText());
                nam =  NameT.getText();
                add =  AddressT.getText();
                Ema =  EmailT.getText();
                mob =  Integer.parseInt(MobileT.getText());
                pas =  passT.getText();
                dat =  df.format(calobj.getTime());
                if(accountType.equals("Loan Account"))
                {
                    LoanAccount la = new LoanAccount(nam,add,mob,pas,id,Ema,gend, dat);
                    Employee em = new Employee();
                    em.addCustomer(la);
                }
                else
                {
                    SavingAccount sa = new SavingAccount(nam,add,mob,pas,id,Ema,gend, dat);
                    Employee em = new Employee();
                    em.addCustomer(sa);
                }
                    
            }
        };
        submit.addActionListener(a1);
    }

    public void addContent() 
    {
        Lable1 = new JLabel("Banking Management System ");
        Lable1.setBounds(250, 30, 300, 50);
        this.add(Lable1);

        Lable2 = new JLabel("Rawan Bank Limited");
        Lable2.setBounds(370, 50, 300, 50);
        this.add(Lable2);

        
        Lable4 = new JLabel("we protect your Money");
        Lable4.setBounds(250, 70, 300, 50);
        this.add(Lable4);
        
        Lable3 = new JLabel("Customers Sign Up Form");
        Lable3.setBounds(130, 90, 300, 50);
        this.add(Lable3);

        UserID = new JLabel("User ID:");
        UserID.setBounds(110, 130, 300, 50);
        this.add(UserID);

        userIdT = new JTextField();
        userIdT.setBounds(190, 145, 150, 20);
        this.add(userIdT);

        Pass = new JLabel("Password:");
        Pass.setBounds(110, 160, 300, 50);
        this.add(Pass);

        passT = new JPasswordField();
        passT.setBounds(190, 175, 150, 20);
        this.add(passT);

        Name = new JLabel("Name: ");
        Name.setBounds(110, 190, 300, 50);
        this.add(Name);

        NameT = new JTextField();
        NameT.setBounds(190, 205, 150, 20);
        this.add(NameT);

        Gender = new JLabel("Gender: ");
        Gender.setBounds(110, 220, 300, 50);
        this.add(Gender);

        GenderT = new JComboBox(genderType);
        GenderT.setBounds(190, 235, 150, 20);
        this.add(GenderT);

        Email = new JLabel("Email: ");
        Email.setBounds(380, 190, 300, 50);
        this.add(Email);

        EmailT = new JTextField();
        EmailT.setBounds(480, 205, 150, 20);
        this.add(EmailT);

        Mobile = new JLabel("Mobile: ");
        Mobile.setBounds(380, 160, 300, 50);
        this.add(Mobile);

        MobileT = new JTextField();
        MobileT.setBounds(480, 175, 150, 20);
        this.add(MobileT);

        Address = new JLabel("Address: ");
        Address.setBounds(380, 220, 300, 50);
        this.add(Address);

        AddressT = new JTextField();
        AddressT.setBounds(480, 235, 150, 20);
        this.add(AddressT);

        DateofBirth = new JLabel("Date Of Birth: ");
        DateofBirth.setBounds(380, 130, 300, 50);
        this.add(DateofBirth);

        DateofBirthT = new JTextField();
        DateofBirthT.setBounds(480, 145, 150, 20);
        this.add(DateofBirthT);
        
        Date = new JLabel("Date: ");
        Date.setBounds(110, 250, 300, 50);
        this.add(Date);

        DateT = new JComboBox(dateType);
        DateT.setBounds(190, 265, 150, 20);
        this.add(DateT);
        
        Account = new JLabel("Date: ");
        Account.setBounds(380, 250, 300, 50);
        this.add(Account);

        AccountT = new JComboBox(accountType);
        AccountT.setBounds(480, 265, 150, 20);
        this.add(AccountT);

        submit = new JButton("Submit");
        submit.setBounds(370, 380, 120, 20);
        this.add(submit);

        Back = new JButton("Back");
        Back.setBounds(230, 380, 120, 20);
        this.add(Back);

    }

}
