package ra.bt2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Tính chu vi và diện tích hình vuông
        System.out.println("Nhập chiều dài");
        int chieudai =Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Nhập chiều rộng");
        int chieurong = Integer.parseInt(new Scanner(System.in).nextLine());
//        diện tích hình chữ nhật
        System.out.println(chieudai * chieurong);
//        chu vi hình chữ nhật
        System.out.print((chieudai + chieurong)*2);
    }
}
