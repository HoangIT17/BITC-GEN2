
public class CongNhan extends Person {
    private String capBac;

    public CongNhan(String capBac, String ten, int tuoi, String gioitinh) {
        super(ten, tuoi, gioitinh);
        this.capBac = capBac;
    }

    public String getCapBac() {
        return this.capBac;
    }

    public void setCapBac(String capBac) {
        this.capBac = capBac;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + this.capBac;
    }
}
