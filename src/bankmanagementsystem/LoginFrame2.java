package bankmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame2 extends JFrame
{
    JLabel Lable1;
    JLabel Lable3;
    JLabel Lable4;

    JLabel userID;
    JTextField userIdT;
    JLabel pass;
    JPasswordField passT;
    JLabel loginAs;
    JComboBox loginAsC;
    JLabel Lable2;
    
    JButton ChngPassword;
    JButton submit;
    JButton back;
    
    JFrame thisFrame = this;
    String type;
    String user;

    public String[] typeAll = {"Manager", "Employee"};

    public LoginFrame2() 
    {
        super("Login for Officers");
        this.setSize(630, 400);
        this.setLayout(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLocation(300, 200);   // almost Middle
        addContent();
        action();
    }

    public void addContent() 
    {
        Lable1 = new JLabel("Rawan Bank Limited");
        Lable1.setBounds(180, 30, 300, 50);
        this.add(Lable1);
        
        Lable3 = new JLabel("Join Rawan Bank Limited now !!");
        Lable3.setBounds(200, 50, 300, 50);
        this.add(Lable3); 
        
        Lable4 = new JLabel("we insure your safety and protect your privacy.");
        Lable4.setBounds(220, 70, 300, 50);
        this.add(Lable4);    

        userID = new JLabel("User ID: ");
        userID.setBounds(150, 130, 300, 50);
        this.add(userID);

        userIdT = new JTextField();
        userIdT.setBounds(250, 145, 150, 20);
        this.add(userIdT);

        pass = new JLabel("Password: ");
        pass.setBounds(150, 160, 300, 50);
        this.add(pass);

        passT = new JPasswordField();
        passT.setBounds(250, 175, 150, 20);
        this.add(passT);

        loginAs = new JLabel("Login As: ");
        loginAs.setBounds(150, 190, 300, 50);
        this.add(loginAs);

        submit = new JButton("Submit");
        submit.setBounds(420, 205, 100, 20);
        this.add(submit);

        loginAsC = new JComboBox(typeAll);
        loginAsC.setBounds(250, 205, 150, 20);
        this.add(loginAsC);

        Lable2 = new JLabel("Forget PassWord?");
        Lable2.setBounds(180, 260, 300, 50);
        this.add(Lable2);

        ChngPassword = new JButton("Click it Now!");
        ChngPassword.setBounds(330, 275, 150, 20);
        this.add(ChngPassword);
        
        back = new JButton("Back");
        back.setBounds(310, 235, 90, 20);
        this.add(back);
    }
    public void action()
    {
        ActionListener a1 = new ActionListener()
        {
              public void actionPerformed(ActionEvent e)
              {
                dispose();
                LoginFrame1 f1 = new LoginFrame1();
                f1.setResizable(false);
                f1.setVisible(true);
              }
        };
        back.addActionListener(a1);
        
        ActionListener a2 = new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                loginVerify();
            }
        };
        submit.addActionListener(a2);
    } 
    
    public void loginVerify() 
    {
        type = (String) loginAsC.getSelectedItem();
        System.out.println(type);
        user = userIdT.getText();
        String pass = new String(passT.getPassword());
        
        FileManager fm = new FileManager();
        ArrayList<Manager> mn = fm.getManager();
        ArrayList<Employee> em = fm.getAllEmplo();
        if(type.equals("Manager"))
        {
            for(Manager m: mn)
            {
                if(m.getId() == Integer.parseInt(user) && m.getPass().equals(pass))
                {                
                    thisFrame.dispose();
                    JOptionPane.showMessageDialog(null, "Log In Successful!");
                    ManagerFrame mf = new ManagerFrame();
                    mf.setVisible(true);
                    break;
                }
                else 
                {
                    JOptionPane.showMessageDialog(null, "Please Enter a Valid User ID & Password");
                    break;
                }
            }
        }
        else if(type.equals("Employee"))
        {
            for(Employee e: em)
            {
                if(e.getId() == Integer.parseInt(user) && e.getPass().equals(pass))
                {
                    thisFrame.dispose();
                    JOptionPane.showMessageDialog(null, "Log In Successful!");
                    EmployeeFrame ff = new EmployeeFrame();
                    ff.setVisible(true);
                    break;
                }
                else 
                {
                    JOptionPane.showMessageDialog(null, "Please Enter a Valid User ID & Password");
                    break;
                }
            }
        }
    }

}
