import java.util.Scanner;
public class ShapeManager 
{
    static char x;
    public static void TwoDShape()
    {
        Cricle c =new Cricle();
        Square sq = new Square();
        Triangel tr = new Triangel();
        Ractangle rt = new Ractangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for cricle");
        System.out.println("Press 2 for Squre");
        System.out.println("Press 3 for Triangle");
        System.out.println("Press 4 for Ractangle");
        int a = sc.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("You selected cricle");
                Cricle.CricleArea();
                break;
            case 2:
            System.out.println("You are selected Square");
            Square.SquareArea();
                break;
            case 3:    
                System.out.println("You are selected Triangle");
                Triangel.TriangelArea();
                break;
            case 4:    
                System.out.println("You are selected Ractangle");
                Ractangle.RactangleArea();
                break;
            default:
                System.out.println("Please enter the valid number");
                break;
            }
        return;
    }
    public static void ThreeDShape()
    {
        Scanner sc = new Scanner(System.in);
        Cube c =new Cube();
        Cuboid cb = new Cuboid();
        Cone co = new Cone();
        Sphare s =new Sphare();
        System.out.println("you are selected 3d shape");
        System.out.println("Press 1 for cube");
        System.out.println("Press 2 for cuboid");
        System.out.println("Press 3 for cone");
        System.out.println("Press 4 for Sapare");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("You are selected cube");
                Cube.CubeArea();
                break;
            case 2:
                System.out.println("You are selected cuboid");
                Cuboid.CuboidSA();
                break;
            case 3:
                System.out.println("you are selected  cone");
                Cone.Conec();
                break;
            case 4:
                System.out.println("you are selected sphare");
                Sphare.ShapreArea();
            default:
                break;
        }
    }
    
}
