import java.util.Scanner;
public class Cuboid 
{
    public static void CuboidSA()
    {
        Scanner sc = new Scanner(System.in);
        //surface area (SA)=2lw+2lh+2hw.
        System.out.println("enter the length of cuboid");
        double l = sc.nextDouble();
        System.out.println("Enter the wigth of cuboid");
        double w = sc.nextDouble();
        System.out.println("ebter the height of cuboid");
        double h = sc.nextDouble();
        double sa = 2*l*w+2*l*h+2*h*w;
        // lsa 2 × (lb + bh + hl)
        double lsa = 2*(l*w+w*h+h*l);
        //volume of cuboid l*w*h
        double volume = l*w*h;
        System.out.println("Syrface area of couboid is :"+sa);
        System.out.println("Literal surface area of cuboid is :"+lsa);
        System.out.println("volume of cuboid is:"+volume);
    }
    
}
