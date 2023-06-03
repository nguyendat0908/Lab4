
public class Main {
	public static void main(String[] args) {
		BenhVien bv = new BenhVien("Benh vien Viet Duc", "HA NOI", "DAT");
		BenhNhan bn = new BenhNhan("Nguyen Van A",22 ,"Nam", "Khong", "Khong", bv);
		System.out.println(bn.toString());
	}
}
