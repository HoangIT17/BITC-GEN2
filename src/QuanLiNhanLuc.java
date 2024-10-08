import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLiNhanLuc {
    private static List<Person> listPerson = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    // Thêm 1 người mới
    public static void add() {
        System.out.print("Nhập tên: ");
        String ten = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        int tuoi = sc.nextInt();
        sc.nextLine(); // Để bỏ qua ký tự Enter sau khi nhập số

        System.out.print("Nhập giới tính: ");
        String gioiTinh = sc.nextLine();

        System.out.println("Chọn loại nhân lực: 1. Nhân viên, 2. Công nhân, 3. Kỹ sư");
        int choice = sc.nextInt();
        sc.nextLine(); 

        Person person = null;
        switch (choice) {
            case 1:
                System.out.print("Nhập công việc: ");
                String congViec = sc.nextLine();
                person = new NhanVien(congViec, ten, tuoi, gioiTinh);
                break;
            case 2:
                System.out.print("Nhập cấp bậc: ");
                String capBac = sc.nextLine();
                person = new CongNhan(capBac, ten, tuoi, gioiTinh);
                break;
            case 3:
                System.out.print("Nhập chuyên ngành: ");
                String chuyenNganh = sc.nextLine();
                person = new KySu(chuyenNganh, ten, tuoi, gioiTinh);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
                return;
        }
        listPerson.add(person);
    }

   
    public static void searchByName() {
        System.out.print("Nhập tên người muốn tìm: ");
        String ten = sc.nextLine();
        boolean found = false;
        for (Person person : listPerson) {
            if (person.getTen().equalsIgnoreCase(ten)) {
                System.out.println("Thông tin người được tìm thấy:");
                person.inFo();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy người có tên: " + ten);
        }
    }

    public static void printAllInfo() {
        if (listPerson.isEmpty()) {
            System.out.println("Danh sach trong.");
            return;
        }

        for (Person person : listPerson) {
            System.out.println(person.toString());  
        }
    }  
}
