package ra.bt7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//         Chuyển đổi số thành chữ
        System.out.println("Hãy nhập số");
        int number = new Scanner(System.in).nextInt();

        if(number >= 0 && number <= 9){
            switch (number){
                case 0:
                    System.out.println("không");
                    ;break;
                case 1:
                    System.out.println("một");
                    break;
                case 2:
                    System.out.println("hai");
                    break;
                case 3:
                    System.out.println("ba");
                    break;
                case 4:
                    System.out.println("bốn");
                    break;
                case 5:
                    System.out.println("năm");
                    break;
                case 6:
                    System.out.println("Sáu");
                    break;
                case 7:
                    System.out.println("bảy");
                    break;
                case 8:
                    System.out.println("tám");
                    break;
                case 9:
                    System.out.println("chín");
                    break;
                default:
                    break;
            }
        }else {
            System.out.println("Số không hợp lệ");
        }


    }
}
