package CanBo;

import java.util.Scanner;

public class KySu extends CanBo {
    private String trainingIndustry;

    public KySu() {
    }

    public KySu(String trainingIndustry) {
        trainingIndustry = trainingIndustry;
    }

    public KySu(String name, String birthday, String sex, String address, String trainingIndustry) {
        super(name, birthday, sex, address);
        trainingIndustry = trainingIndustry;
    }

    public String getTrainingIndustry() {
        return trainingIndustry;
    }

    public void setTrainingIndustry(String trainingIndustry) {
        trainingIndustry = trainingIndustry;
    }

    public void addKySu() {
        Scanner scanner = new Scanner(System.in);
        super.addCanBo();
        System.out.println("Nhập ngành đào tạo: ");
        trainingIndustry = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "---- Kỹ Sư ----" + "\n" +
                super.toString() + "\n" +
                "Ngành đào tạo: " + trainingIndustry + "\n";
    }
}
