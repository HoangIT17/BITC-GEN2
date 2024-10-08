import java.util.Scanner;

public class AppConTrol {

    public void run() {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Vui long chon cac chuc nang 1-4");
            System.out.println("1. Them 1 nguoi moi.");
            System.out.println("2. Tim kiem theo ho ten.");
            System.out.println("3. Hien thi danh sach thong tin day du ve nhan luc.");
            System.out.println("4. Thoat.");
            
            int choose = sc.nextInt();
            sc.nextLine(); // Bỏ qua newline
            switch (choose) {
                case 1:
                    QuanLiNhanLuc.add();
                    break;
                case 2:
                    QuanLiNhanLuc.searchByName();
                    break;
                case 3:
                    QuanLiNhanLuc.printAllInfo();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        }
        sc.close();
    }
}
