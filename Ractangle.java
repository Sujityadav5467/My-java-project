import java.util.Scanner;
public class Ractangle 
{
    public static void RactangleArea()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Ractangle");
        double l = sc.nextDouble();
        System.out.println("Enter the weight of Ractangle");
        double w = sc.nextDouble();
        System.out.println("area of ractangle is :"+(l*w));
        System.out.println("parimeter of ractangle is :"+(2*l+w));
    }
    
}
