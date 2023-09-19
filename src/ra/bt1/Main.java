package ra.bt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//  bt 1:  Hiển thị lời chào
//        System.out.println("Enter your name");
//        String name = new Scanner(System.in).nextLine();9
//        System.out.println("Hello " + name);

//  bt 2: Chuyển đổi tiền tệ USD sang VND
        System.out.println("Hãy nhập giá trị tiền USD");
        int money = new Scanner(System.in).nextInt();
        int vnd = money * 23000;
        System.out.println("Giá trị VND là " + vnd);

    }
}
