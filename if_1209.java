import java.util.Scanner;
public class if_1209{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("가위(1), 바위(2), 보(3) 입력 : ");
		int a=scan.nextInt();
		if(a==1){
			System.out.println("당신은 가위를 내셨습니다.");
		}
		else if(a==2){
			System.out.println("당신은 바위를 내셨습니다.");
		}
		else if(a==3){
			System.out.println("당신은 보를 내셨습니다.");
		}
		else{
			System.out.println("잘못내셨습니다.");
		}
	}
}