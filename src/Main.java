

public class Main {
   public static void main(String[] args){

      // method==> a block of code that is executed whenever it is called upon
       String nameArgument1 = "Njoura";
       int ageArgument =24;
       //nameArgument1 is called argument variable
       hello(nameArgument1,ageArgument);

       String nameArgument2 = "web dev";
       hello(nameArgument2,ageArgument);
   }

   //nameParameter is called parameter variable
    static void hello (String nameParameter ,int ageParameter){
       System.out.println("Hello "+nameParameter+" You are "+ageParameter);

       //calling the add(x,y) method inside the hello method

        //we can use the same name that we use inj the parameters of the function because those are local/scope variable
        int x=3;
        int y=4;

        System.out.println(add(x,y));

//        or this approach of storing the result of the method in another variable
//        int z=add(x,y);
//        System.out.println(z);
   }

   //other example of method using return //we will return an integer that's why we declare it in the function
    static int add(int x, int y){
        return x+y;
    }

}

