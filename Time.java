import java.util.Scanner;
public class Time{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int time=s.nextInt();
		int a=time/3600;
		int b=(time-a*3600)/60;
		int c=time%60;
		System.out.println(time+"�ʴ� "+a+"�ð� "+b+"�� "+c+"���Դϴ�.");
	}
}