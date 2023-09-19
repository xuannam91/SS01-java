package ra.bt4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//         Tính điểm trung bình các môn học và xếp loại
        System.out.println("Nhập điểm môn Toán");
        float toan = new Scanner(System.in).nextFloat();

        System.out.println("Nhập điểm môn LY");
        float ly = new Scanner(System.in).nextFloat();

        System.out.println("Nhập điểm môn Hoá");
        float hoa = new Scanner(System.in).nextFloat();

        System.out.println("Nhập điểm môn Văn");
        float van = new Scanner(System.in).nextFloat();

        System.out.println("Nhập điểm môn Tiếng Anh");
        float anh = new Scanner(System.in).nextFloat();

        float trungbinh = (toan + ly + hoa + van + anh) / 5;
        System.out.println("Điểm trung bình là " + trungbinh);

//        xếp loại thành tích
        if (trungbinh >= 9.0) {
            System.out.println("Xếp loại: Xuất sắc");
        } else if (trungbinh >= 8.0) {
            System.out.println("Xếp loại: Giỏi");
        } else if (trungbinh >= 6.5) {
            System.out.println("Xếp loại: Khá");
        } else if (trungbinh >= 5.0) {
            System.out.println("Xếp loại: Trung bình");
        } else {
            System.out.println("Xếp loại: Yếu");
        }




    }
}
