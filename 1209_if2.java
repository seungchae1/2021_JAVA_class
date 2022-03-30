import java.util.Scanner;
public class 1209_if2{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("오늘의 입력을 입력하세요.");
		System.out.println("SUN(0), MON(1), TUE(2), WED(3), THU(4) FRI(5), SAT(6) : ");
		int a=scan.nextInt();
		if(a==0){
			System.out.println("오늘은 SUNDAY입니다.");
		}
		if(a==1){
			System.out.println("오늘은 MONDAY입니다.");
		}
		else if(a==2){
			System.out.println("오늘은 TUESDAY입니다.");
		}
		else if(a==3){
			System.out.println("오늘은 WEDNESDAY입니다.");
		}
		else if(a==4){
			System.out.println("오늘은 THURSDAY입니다.");
		}
		else if(a==5){
			System.out.println("오늘은 FRIDAY입니다.");
		}
		else if(a==6){
			System.out.println("오늘은 SATURDAY입니다.");
		}
		
		else{
			System.out.println("요일을 잘못 입력하셨습니다.");
		}
	}
}