package ra.bt6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//     Kiểm tra 1 số có chia hết cho 3 và 5.

        System.out.println("Nhập số");
        int number = new Scanner(System.in).nextInt();
        if(number % 3 == 0 && number % 5 == 0){
            System.out.println(number + " Chia hết cho cả 3 và 5");
        } else if (number % 3 == 0 && number % 5 != 0) {
            System.out.println(number + " Chỉ chia hết cho cả 3");
        } else if (number % 3 != 0 && number % 5 == 0) {
            System.out.println(number + " Chỉ chia hết cho cả 5");
        }else {
            System.out.println(number + " Không chia hết cho 3 và 5");
        }
    }
}
