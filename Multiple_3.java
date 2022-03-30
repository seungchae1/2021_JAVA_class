import java.util.Scanner;
public class Multiple_3{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int in=scan.nextInt();
		if(in%3==0){
			System.out.println(in+"은(는) 3의 배수입니다.");
		}
		else{
			System.out.println(in+"은(는) 3의 배수가 아닙니다.");
		}
			
			 //명령문이 두 개 이상이면 반드시 중괄호로 묶어주어야 한다.
			//중괄호를 쓰지 않으면 가장 앞에 쓴 명령문 하나만 참일 때 수행하는 명령문으로 인식한다.
	}
}