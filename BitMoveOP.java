public class BitMoveOP{
	public static void main(String arg[]){
		byte a=10;
		System.out.println(a>>3); 
		System.out.println(a<<3); 
		byte b=-10;                   // 00001010
		System.out.println(b>>2);  //11110110
		System.out.println(b<<2); 
		System.out.println(b>>>2); 
	}
}