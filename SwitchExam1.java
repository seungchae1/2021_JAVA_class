import java.util.Scanner;
public class SwitchExam1{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		char op=scan.next().charAt(0);
		int b=scan.nextInt();
		/*
		if(op=='+') System.out.println(a+" + "+b+" = "+(a+b));
		else if(op=='-') System.out.println(a+" - "+b+" = "+(a-b));
		else if(op=='*') System.out.println(a+" * "+b+" = "+(a*b));
		else if(op=='/') System.out.println(a+" / "+b+" = "+(a/b));
		else if(op=='%') System.out.println(a+" % "+b+" = "+(a%b));
		else System.out.println("��������ڰ� �ƴմϴ�.");
		*/
		switch(op){ //���� ���� ���ڿ�
			case '+' :System.out.println(a+" + "+b+" = "+(a+b)); break;
			case '-' :System.out.println(a+" - "+b+" = "+(a-b)); break;
			case '*' :System.out.println(a+" * "+b+" = "+(a*b)); break;
			case '/' :System.out.println(a+" / "+b+" = "+(a/b)); break;
			case '%' :System.out.println(a+" % "+b+" = "+(a%b)); break;
			default:System.out.println("��������ڰ� �ƴմϴ�.");
		}
		String c= "�̸�";
		switch(c){
			case "�̸�":System.out.println("�ȳ�"); break;
			case "����":System.out.println("�ϼ���."); break;
		}
	}
}