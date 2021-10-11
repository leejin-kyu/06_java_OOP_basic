package step6_02.method;

/*
 * 
 *  # 메서드의 4가지 형태
 * 
 * 입력값(파라메타,매개변수,인수,인자,아규먼트)과 
 * 결과값(return)의 유무에 따라 4가지 형태로 나뉜다.
 * 
 * 입력값이 있고 , 결과값이 있다. ( 11 )
 * 입력값이 있고 , 결과값이 없다. ( 10 )
 * 입력값이 없고 , 결과값이 있다. ( 01 )
 * 입력값이 없고 , 결과값이 없다. ( 00 )
 * 
 * */

class MethodType {
	// 입력값과 결과값이 모두 없는 경우
	
	int a;
	
	void type00() {
		System.out.println("type00 메서드 호출");
		System.out.println("");
}
	// 입력값이 있고 결과값이 없는 경우
	void type10(int aaa, int bbb) {
		System.out.println("type10 메서드 호출");
		System.out.println("전달받은 매개변수의 합"+ (aaa+ bbb));
		System.out.println();
	}
	
}
public class MethodEx02 {

	public static void main(String[] args) {
		
		MethodType mt = new MethodType();
		
		// 입력값과 결과값이 모두 없는 경우
		mt.type00();
		mt.type00();
		mt.type00();
		
		// 입력값이 있고 결과값이 없는 경우
		mt.type10(9123, 123);
		mt.type10(1234, 678);
		mt.type10(2321, 12312);
		
		// mt.type10(3.14, 5.12); //불가능(매개변수의 타입이 일치해야 한다.)
		// mt.type10(300); // 불가능(매개변수의 개수가 일치해야 한다.)
	}
}