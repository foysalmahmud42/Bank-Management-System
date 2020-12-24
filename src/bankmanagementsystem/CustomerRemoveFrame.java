package bankmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CustomerRemoveFrame extends JFrame
{
    
    JLabel Lable1;
    JLabel pass;
    JTextField passC;
    JLabel date;
    JTextField dateC;
    JLabel newPass;
    JTextField newPassC;
    JLabel ID;
    JTextField IDS;
    
    JLabel Type;
    JComboBox TypeS;
    int id;
    String pas;
    
    
    JButton submit;
    JButton back;
    
    public String[] typeAll = {"Loan Account","Saving Account"};
     
    public CustomerRemoveFrame()
    {
        super("Remove Frame");
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
                EmployeeFrame e1 = new EmployeeFrame();
                e1.setResizable(false);
                e1.setVisible(true);
              }
        };
        back.addActionListener(a1);
        
      ActionListener a2 = new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                id = Integer.parseInt(IDS.getText());
                if(typeAll.equals("Loan Account"))
                {
                    Employee em = new Employee();
                    em.removeLoanCustomer(id);
                }
                else
                {
                    Employee em = new Employee();
                    em.removeSaveCustomer(id);
                }
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
        
        pass = new JLabel("Password:");
        pass.setBounds(160, 160, 300, 50);
        this.add(pass);

        passC = new JTextField();
        passC.setBounds(250, 175, 150, 20);
        this.add(passC);
        
        Type = new JLabel("Type: ");
        Type.setBounds(150, 190, 300, 50);
        this.add(Type);

        TypeS = new JComboBox(typeAll);
        TypeS.setBounds(250, 205, 150, 20);
        this.add(TypeS);
            
        submit = new JButton("Submit");
        submit.setBounds(240, 235, 100, 20);
        this.add(submit);
        
        back = new JButton("Back");
        back.setBounds(450,5,100,20);
        this.add(back);
    }
}
