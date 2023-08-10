

public class Main {
   public static void main(String[] args){
       //if statement==> performs a block of code if its condition evaluates to be tru
       int age=71;
       if( age !=70){
           System.out.println("you are a wisdom person 'most probably'");
       } else if(age>=18){
           System.out.println("you are an adult");
       }else if(age>=13){
           System.out.println("you are a teenager");
       }
       else{
           System.out.println("you still need time..enjoy the journey");
       }
       //comparison operators : >, >=, <, <=, ==, !=

       // we can also compare characters and strings:

//Chars can be compared using relational operators (==, <, >), which compare characters based on the order of their ASCII code.
       char a='x';
       if(a>'c'){
           System.out.println("a is "+a);
       }

       //comparing strings

// Strings can be compared using the equals() method, which compares two strings character by character, ignoring their address. It considers them equal if they are of the same length and the characters are in the same order
       String string1 = "using equals method";
       String string2 = "using equals method";
       if (string1.equals(string2)) {
           System.out.println("The strings are equal.");
       } else {
           System.out.println("The strings are not equal.");
       }
   }
}

