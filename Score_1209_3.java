import java.util.Scanner;
public class Score_1209_3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double aver;
		System.out.print("�������� : ");
		int math=sc.nextInt();
		System.out.print("�������� : ");
		int eng=sc.nextInt();
		System.out.print("�������� : ");
		int kor=sc.nextInt();
		System.out.print("�ڹ����� : ");
		int java=sc.nextInt();
		int sum=(math+eng+kor+java);
		System.out.println("�հ� : "+sum);
		aver=(double)(sum/4);
		System.out.println("��� : "+aver);
		
		char grade;
		switch((int)(aver/10)) {
			case 10:
			case 9: grade='A'; break;
			case 8: grade='B'; break;
			case 7: grade='C'; break;
			case 6: grade='D'; break;
			default: grade='E';
		}
		/*if(aver>=90) grade='A';
		else if(aver>=80) grade='B';
			else if(aver>=70) grade='C';
				else if(aver>=60) grade='D';
					else grade='E';
		*/
		System.out.println("���� : "+grade);
	}
}