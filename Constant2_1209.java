import java.util.Scanner;
public class Constant2_1209{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		final double PI=3.14;
		System.out.print("������ : ");
		int r=scan.nextInt();
		System.out.println("������ "+r+"�� ���� �ѷ� : "+(2*PI*r));
		System.out.println("������ "+r+"�� ���� ���� : "+(PI*r*r));
	}
}