import java.util.Scanner;
public class Sphare 
{
    public static void ShapreArea()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of Shapre");
        // A=4πr*r
        double b =3.14;
        double r =sc.nextDouble();
        double a = 4*b*r*r;
        System.out.println("Surface areea of sphare is :"+a);
    }
    
}
