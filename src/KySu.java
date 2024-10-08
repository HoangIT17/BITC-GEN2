
public class KySu extends Person {
    private String chuyenNganh;

    public KySu(String chuyenNganh, String ten, int tuoi, String gioitinh) {
        super(ten, tuoi, gioitinh);
        this.chuyenNganh = chuyenNganh;
    }

    public String getChuyenNganh() {
        return this.chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + this.chuyenNganh;
    }
}
