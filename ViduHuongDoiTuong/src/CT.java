
public class CT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SanPham sp1 = new SanPham();
		SanPham sp2 = new SanPham(2, "Cơm tấm","Đồ ăn","ct.jpg");
		sp1.setMaSP(1);
		sp1.setTenSP("CoCa");
		sp1.setLoaiSP("Đồ uống");
		sp1.setAnhSP("co.jpg");
		
		String thongtinSP1 = sp1.toString();
		String thongtinSP2 = "Mã SP2 là " + sp2.getMaSP();
		       thongtinSP2 += " Tên SP2 là " + sp2.getTenSP();
		
		System.out.println(thongtinSP1);
		System.out.println(thongtinSP2);
		
	}

}
