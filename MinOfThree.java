import java.util.Scanner;
public class MinOfThree{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("첫 번째 수 입력 : ");
		int a=scan.nextInt();
		System.out.print("두 번째 수 입력 : ");
		int b=scan.nextInt();
		System.out.print("세 번째 수 입력 : ");
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
		System.out.println(a+"와 "+b+"와 "+c+" 중 가장 작은 수는 "+min+"입니다.");
	}
}