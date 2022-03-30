public class DataType{
	public static void main(String  [] args){
		/*byte a=10;
		int b=a; //자동형, 확대형, 묵시적형 변환
		System.out.println(a);
		System.out.println(b);
		int c=10;
		byte d=(byte)c; //강제형, 축소형, 명시형 변환
		System.out.println(c);
		System.out.println(d);*/
		int a=-129;
		byte b=(byte)a;
		//byte d=(byte)(a+b);
		//System.out.println("a + b : "+d); 
		System.out.println(b);
		final int k=10;
		System.out.println(k);
		k=150;
		System.out.println(k);
		
	}
}