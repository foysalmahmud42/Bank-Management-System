package bankmanagementsystem;
import java.io.*;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
public class LoanAccount 
{
    
    // constant fields
    private static final int MAX_LOAN_AMO = 100000;
    // instance variables (can be used within the class)
    public String customerName;
    private double balance;
    private double loanTaken = 0;
    private String address;
    private int mobNum;
    private String pass;
    private static int idi= 10000;
    private int userId;
    private String email;
    private String gender;
    private double interest = 1.5f;
    private String time;

    public LoanAccount() {
    }
    
    public LoanAccount(String info) 
    {
        
        String[] accInfo = info.split("\\|");
        this.userId = Integer.parseInt(accInfo[0]);
        this.customerName = accInfo[1];
        this.gender = accInfo[2];
        this.address = accInfo[3];
        this.email = accInfo[4];
        this.mobNum = Integer.parseInt(accInfo[5]);
        this.balance = Double.parseDouble(accInfo[6]);
        this.loanTaken = Double.parseDouble(accInfo[7]);
        this.pass = accInfo[8];
        this.time = accInfo[9];      
    }

    public LoanAccount(String customerName, String address, int mobNum, String pass, int userId, String email, String gender, String time) 
    {
        this.customerName = customerName;
        this.balance = 0;
        this.loanTaken = 0;
        this.address = address;
        this.mobNum = mobNum;
        this.userId = userId;
        this.email = email;
        this.gender = gender;
        this.time = time;
    }

    public boolean borrowFromBank(double amount) 
    {
        boolean bala = false;
        if (amount < balance)
        {
            balance -= amount;
            bala = true;
        }
        else if (this.loanTaken+amount < MAX_LOAN_AMO)
        {
            loanTaken += amount;
            bala = true;
        }
        if(bala)
            return true;
        else
            return false;     
    }   
    public void deposit(double amountPaid) 
    {
        if (loanTaken == 0)
        {
             balance += amountPaid;
        }
        else
        {
            if(amountPaid > loanTaken)
            {
                amountPaid -= loanTaken;
                loanTaken = 0;
                balance += amountPaid;
            }
            else
                loanTaken -= amountPaid;
        }   
    }
    public double getLoanTaken() 
    {
        return loanTaken;
    }
    public double getBalance() 
    {
       return balance;
    }
    public boolean transferBalance(LoanAccount transferTo,int amount)
    {
        if(balance >= amount)
        {
            this.balance -= amount;
            transferTo.deposit(amount);
            return true;
        }
        else if(balance < amount && balance != 0)
        {
            amount -= balance;
            balance = 0;
            loanTaken += amount;
            transferTo.deposit(amount);
            return true;
        }
        else if ((loanTaken+amount) <= MAX_LOAN_AMO)
        {
            loanTaken += amount;
            transferTo.deposit(amount);
            return true;
        }
        else 
            return false;
    }
    public boolean transferBalance(SavingAccount transferTo,int amount)
    {
        if(balance >= amount)
        {
            this.balance -= amount;
            transferTo.deposit(amount);
            return true;
        }
        else if(balance < amount && balance != 0)
        {
            amount -= balance;
            balance = 0;
            loanTaken += amount;
            transferTo.deposit(amount);
            return true;
        }
        else if ((loanTaken+amount) <= MAX_LOAN_AMO)
        {
            loanTaken += amount;
            transferTo.deposit(amount);
            return true;
        }
        else 
            return false;
    }
    public double interest(String time)
    {
        int days;
        double bal;
        SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");
        Date d1 = null;
        Date d2 = null;
        try {
            d1 = format.parse(time);
            d2 = format.parse(this.time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long diff = d1.getTime() - d2.getTime();
        long diffHours = diff / (60 * 60 * 1000);
        
        if(balance > 0 && diffHours >= 24)
        {
            days = (int)diffHours/24;
            bal = balance*days*(interest/100);
            balance = bal+balance;
        }
        return balance;
    }
    public String toText()
    {
        return userId+"|"+customerName+"|"+gender+"|"+address+"|"+email+"|"+mobNum+"|"+balance+"|"+loanTaken+"|"+pass+"|"+time;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public int getMobNum() {
        return mobNum;
    }

    public String getPass() {
        return pass;
    }
    public int getUserId() {
        return userId;
    }


    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public double getInterest() {
        return interest;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public String getTime() {
        return time;
    }
    public void passChange(String passOld, String passNew)
   {
       
       FileManager fm= new FileManager();
       ArrayList<LoanAccount> allLoan = fm.getAllLoan();
       for(int i = 0; i < allLoan.size(); i++)
       {
           if(allLoan.get(i).pass.equals(passOld))
           {
                System.out.println("rafi");
                allLoan.get(i).setPass(passNew);
                break;
           }
       }
       fm.addCusLoan(allLoan);
   }


}
