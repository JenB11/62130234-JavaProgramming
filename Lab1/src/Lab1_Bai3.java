/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */
public class Lab1_Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner nhap = new Scanner(System.in);
		
		System.out.print("Nhập cạnh: ");
		int canh = nhap.nextInt();
		
		double theTich = Math.pow(canh, 3);
		
		System.out.printf("Thể tích lập phương = %.1f", theTich);
	}

}
