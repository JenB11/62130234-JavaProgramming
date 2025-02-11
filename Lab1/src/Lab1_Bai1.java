/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class Lab1_Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner nhap = new Scanner(System.in);
		
		System.out.print("Họ và tên: ");
		String hoTen = nhap.nextLine();
		
		System.out.print("Điểm TB: ");
		double diemTB = nhap.nextDouble();

		System.out.printf("%s %.1f điểm", hoTen, diemTB );

	}

}
