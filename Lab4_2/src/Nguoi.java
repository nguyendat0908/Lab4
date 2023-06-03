
public class Nguoi {
	protected String ten;
	protected int tuoi;
	protected String gioiTinh;
	
	public Nguoi(String ten, int tuoi, String gioiTinh) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
	}
	
	public Nguoi() {
	}
	
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	@Override
	public String toString() {
		return "ten=" + ten + "\ntuoi=" + tuoi + "\ngioiTinh=" + gioiTinh ;
	}
	
	
}