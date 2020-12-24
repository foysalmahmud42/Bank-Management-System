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

public class EmployeeFormFrame extends JFrame
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
    JTextField EmailT;
    JTextField MobileT;
    JTextField AddressT;
   
    JButton submit;
    JButton Back;
    int id;
    String nam;
    String gend;
    String add;
    int mob;
    String pas;
    
    
    
    String[] genderType = {"Male", "Female"};
    
    public EmployeeFormFrame() 
    {
        super("Employee Sign Up Form");
        this.setSize(750, 500);
        this.setLayout(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLocation(300, 150);
           addContent();
           
        ActionListener a1 = new ActionListener()
        {
            
            public void actionPerformed(ActionEvent e)
            { 
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
                mob =  Integer.parseInt(MobileT.getText());
                pas =  passT.getText();

                Employee em = new Employee(id,nam,gend,add,mob,pas);
                Manager m = new Manager();
                m.addEmployee(em);       
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
        Email.setBounds(380, 160, 300, 50);
        this.add(Email);

        EmailT = new JTextField();
        EmailT.setBounds(480, 175, 150, 20);
        this.add(EmailT);

        Mobile = new JLabel("Mobile: ");
        Mobile.setBounds(380, 130, 300, 50);
        this.add(Mobile);

        MobileT = new JTextField();
        MobileT.setBounds(480, 145, 150, 20);
        this.add(MobileT);

        Address = new JLabel("Address: ");
        Address.setBounds(380, 190, 300, 50);
        this.add(Address);

        AddressT = new JTextField();
        AddressT.setBounds(480, 205, 150, 20);
        this.add(AddressT);

   

        submit = new JButton("Submit");
        submit.setBounds(370, 380, 120, 20);
        this.add(submit);

        Back = new JButton("Back");
        Back.setBounds(230, 380, 120, 20);
        this.add(Back);

    }
}
