
public class Star01 {
	public static void main(String[] args) {

		for (int i = 1; i < 11; i++) {
			for (int j = 1; j <= i; j++) {
				if (i >= j) {
					System.out.print("*");
				}

			}
			System.out.println();
		}

		int i = 1;
		int j = 1;

		 

		while (i <= 10) {

			while (j <= i) {
				System.out.print("*");
				j = j + 1;

			}
			System.out.println("");
			j = 1;
			i = i + 1;
		}

	}

}
