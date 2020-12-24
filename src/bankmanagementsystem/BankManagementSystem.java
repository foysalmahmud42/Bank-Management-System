
package bankmanagementsystem;
import java.io.*;
import java.util.concurrent.TimeUnit;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class BankManagementSystem {
   //public long startTime = System.nanoTime();
    //public long endTime   = System.nanoTime();
    //public long totalTime = endTime - startTime;
    public static final String DATE_FORMAT_NOW = "yyyy-MM-dd";
    public static String now() {
    Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
    return sdf.format(cal.getTime());
    }
    public static void main(String[] args) 
    {
         CustomerFormFrame c1 = new CustomerFormFrame();
         
         c1.setVisible(true);
    }
    
}
    

