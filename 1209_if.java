import java.util.Scanner;
public class 1209_if{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("����(1), ����(2), ��(3) �Է� : ");
		int a=scan.nextInt();
		if(a==1){
			System.out.println("����� ������ ���̽��ϴ�.");
		}
		else if(a==2){
			System.out.println("����� ������ ���̽��ϴ�.");
		}
		else if(a==3){
			System.out.println("����� ���� ���̽��ϴ�.");
		}
		else{
			System.out.println("�߸����̽��ϴ�.");
		}
	}
}