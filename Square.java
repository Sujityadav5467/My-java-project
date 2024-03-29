import java.util.Scanner;
public class Square 
{
    public static void SquareArea()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of Square");
        double a = sc.nextDouble();
        double area = a*a;
        double parimeter = 4*a;
        System.out.println("Area of Square is"+area);
        System.out.println("Parimeter of Square is :"+parimeter);
    }
}
