import java.util.Scanner;
public class Score_1209_2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double aver;
		System.out.print("수학점수 : ");
		int math=sc.nextInt();
		System.out.print("영어점수 : ");
		int eng=sc.nextInt();
		System.out.print("국어점수 : ");
		int kor=sc.nextInt();
		System.out.print("자바점수 : ");
		int java=sc.nextInt();
		int sum=(math+eng+kor+java);
		System.out.println("합계 : "+sum);
		aver=(double)(sum/4);
		System.out.println("평균 : "+aver);
		
		char grade;
		if(aver>=90) grade='A';
		else if(aver>=80) grade='B';
			else if(aver>=70) grade='C';
				else if(aver>=60) grade='D';
					else grade='E';
		System.out.println("평점 : "+grade);
	}
}