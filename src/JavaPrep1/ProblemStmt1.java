package JavaPrep1;

import java.util.Set;
import java.util.TreeSet;

public class ProblemStmt1 {
    public static void main(String[] args) {

        String str="FirstName=Dipayan,LastName=Sanyan,Age=25,Gender=F,Designation=QA,Technology=Java";
        //Output--> "Age=,Designation=,Gender=,Name,Technology"  -- arrange in ascending order

        String[] strN= str.split(",");
        Set<String> keys= new TreeSet<String>();
        for(String str1:strN){
            String key=str1.split("=")[0].trim();
            if(key.equals("FirstName")||key.equals("LastName")){
                key="Name";
            }
                keys.add(key);
        }
        for(String key:keys){
            System.out.println(key+"=");
        }
    }
}
