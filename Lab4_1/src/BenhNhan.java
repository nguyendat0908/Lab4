
public class BenhNhan extends Nguoi{
	protected String tienSu,chuanDoan;
	protected BenhVien benhVien;
	public BenhNhan(String ten, int tuoi, String gioiTinh, String tienSu, String chuanDoan, BenhVien benhVien) {
		super(ten, tuoi, gioiTinh);
		this.tienSu = tienSu;
		this.chuanDoan = chuanDoan;
		this.benhVien = benhVien;
	}
	public BenhNhan() {
	}
	public String getTienSu() {
		return tienSu;
	}
	public void setTienSu(String tienSu) {
		this.tienSu = tienSu;
	}
	public String getChuanDoan() {
		return chuanDoan;
	}
	public void setChuanDoan(String chuanDoan) {
		this.chuanDoan = chuanDoan;
	}
	public BenhVien getBenhVien() {
		return benhVien;
	}
	public void setBenhVien(BenhVien benhVien) {
		this.benhVien = benhVien;
	}
	@Override
	public String toString() {
		return super.toString()+"\ntienSu=" + tienSu + "\nchuanDoan=" + chuanDoan + "\nbenhVien=" + benhVien ;
	}
	
	
	
}
