import java.util.Scanner;
public class Cricle 
{
    public static void CricleArea()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        double a = sc.nextDouble();
        double b = 3.14;
        double area = b*a*a;
        double parimeter =2*b*a;
        System.out.println("Area of cricle is :"+area);
        System.out.println("Parimeter of cricle is :"+parimeter);

    }

}
