import java.util.Scanner;
public class Constant1_1209{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		final int TEST = 85;
		System.out.print("시험점수:");
		int a=scan.nextInt();
		System.out.println(a+"-"+TEST+"="+(a-TEST));
		
	}
}