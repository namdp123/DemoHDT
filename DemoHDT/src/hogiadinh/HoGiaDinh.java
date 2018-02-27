package hogiadinh;
import java.util.*;
abstract class HoGiaDinh {
	protected String tenChuHo; 
	//Ten chu ho
	protected String diaChi;
	//Dia chi
	protected int chiSoNuocCu;
	//Chi so nuoc cu
	protected int chiSoNuocMoi;
	//Chi so nuoc moi
	Scanner in = new Scanner(System.in);
	
	//Danh sach cac ham khoi tao
	
	public String getTenChuHo() {
		return tenChuHo;
	}
	public void setTenChuHo(String tenChuHo) {
		this.tenChuHo = tenChuHo;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getChiSoNuocCu() {
		return chiSoNuocCu;
	}
	public void setChiSoNuocCu(int chiSoNuocCu) {
		this.chiSoNuocCu = chiSoNuocCu;
	}
	public int getChiSoNuocMoi() {
		return chiSoNuocMoi;
	}
	public void setChiSoNuocMoi(int chiSoNuocMoi) {
		this.chiSoNuocMoi = chiSoNuocMoi;
	}
	//Ham tinh so nuoc
	public abstract int SoNuocPhaiTra();
	//Ham tinh tien nuoc
	public double TienNuoc()
	{
		return SoNuocPhaiTra() * 8000;
	}
	//Ham nhap du lieu
	public void Nhap(){
		System.out.println("Nhap ho ten chu ho: ");
		tenChuHo = in.nextLine();
		System.out.println("Nhap dia chi: ");
		diaChi = in.nextLine();
		System.out.println("Nhap chi so nuoc cu : ");
		chiSoNuocCu = in.nextInt();
		System.out.println("Nhap chi so nuoc moi :");
		chiSoNuocMoi = in.nextInt();
	}
	//Ham xuat du lieu
	public void Xuat() {
		System.out.println("Ho Ten Chu Ho: " + tenChuHo);
		System.out.println("Dia chi  "+ diaChi);
		System.out.println("Chi So nuoc cu  " + chiSoNuocCu);
		System.out.println("Chi so nuoc moi  "+chiSoNuocMoi);
		System.out.println("Tong tien nuoc phai tra  " +TienNuoc());
	}
	public float TienNocMoiNhanKhau() {
		// TODO Auto-generated method stub
		return 0;
	}

}
