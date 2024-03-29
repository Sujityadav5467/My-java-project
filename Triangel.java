import java.util.Scanner;
public class Triangel 
{
    public static void TriangelArea()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hieght of Triangle");
        double h = sc.nextDouble();
        System.out.println("Enter the Base of Triangle");
        double b = sc.nextDouble();
        double area = 0.5*(h*b);
        System.out.println("Area of Triangle is :"+area);
    }
    
}
