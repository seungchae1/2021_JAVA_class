import java.util.Scanner;
public class MinOfThree{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("ù ��° �� �Է� : ");
		int a=scan.nextInt();
		System.out.print("�� ��° �� �Է� : ");
		int b=scan.nextInt();
		System.out.print("�� ��° �� �Է� : ");
		int c=scan.nextInt();
		int min;
		if (a<b){
			if (a<c){
				min=a;
			}
			else{
				min=c;
			}
		}
		else{
			if(b<c){
				min=b;
			}
			else{
				min=c;
			}
		}
		System.out.println(a+"�� "+b+"�� "+c+" �� ���� ���� ���� "+min+"�Դϴ�.");
	}
}