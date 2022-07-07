package chapter4;

public class forMultiplicationTableExample {
	public static void main(String[] args) {
		for(int m=2; m<=9; m++) {
			System.out.println("***"+m+"단***");
			for (int n=1; n<=9; n++) {
				System.out.println(m+"x"+n+"="+(n*m));
				
			}
		}
	}

}
/*
 * public static void main(String[] args){
 *   System.out.println(***2단***);
 *   System.out.println(2 + "x" + 1 + "=" + (2*1));
 *   System.out.println(2 + "x" + 2 + "=" + (2*2));
 *   System.out.println(2 + "x" + 3 + "=" + (2*3));
 *   System.out.println(2 + "x" + 4 + "=" + (2*4));
 *   System.out.println(2 + "x" + 5 + "=" + (2*5));
 *   System.out.println(2 + "x" + 6 + "=" + (2*6));
 *   System.out.println(2 + "x" + 7 + "=" + (2*7));
 *   System.out.println(2 + "x" + 8 + "=" + (2*8));
 *   System.out.println(2 + "x" + 9 + "=" + (2*9));
 *   for(int m = 2; m<=9; m++){
 *    System.out.println("***" + m + "단***");
 *   for (int n = 1; n<=9; n++){
 *   System.out.println(m + "x" + n + "=" + (m*n));
  */

