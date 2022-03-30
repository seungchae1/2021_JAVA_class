import java.util.Scanner;
public class Test1{
	public static void main(String args[]){
		int a;
		double b;
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		System.out.println(input);
		a=s.nextInt();
		b=s.nextDouble();
		System.out.println(a+b);
	}
}