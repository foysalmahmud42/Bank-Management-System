package bankmanagementsystem;
import java.io.*;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class SavingAccount 
{
    // constant fields
    // instance variables (can be used within the class)
    public String customerName;
    private double balance;
    private String address;
    private int mobNum;
    private String pass;
    private static int idi= 11000;
    private int userId;
    private String email;
    private String gender;
    private double interest = 4.5f;
    private String time;

    public SavingAccount() {
    }
    
    public SavingAccount(String info) 
    {
        
        String[] accInfo = info.split("\\|");
        this.userId = Integer.parseInt(accInfo[0]);
        this.customerName = accInfo[1];
        this.gender = accInfo[2];
        this.address = accInfo[3];
        this.email = accInfo[4];
        this.mobNum = Integer.parseInt(accInfo[5]);
        this.balance = Double.parseDouble(accInfo[6]);
        this.pass = accInfo[7];
        this.time = accInfo[8];
    }
    public SavingAccount(String customerName, String address, int mobNum, String pass, int userId, String email, String gender,String time) 
    {
        this.customerName = customerName;
        this.balance = 15000;
        this.address = address;
        this.mobNum = mobNum;
        this.pass = pass;
        this.userId = userId;
        this.email = email;
        this.gender = gender;
        this.time = time;
    }

    public double withdraw(double amount) 
    {
        if (amount <= balance)
        {
            balance -= amount;
        }
        return balance;    
    }   
    public void deposit(double amount) 
    {
        balance += amount;  
    }
    public double getBalance() 
    {
       return balance;
    }
    public boolean transferBalance(SavingAccount transferTo,int amount)
    {
        
        if(balance >= amount)
        {
            this.balance -= amount;
            transferTo.deposit(amount);
            return true;
        }
        else
            return false;
    }
    public boolean transferBalance(LoanAccount transferTo,int amount)
    {
        
        if(balance >= amount)
        {
            this.balance -= amount;
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
        return userId+"|"+customerName+"|"+gender+"|"+address+"|"+email+"|"+mobNum+"|"+balance+"|"+pass+"|"+time;
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

    public static int getIdi() {
        return idi;
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

    public String getTime() {
        return time;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    public void passChange(String passOld, String passNew)
   {
       
       FileManager fm= new FileManager();
       ArrayList<SavingAccount> allSave = fm.getAllSave();
       for(int i = 0; i < allSave.size(); i++)
       {
           if(allSave.get(i).pass.equals(passOld))
           {
                allSave.get(i).setPass(passNew);
                break;
           }
       }
       fm.addCusSave(allSave);
   }
}
