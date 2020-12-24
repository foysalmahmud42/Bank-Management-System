package bankmanagementsystem;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee 
{
   private int id;
   public String name;
   private String gender;
   private String address;
   private String email;
   private int mobNum;
   private String pass;

    public Employee() 
    {
    }

    public Employee(int id, String name, String gender, String address, int mobNum, String pass) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.mobNum = mobNum;
        this.pass = pass;
    }
   
   public Employee(String info)
   {
       String[] empInfo = info.split("\\|");
       this.id = Integer.parseInt(empInfo[0]);
       this.name = empInfo[1];
       this.gender = empInfo[2];
       this.address = empInfo[3];
       this.email = empInfo[4];
       this.mobNum = Integer.parseInt(empInfo[5]);
       this.pass = empInfo[6];
   }
   public void addCustomer(LoanAccount lAcc)
   {
       FileManager fm= new FileManager();
       ArrayList<LoanAccount> allLoan = fm.getAllLoan();
       allLoan.add(lAcc);
       fm.addCusLoan(allLoan); 
   }
   public void removeLoanCustomer(int id)
   {
       FileManager fm= new FileManager();
       ArrayList<LoanAccount> allLoan = fm.getAllLoan();
       for(int i = 0; i < allLoan.size(); i++)
       {
           if(allLoan.get(i).getUserId() == id)
           {
               allLoan.remove(i);
           }
       }
       fm.addCusLoan(allLoan);   
   }
   public void addCustomer(SavingAccount sAcc)
   {
       FileManager fm= new FileManager();
       ArrayList<SavingAccount> allSave = fm.getAllSave();
       allSave.add(sAcc);
       fm.addCusSave(allSave);
   }
   public void removeSaveCustomer(int id)
   {
       FileManager fm= new FileManager();
       ArrayList<SavingAccount> allSave = fm.getAllSave();
       for(int i = 0; i < allSave.size(); i++)
       {
           if(allSave.get(i).getUserId() == id)
           {
               allSave.remove(i);
           }
       }
       fm.addCusSave(allSave);
   }
   public void passChange(String passOld, String passNew)
   {
       
       FileManager fm= new FileManager();
       ArrayList<Employee> allEmp = fm.getAllEmplo();
       ArrayList<Employee> allEp = fm.getAllEmplo();
       for(int i = 0; i < allEmp.size(); i++)
       {
           if(allEmp.get(i).pass.equals(passOld))
           {
                
                allEmp.get(i).setPass(passNew);
                allEp = allEmp;
                break;
           }
       }
       fm.addEmp(allEp);
   }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public int getMobNum() {
        return mobNum;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    public String toText()
    {
        return id+"|"+name+"|"+gender+"|"+address+"|"+email+"|"+mobNum+"|"+pass;
    }
    
}
