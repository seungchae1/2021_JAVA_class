public class IncreaseOp{
	public static void main(String args[]){
		int num=0;
		num=num+1;
		System.out.println("num : " + num);
		System.out.println("++num : "+(++num)); //제외 괄호 안써도 무관
		System.out.println("num++ : "+(num++));
		System.out.println("num : "+num);
		System.out.println("--num : "+(--num));
		System.out.println("num-- : " +(num--));
		System.out.println("num : "+num);
	}
}