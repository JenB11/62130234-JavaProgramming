import java.util.ArrayList;

public class CTArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SanPham> dsSanPham;
		
		dsSanPham = new  ArrayList<SanPham>();
		
//		SanPham sp1 = new SanPham(0, "Gà rán", "Đồ ăn", null);
		SanPham sp2 = new SanPham(1, "Bánh mì", "Đồ ăn", null);
		SanPham sp3 = new SanPham(2, "Xúc xích", "Đồ ăn", null);
		
		dsSanPham.add(new SanPham(0, "Gà rán", "Đồ ăn", null));
		dsSanPham.add(sp2);
		dsSanPham.add(sp3);
		
//		for(SanPham x: dsSanPham)
//			System.out.println(x.toString());
		
		for(int  i=0; i<dsSanPham.size(); i++) {
			SanPham sp = dsSanPham.get(i);
			System.out.println(sp.toString());
		}
	}

}
