import CanBo.CanBo;
import CanBo.NhanVien;
import CanBo.KySu;
import CanBo.CongNhan;

import java.util.ArrayList;
import java.util.Scanner;

public class ManegerWorker {
    ArrayList<CanBo> arrWorker = new ArrayList<>();

    public void addNewNhanVien() {
        NhanVien nhanVien = new NhanVien();
        nhanVien.addNhanVien();
        arrWorker.add(nhanVien);
    }

    public void addNewKySu () {
        KySu kySu = new KySu();
        kySu.addKySu();
        arrWorker.add(kySu);
    }

    public void addNewCongNhan() {
        CongNhan congNhan = new CongNhan();
        congNhan.addCongNhan();
        arrWorker.add(congNhan);
    }

    public void searchWorker() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên cần tìm kiếm: ");
        String searchName = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < arrWorker.size(); i++) {
            if (arrWorker.get(i).getName().contains(searchName)) {
                System.out.println(arrWorker.get(i));
                count++;
            }
        }
        if (count == 0) {
            System.err.println("Không tim thấy");
        }
    }

    public void displayAll() {
        for (int i = 0; i < arrWorker.size(); i++) {
            System.out.println(arrWorker.get(i));
        }
    }

}
