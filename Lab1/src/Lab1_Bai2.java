/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */
public class Lab1_Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner nhap = new Scanner(System.in);
		
		System.out.print("Nhập chiều dài: ");
		double dai = nhap.nextDouble();
		
		System.out.print("Nhập chiều rộng: ");
		double rong = nhap.nextDouble();
		
		double chuVi = (dai+rong)*2;
		
		double dienTich = dai * rong;
		
		double canhNhoNhat = Math.min(dai, rong);
		
		System.out.printf("Chu vi = %.1f",  chuVi);
		
		System.out.printf("\nDiện tích = %.1f",  dienTich);
		
		System.out.printf("\nCạnh nhỏ nhất = %.1f",  canhNhoNhat);
	}

}
