public class Textual{
	public static void main(String args[]){
		char a='A';
		char b='��';
		System.out.println(a);
		System.out.println(b);
		System.out.println('A');
		System.out.println('\u0041'); //16���� u=�����ڵ� 65='A'
		System.out.println('\u0042'); //66
		System.out.println('\u0061'); //97 = 'a'
		System.out.println('\u007A'); // 122 'z'
	}
}