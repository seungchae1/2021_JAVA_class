public class SwitchExam5{
	public static void main(String args[]){
		int a=Integer.parseInt(args[0]);
		String b;		
		switch(a){
			case 1: case 2 : b="���̵�����Ʈ�����"; break;
			case 3: case 4: b="���̵�����ַ�ǰ�"; break;
			default:  b="���̵������ΰ�"; break;
		}
		System.out.println(a+"���� "+b+"�Դϴ�.");
	}
}