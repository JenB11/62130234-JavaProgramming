/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */
public class Lab1_Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner nhap = new Scanner(System.in);
		
		System.out.print("Nhập a: ");
		double a = nhap.nextDouble();
		
		System.out.print("Nhập b: ");
		double b = nhap.nextDouble();

		System.out.print("Nhập c: ");
		double c = nhap.nextDouble();

		double delta = Math.pow(b, 2) - 4 * a * c;
		
		System.out.printf("Căn delta = %.2f", Math.sqrt(delta));

	}

}
