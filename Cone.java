import java.util.Scanner;
public class Cone 
{
    public static void Conec()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the height of cone ");
        double h = sc.nextDouble();
        System.out.println("enter the radius of cone");
        double r = sc.nextDouble();
        double a = 3.14;
        // A=πr(r+h2+r2)
        double sa = a*r*(r*Math.sqrt(h*h+r*r));
        // AL=πrh2+r2
        double lsa = a*r*Math.sqrt(h*h+r*r);
        // V=πrrh/3
        double volume = (a*r*r*h)/3;
        System.out.println("surface area of cone is :"+sa);
        System.out.println("literal saurface area of cone is :"+lsa);
        System.out.println("volume of cone is :"+volume);
    }
    
}
