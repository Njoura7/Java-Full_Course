import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
   public static void main(String[] args){

    //for-each ==> traversing technique to iterate through the elements in an array/collection
       // less steps, more readable
       //less flexible


       String[] animals ={"cat","dog","horse"};
       for(String i : animals){
           System.out.println(i);
       }
       System.out.println("********");
       ArrayList<String> jobs=new ArrayList<>();

       jobs.add("web developer");
       jobs.add("freelancer");
       jobs.add("customer service");
       for(String i : jobs){
           System.out.println(i);
       }
   }
}

