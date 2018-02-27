package hogiadinh;
import hogiadinh.HoGiaDinh;
public class HoGiaDinhA extends  HoGiaDinh implements InterfaceHGD{
	int nhanKhau;
	//So nhan khau
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HoGiaDinhA a = new  HoGiaDinhA();
		a.SoNuocPhaiTra();
		a.Nhap();
		a.Xuat();

	}

	@Override
	public int SoNuocPhaiTra() {
		// TODO Auto-generated method stub
		int soNuoc = (getChiSoNuocMoi() - getChiSoNuocCu()) - 5*getNhanKhau();
		if(soNuoc < 0)
			return 0;
		return soNuoc;
	}
	int getNhanKhau() {
		return nhanKhau;
	}
	void setNhanKhau(int nhanKhau) {
		this.nhanKhau = nhanKhau;
	}
	public void Nhap() {
		super.Nhap();
		System.out.println("Nhap so nhan khau");
		nhanKhau = in.nextInt();
	}
	public void Xuat() {
		super.Xuat();
		System.out.println("So nhan khau  "+nhanKhau);
		System.out.println("So nuoc su dung  " + SoNuocPhaiTra());
		System.out.println("Tien nuoc moi nhan khau  "+ SoNuocMoiNguoi());
	}

	@Override
	public float SoNuocMoiNguoi() {
		// TODO Auto-generated method stub
		return (SoNuocPhaiTra()/getNhanKhau());
	}
	


}
