
public class DDD {
	public static void main(String[] args) {

		int A = 2;
		int B = 1;

		while (A < 10) {
			System.out.println(A + "단");
			B = 1;
			while (B < 10) {
				System.out.println(A + " * " + B + " = " + A * B);
				B++;
			}
			A++;

		}
	}
}
