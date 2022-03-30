import java.util.Scanner;
public class IfExam3{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		char op=scan.next().charAt(0);
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(a+op+b+" = "+(a+b));
		
	}
}