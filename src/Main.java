

public class Main {
   public static void main(String[] args){

//overloaded methods ==> methods that have the same name but have different parameters
      // method signature ==> method name + its parameters

      //calling overloaded method 1
      System.out.println(add(1,2));
      //calling overloaded method 2
      System.out.println(add(1,2,3));
      //calling overloaded method 3
      System.out.println(add(1,2,3,4));


      //calling the methods that accept and return double type this time
      System.out.println(add(1.0,2.0));
      System.out.println(add(1.0,2.0,3.0));
      System.out.println(add(1.0,2.0,3.0,4.0));


   }
   static int add (int x, int y){
      System.out.println("this is overloaded meth. #1");
      return x+y;

   }
   static int add (int x,int y, int z){
      System.out.println("this is overloaded meth. #2");
      return x+y+z;
   }

   static int add (int x,int y, int z, int w){
      System.out.println("this is overloaded meth #3");
      return x+y+z+w;
   }

   //data types of the parameters take in account
   static double add (double x, double y){
      System.out.println("this is overloaded meth. #4");
      return x+y;

   }
   static double add (double x,double y, double z){
      System.out.println("this is overloaded meth. #5");
      return x+y+z;
   }

   static double add (double x,double y, double z, double w){
      System.out.println("this is overloaded meth #6");
      return x+y+z+w;
   }
}

