import java.util.Scanner;
public class CondOp_Test{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int a=s.nextInt();
		String b=(a%2==0) ? "��(��) ¦���Դϴ�." : "��(��) Ȧ���Դϴ�."; //��(��) �Դϴ�. �� ��¹��� ���� ��
		System.out.println(a+b);
	}
}