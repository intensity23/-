
public class Loop01 {

	public static void main(String[] args) {
		int[] jumsu = { 85, 90, 70, 75, 100, 95, 95, 80, 75, 85 };
		int sum = 0;
		int i = 0;

		while (i < jumsu.length) {
			sum += jumsu[i];
			i++;
		}
		double result = sum / i;
		System.out.println(result);
	}
}
