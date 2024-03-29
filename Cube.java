import java.util.Scanner;
public class Cube 
{
    public static void CubeArea()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of Cube");
        double a = sc.nextDouble();
        double area = 6*a*a;
        double lsa = 4*a*a;
        double volume = a*a*a;
        System.out.println("Surface Area od cube is :"+area);
        System.out.println("litral surface area of cube is :"+lsa);
        System.out.println("Volume of cube is :"+volume);

    }
    
}
