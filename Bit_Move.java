public class Bit_Move{
	public static void main(String args[]){
		System.out.println(6<<2);	//6*2*2=24
		System.out.println(18>>2);	//9 4
		System.out.println(-18>>2);	//-5  -4.5 인데 -5가 나오는 이유: 실수값이 나올 때는 더 작은 값으로 선택됨
		System.out.println(18>>>2);	//9 4
		System.out.println(-18>>>2); //
		
		System.out.println(18/4); //딱 맞아떨어지지 않으면 시프트연산자랑 답이 다를 수 있음
		System.out.println(-18/4);
	}
}