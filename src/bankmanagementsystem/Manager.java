package bankmanagementsystem;

import java.util.ArrayList;

public class Manager 
{
   private int id;
   public String name;
   private String gender;
   private String address;
   private String email;
   private int mobNum;
   private String branch;
   private String pass;

    public Manager() {
    }
   
   public Manager(String info)
   {
       String[] manInfo = info.split("\\|");
       this.id = Integer.parseInt(manInfo[0]);
       this.name = manInfo[1];
       this.gender = manInfo[2];
       this.address = manInfo[3];
       this.email = manInfo[4];
       this.mobNum = Integer.parseInt(manInfo[5]);
       this.branch = manInfo[6];
       this.pass = manInfo[7];
   }
   public void addEmployee(Employee emp)
   {
       FileManager fm= new FileManager();
       ArrayList<Employee> allEmp = fm.getAllEmplo();
       allEmp.add(emp);
       fm.addEmp(allEmp);
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

    public String getBranch() {
        return branch;
    }

    public String getPass() {
        return pass;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobNum(int mobNum) {
        this.mobNum = mobNum;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setPass(String pass) {
        this.pass = pass;
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
       ArrayList<Manager> allMan = fm.getManager();
       for(int i = 0; i < allMan.size(); i++)
       {
           if(allMan.get(i).pass.equals(passOld))
           {
                System.out.println("rafi");
                allMan.get(i).setPass(passNew);
                break;
           }
       }
       fm.addMan(allMan);
   }
    public String toText()
    {
        return id+"|"+name+"|"+gender+"|"+address+"|"+email+"|"+mobNum+"|"+branch+"|"+pass;
    }
}
