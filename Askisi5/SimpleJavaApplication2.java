package simplejavaapplication2;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;


public class SimpleJavaApplication2 {

    
    public static void main(String[] args) throws FileNotFoundException, ParseException, Exception {
       Person prs = new Person();
       Scanner stdin = new Scanner(System.in);
       
       System.out.println("What is your last_name?");
       prs.setLast_name(stdin.nextLine());
       System.out.println("What is your first_name?");
       prs.setFirst_name(stdin.nextLine());
       System.out.println("What is your father_name?");
       prs.setFather_name(stdin.nextLine());
       System.out.println("Give your date of birth on format DD/MM/YYYY");
       prs.setDateofbirth(stdin.nextLine());
       
       stdin.close();
       System.out.println("printing........");
       
       for(int i=1;i<=3;i++){
           if(i==1){
               String k=""+ prs.getLast_name() +", "+prs.getFirst_name()+", "+prs.getFather_name()+"";
               prs.writeString(i, k);
           }else if(i==2){
               String k=prs.getDateofbirth();
               prs.writeString(i, k);
           }else{
               SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY"); 
               Calendar dob = Calendar.getInstance(); 
               dob.setTime(sdf.parse(prs.getDateofbirth())); 
               String k = ""+getAge(dob)+"";
               prs.writeString(i, k); 
           }
       }
       System.out.println("file is ready");
       
            
    }
    
    public static int getAge(Calendar dob) throws Exception {
        Calendar today = Calendar.getInstance();

        int curYear = today.get(Calendar.YEAR);
        int dobYear = dob.get(Calendar.YEAR);

        int age = curYear - dobYear;
        int curMonth = today.get(Calendar.MONTH);
        int dobMonth = dob.get(Calendar.MONTH);
        if (dobMonth > curMonth) { 
            age--;
        } else if (dobMonth == curMonth) { 
            int curDay = today.get(Calendar.DAY_OF_MONTH);
            int dobDay = dob.get(Calendar.DAY_OF_MONTH);
            if (dobDay > curDay) { 
                age--;
            }
        }
        return age;
    }
    
}