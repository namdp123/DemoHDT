package hogiadinh;

public class HoGiaDinhB extends HoGiaDinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HoGiaDinhB b = new HoGiaDinhB();
		b.Nhap();
		b.Xuat();
	}

	@Override
	public int SoNuocPhaiTra() {
		// TODO Auto-generated method stub
		int soNuoc = (getChiSoNuocMoi() - getChiSoNuocCu()) - 20;
		if(soNuoc < 0)
			return 0;
		return soNuoc;
	}
	public void Nhap()
	{
		super.Nhap();
	}
	public void Xuat()
	{
		System.out.println("So nuoc phai tra la "+SoNuocPhaiTra());
		super.Xuat();
	}

}
