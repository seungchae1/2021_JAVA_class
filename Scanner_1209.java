import java.util.Scanner;
public class Scanner_1209{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("사각형의 밑면 : ");
		int w=scan.nextInt();
		System.out.print("사각형의 높이 : ");
		int h=scan.nextInt();
		System.out.println("사각형의 넓이 : "+(h*w));
	}
}