package chapter3;

public class example10 {
	public static void main(String[] args) {
		int var1= 10;//반지름
		int var2= 3;
		int var3= 14;
		String var4 = var2+"."+var3;
		double var5 = Double.parseDouble(var4);
		
		double var6 = var1 * var1 * (var5);
		System.out.println("원의 넓이:" + var6);
		
		
	}

}
