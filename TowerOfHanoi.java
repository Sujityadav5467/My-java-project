import java.util.Scanner;
class TowerOfHanoi
{
	static int count = 0;
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		getmoves(n,'A','B','C');
		System.out.println("moves"+count);
	}
	public static void getmoves( int n,char s,char d,char h)
	{
		count++;
		if(n==1)
			{
				System.out.println("move disk"+n+"from"+s+"to"+d);
				return;
			}
		getmoves(n-1,s,h,d);
		System.out.println("move disk"+n+"from"+s+"to"+d);
		getmoves(n-1,h,d,s);
	}
}