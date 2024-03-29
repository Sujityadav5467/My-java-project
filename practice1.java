/**
 * practice1
 */
import java.util.Scanner;
public class practice1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the unmber");
        int n = sc.nextInt();
        int i = 1;
        int count = 0;
        while (i<=n) 
        {
            if(i%2==0){
                count++;
            }
            else
            {
                count++;
            }
           i++; 
        }
        System.out.println("even"+count);
        System.out.println("odd"+count);
        
    }   
}