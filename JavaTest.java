import java.util.Scanner;
public class JavaTest{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("�簢���� �ظ� : ");
		int w=scan.nextInt();
		System.out.print("�簢���� ���� : ");
		int h=scan.nextInt();
		System.out.println("�簢���� ���� : "+w*h);
	}
}