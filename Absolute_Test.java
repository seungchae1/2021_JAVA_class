import java.util.Scanner;
public class Absolute_Test{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a=s.nextInt();
		int b=(a<0) ? (a*-1) : a;
		System.out.println(a+"의 절대값은 "+b+"입니다.");
	}
}