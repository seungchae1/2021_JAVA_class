import java.util.Scanner;
public class 1209_if2{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("������ �Է��� �Է��ϼ���.");
		System.out.println("SUN(0), MON(1), TUE(2), WED(3), THU(4) FRI(5), SAT(6) : ");
		int a=scan.nextInt();
		if(a==0){
			System.out.println("������ SUNDAY�Դϴ�.");
		}
		if(a==1){
			System.out.println("������ MONDAY�Դϴ�.");
		}
		else if(a==2){
			System.out.println("������ TUESDAY�Դϴ�.");
		}
		else if(a==3){
			System.out.println("������ WEDNESDAY�Դϴ�.");
		}
		else if(a==4){
			System.out.println("������ THURSDAY�Դϴ�.");
		}
		else if(a==5){
			System.out.println("������ FRIDAY�Դϴ�.");
		}
		else if(a==6){
			System.out.println("������ SATURDAY�Դϴ�.");
		}
		
		else{
			System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");
		}
	}
}