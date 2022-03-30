import java.util.Scanner;
public class Constant2_1209{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		final double PI=3.14;
		System.out.print("반지름 : ");
		int r=scan.nextInt();
		System.out.println("반지름 "+r+"인 원의 둘레 : "+(2*PI*r));
		System.out.println("반지름 "+r+"인 원의 넓이 : "+(PI*r*r));
	}
}