import java.util.Scanner;
public class CondOp_Test{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a=s.nextInt();
		String b=(a%2==0) ? "은(는) 짝수입니다." : "은(는) 홀수입니다."; //은(는) 입니다. 는 출력문에 쓰도 됨
		System.out.println(a+b);
	}
}