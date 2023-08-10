import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //while loop execute a block of code as along as its condition remains true

        Scanner nameScanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            System.out.println("enter your name");
            name = nameScanner.nextLine();
        }
        System.out.println("hello " + name);

//the difference with the do while syntax is that the block of code is at least executed once
            do{
                System.out.println("enter your name");
                name = nameScanner.nextLine();
            }while (name.isBlank());
        System.out.println("hello again " + name);
    }
}

