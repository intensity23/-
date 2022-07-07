package chapter10_예외클래스;

public class TryCatchFinallyExample   {
	public static void main(String[] args) {
//try catch
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {

			System.err.println("오류");
		}
//		run();
	}
	static void run() throws ClassNotFoundException{
//		throws exception
		Class.forName("java.lang.String2");
	}
}
