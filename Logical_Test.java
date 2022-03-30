public class Logical_Test{
	public static void main(String args[]){
		int a=10;
		System.out.println((a=20)==20);
		//System.out.println(!a);
		System.out.println(a);
		boolean power=false;
		System.out.println(power); //false
		System.out.println(!power); //true
		power=!power; //true
		System.out.println(!power); //false
		System.out.println(!!power); //true
	}
}