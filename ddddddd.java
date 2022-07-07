import java.util.Random;
import java.util.Scanner;

public class ddddddd {
	public static void main(String[] args) {
		int[] numbers = new int[45];
		int temp = 0;

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 1 + i;
		}
		

		for (int i = 0; i < numbers.length; i++) {
			Random rd = new Random();
			int rdnum = rd.nextInt(44);
			
			temp = numbers[i];
			numbers[i]=numbers[rdnum];
			numbers[rdnum]=temp;
			
			}
		for (int i = 0; i<6; i++) {
			System.out.println(numbers[i]);

		}

		Scanner sc = new Scanner(System.in);
		String inta = sc.nextLine();
		
		int a = Integer.parseInt(inta);
		
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
