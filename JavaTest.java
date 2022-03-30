import java.util.Scanner;
public class JavaTest{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("사각형의 밑면 : ");
		int w=scan.nextInt();
		System.out.print("사각형의 높이 : ");
		int h=scan.nextInt();
		System.out.println("사각형의 넓이 : "+w*h);
	}
}