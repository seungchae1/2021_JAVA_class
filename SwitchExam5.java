public class SwitchExam5{
	public static void main(String args[]){
		int a=Integer.parseInt(args[0]);
		String b;		
		switch(a){
			case 1: case 2 : b="뉴미디어소프트웨어과"; break;
			case 3: case 4: b="뉴미디어웹솔루션과"; break;
			default:  b="뉴미디어디자인과"; break;
		}
		System.out.println(a+"반은 "+b+"입니다.");
	}
}