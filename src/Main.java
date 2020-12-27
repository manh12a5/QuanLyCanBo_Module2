import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static ManegerWorker manegerWorker = new ManegerWorker();

    public static void main(String[] args) {
        int number;
        do {
            listSwitch();
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    //Thông tin Công Nhân
                    manegerWorker.addNewCongNhan();
                    break;
                case 2:
                    //Thông tin Kỹ Sư
                    manegerWorker.addNewKySu();
                    break;
                case 3:
                    //Thông tin Nhân Viên
                    manegerWorker.addNewNhanVien();
                    break;
                case 4:
                    //Tìm kiếm
                    manegerWorker.searchWorker();
                    break;
                case 5:
                    //Display all
                    manegerWorker.displayAll();
                    break;
            }
        } while (number != 0);
        System.exit(0);

    }

    public static void listSwitch() {
        System.out.println("1. Nhập thông tin của Công Nhân");
        System.out.println("2. Nhập thông tin của Kỹ Sư");
        System.out.println("3. Nhập thông tin của Nhân Viên");
        System.out.println("4. Tìm kiếm");
        System.out.println("5. Hiện thị toàn bộ thông tin");
        System.out.print("Choice number: ");
    }

}
