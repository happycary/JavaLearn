package InputTest;
import java.io.Console;
import java.util.*;
import java.lang.*;

public class inputTest {
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your name: ");
        String name = in.nextLine();

        System.out.println("How old are your?");
        int age = in.nextInt();

        Console cons = System.console();
        if(cons != null) {
            String username = cons.readLine("Your name: ");
            char[] password = cons.readPassword("Password: ");
        }
        else
        {
            System.out.println("No console found");
        }
        System.out.println("Hello " + name + ". Next year you would be " + (age + 1) );
        //System.out.println("Your password is: " + password);
    }
}
