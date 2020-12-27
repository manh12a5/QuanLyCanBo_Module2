package CanBo;

import java.util.Scanner;

public class CongNhan extends CanBo {
    private int lever;

    public CongNhan() {
    }

    public CongNhan(int lever) {
        this.lever = lever;
    }

    public CongNhan(String name, String birthday, String sex, String address, int lever) {
        super(name, birthday, sex, address);
        this.lever = lever;
    }

    public int getLever() {
        return lever;
    }

    public void setLever(int lever) {
        this.lever = lever;
    }

    public void addCongNhan() {
        Scanner scanner = new Scanner(System.in);
        super.addCanBo();
        do {
            System.out.println("Nhập cấp bấc (Tối đa bậc 7): ");
            lever = scanner.nextInt();
        } while (lever > 7);
    }

    @Override
    public String toString() {
        return "---- Công nhân ----" + "\n" +
                super.toString() + "\n" +
                "Cấp bậc: " + lever + "\n";
    }
}
