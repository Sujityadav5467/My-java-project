/**
 * project1
 */
import java.util.Scanner;
public class project1 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        ShapeManager sm = new ShapeManager();
        char x;
        System.out.println("enter the user name");
        // String a = sc.nextLine();
        // String b = "sujit5467";
        // if (a ==b)
        // {
            do{
                System.out.println("Welcome to application");
                System.out.println("Press 1 for 2'D shape");
                System.out.println("Press 2 for 3'D shape");
                int n = sc.nextInt();
                if(n==1)
                {
                    ShapeManager.TwoDShape();
                }
                else if(n==2)
                {
                    ShapeManager.ThreeDShape();
                }
                System.out.println("press y/Y to continue");
                x = sc.next().charAt(0);
            }while(x=='y' ||x=='Y');
            System.out.println("thank you to playing the game");
            System.out.println("sdfghj");
        // }
        // else{
        //     System.out.println("enter the valid user ");
        // }
        
    }
}