package bankmanagementsystem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class FileManager 
{
    public ArrayList<LoanAccount> getAllLoan()
    {
        FileInputStream fis;
        ArrayList<LoanAccount> allLoan = new ArrayList<LoanAccount>();
        try
        {
            fis = new FileInputStream("src/Files/CousomerLoanFile.txt");
            int r = fis.read();
            String cusInfo = "";
            while(r != -1)
            {
                if (r=='\n')
                {
                    if(cusInfo.trim().length()>0)
                    {
                        LoanAccount lAcc = new LoanAccount(cusInfo);
                        allLoan.add(lAcc);
                    }
                    cusInfo = "";
                }
                else if(r=='\r' || r == '\t'){}
                else
                {
                    cusInfo +=(char)r;
                }
                r = fis.read();
            }
            fis.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return allLoan;
    }
    public ArrayList<SavingAccount> getAllSave()
    {
        FileInputStream fis;
        ArrayList<SavingAccount> allSave = new ArrayList<SavingAccount>();
        try
        {
            fis = new FileInputStream("src/Files/CustomerSavingFile.txt");
            int r = fis.read();
            String cusInfo = "";
            while(r != -1)
            {
                if (r=='\n')
                {
                    if(cusInfo.trim().length()>0)
                    {
                        SavingAccount sAcc = new SavingAccount(cusInfo);
                        allSave.add(sAcc);
                    }
                    cusInfo = "";
                }
                else if(r=='\r' || r == '\t'){}
                else
                {
                    cusInfo +=(char)r;
                }
                r = fis.read();
            }
            fis.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return allSave;
    }
    public ArrayList<Employee> getAllEmplo()
    {
        FileInputStream fis;
        ArrayList<Employee> allEmp = new ArrayList<Employee>();
        try
        {
            fis = new FileInputStream("src/Files/Employee.txt");
            int r = fis.read();
            String empInfo = "";
            while(r != -1)
            {
                if (r=='\n')
                {
                    if(empInfo.trim().length()>0)
                    {
                        Employee emp = new Employee(empInfo);
                        allEmp.add(emp);
                    }
                    empInfo = "";
                }
                else if(r=='\r' || r == '\t'){}
                else
                {
                    empInfo +=(char)r;
                }
                r = fis.read();
            }
            fis.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return allEmp;
    }
    public ArrayList<Manager> getManager()
    {
        FileInputStream fis;
        ArrayList<Manager> allMan = new ArrayList<Manager>();
        try
        {
            fis = new FileInputStream("src/Files/Manager.txt");
            int r = fis.read();
            String manInfo = "";
            while(r != -1)
            {
                if (r=='\n')
                {
                    if(manInfo.trim().length()>0)
                    {
                        Manager man = new Manager(manInfo);
                        allMan.add(man);
                    }
                    manInfo = "";
                }
                else if(r=='\r' || r == '\t'){}
                else
                {
                    manInfo +=(char)r;
                }
                r = fis.read();
            }
            fis.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return allMan;
    }
    public void addCusLoan(ArrayList<LoanAccount> allLoan){
        try {
            FileOutputStream fos= new FileOutputStream("src/Files/CousomerLoanFile.txt");
            for(int i=0; i<allLoan.size();i++){
                LoanAccount lAcc= allLoan.get(i);
                String loanstr = lAcc.toText();
                for(int j=0;j<loanstr.length();j++){
                    fos.write(loanstr.charAt(j));
                }
                fos.write('\n');
            }
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void addCusSave(ArrayList<SavingAccount> allSave){
        try {
            FileOutputStream fos= new FileOutputStream("src/Files/CustomerSavingFile.txt");
            for(int i=0; i<allSave.size();i++){
                SavingAccount sAcc= allSave.get(i);
                String savestr = sAcc.toText();
                for(int j=0;j<savestr.length();j++){
                    fos.write(savestr.charAt(j));
                }
                fos.write('\n');
            }
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void addEmp(ArrayList<Employee> allEmp){
        try {
            FileOutputStream fos= new FileOutputStream("src/Files/Employee.txt");
            for(int i=0; i<allEmp.size();i++){
                Employee emp= allEmp.get(i);
                String empstr = emp.toText();
                for(int j=0;j<empstr.length();j++){
                    fos.write(empstr.charAt(j));
                }
                fos.write('\n');
            }
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void addMan(ArrayList<Manager> allMan)
    {
        try {
            FileOutputStream fos= new FileOutputStream("src/Files/Manager.txt");
            for(int i=0; i<allMan.size();i++){
                Manager man= allMan.get(i);
                String manstr = man.toText();
                for(int j=0;j<manstr.length();j++){
                    fos.write(manstr.charAt(j));
                }
                fos.write('\n');
            }
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
