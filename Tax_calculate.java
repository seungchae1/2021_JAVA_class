import java.util.Scanner;
public class Tax_calculate{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("근로소득 입력(만원) : ");
		int salary=scan.nextInt();
		int year;
		if(salary<=2000){
			year=(int)(salary*0.05);
		}
		else if(salary<=4000){
			year=(int)(salary*0.15);
		}
		else if(salary<=8000){
			year=(int)(salary*0.25);
		}
		else{
			year=(int)(salary*0.4);
		}
		System.out.println("소득세 : "+year+"만원");
	}
}