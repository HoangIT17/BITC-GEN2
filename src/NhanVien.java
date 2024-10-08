
public class NhanVien extends Person {
    private String congViec;

    public NhanVien(String congViec, String ten, int tuoi, String gioitinh) {
        super(ten, tuoi, gioitinh);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return this.congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + this.congViec;
    }
}
