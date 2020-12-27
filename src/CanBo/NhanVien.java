package CanBo;

import java.util.Scanner;

public class NhanVien extends CanBo{
    private String job;

    public NhanVien() {
    }

    public NhanVien(String job) {
        this.job = job;
    }

    public NhanVien(String name, int birthday, String sex, String address, String job) {
        super(name, birthday, sex, address);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void addNhanVien() {
        Scanner scanner = new Scanner(System.in);
        super.addCanBo();
        System.out.println("Nhập công việc của nhân viên: ");
        job = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "---- Nhân viên ----" + "\n" +
                super.toString() + "\n" +
                "Thông tin công việc: " + job + "\n";
    }

}
