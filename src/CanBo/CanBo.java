package CanBo;

import java.util.Scanner;

public class CanBo {
    private String name;
    private String birthday;
    private String sex;
    private String address;

    public CanBo() {
    }

    public CanBo(String name, String birthday, String sex, String address) {
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public boolean setSex(String sex) {
        if (sex.equals("Nam") || sex.equals("Nữ") || sex.equals("Nu")
                || sex.equals("nam") || sex.equals("nữ") || sex.equals("nu")) {
            this.sex = sex;
            return true;
        } else {
            return false;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addCanBo() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        name = scanner1.nextLine();
        System.out.println("Nhập ngày sinh (dd/MM/yyyy): ");
        birthday = scanner.nextLine();
        while (birthday.length() < 8) {
            System.out.println("Nhập ngày sinh (dd/MM/yyyy): ");
            birthday = scanner.nextLine();
        }
        while (true) {
            System.out.print("Nhập giới tính (Nam/Nữ): ");
            sex = scanner1.nextLine();
            boolean check = setSex(sex);
            if (check) {
                break;
            }
        }
        System.out.println("Nhập địa chỉ: ");
        address = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Họ tên: " + name + "\n" +
                "Tuổi: " + birthday + "\n" +
                "Giới tính: " + sex + "\n" +
                "Địa chỉ: " + address + "\n";
    }

}
