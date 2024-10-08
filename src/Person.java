
public class Person {
    private String ten;
    private int tuoi;
    private String gioitinh;

    public Person(String ten, int tuoi, String gioitinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
    }

    public String getTen() {
        return this.ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return this.tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioitinh() {
        return this.gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void inFo() {
        System.out.println(this.ten + " - " + this.tuoi + " - " + this.gioitinh);
    }

    @Override
    public String toString() {
        return this.ten + " - " + this.tuoi + " - " + this.gioitinh;
    }
}
