import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        System.err.println("Đây là lỗi"); // Lưu ý khi sử dụng bất động bộ

        //    Hiển thị màu sắc  trong màn hình console và sử dụng icon
        System.out.println("\u001B[31mRed text");
        System.out.println("\u001B[32mGreen text");
        System.out.println("\u001B[33mYellow text");
        System.out.println("\u001B[34mBlue text");
        System.out.println("\u001B[35mPurple text");
        System.out.println("\u001B[36mCyan text 😢🤦‍♂️🤦‍♀️🤦‍♀️😜🤞✌️🤷‍♂️😁👍🙌😒😍😊😂🤣❤️⚛️♾️◀️🔼");
        System.out.println("\u001B[37mWhite text😊😂😂😂🤣🤣❤️");
//        Biến và kiểu dữ liệu
//        kiểu nguyên thuỷ
//        cú pháp: [kieu dữ liêu] [tên biến] = [Giá trị ]
        int number = 10;
        float fl = 5.9F;
        double db = 10.0;
        char ch = 'a';
        boolean check = true;
//        nếu giá trị là chuỗi thì sử dụng %s, nếu là số nguyên thì dùng %d
//        nếu là số thực th dụng %f, nếu các kiểu dữ liệu khác thi dùng %s
        System.out.printf("\u001B[32mnumber = %5d | fl = %5.2f | db = %5.2f | ch = %s | check = %-10s", number, fl, db, ch, check);
//        Kiểu dữ liệu tham chiếu
        String name = "Hồ Xuân Hùng"; // char [] khi thay đổi giá trị của 1 chuỗi thì taọ ra 1 mảng kí tự mới
        String str = name;
        name = "nam";

        Date date = new Date();
        System.out.println("Ngày tháng hiện tại là : " + date);
        System.out.println("Họ tên"+ name);


//        Scanner sc = new Scanner(System.in); // Đây là máy dùng để nhập dữ liệu từ màn hình console
//        Nhập chuỗi , số, số thực, boolean , byte , ....
//        System.out.println("Hãy nhập địa chỉ");
//        String adrress = sc.nextLine();
//        System.out.println("Địa chỉ: "+ adrress);
//        Nhập số
//        System.out.println("Hãy nhập 1 số");
//        int a =Integer.parseInt(sc.nextLine());
//        System.out.println("Số vừa nhập là : "+ a);
//        Lưu ý: Khi nhập số và chuỷen sang chuỗi thì bị nuốt dòng kế tiếp
//        System.out.println("Haỹ nhập vào 1 chuỗi");
//        String string = sc.nextLine();

//        Khai báo biến hằng
        final float PI = 3.14F; // không thể thay đổi giá trị

//        Toán tử
//        -- ++ dùng để tăng ,giảm giá trị
//        tiền tố : ++a hoặc -- a : Biểu thức này sẽ trả về giá trị của biến sau khi tăng , giảm
        int b = 10;
        System.out.println(--b); // 9

//        Toán tử 3 ngôi
//        (biểu thức logic) ? (đúng) : (sai)
//        Kiểm tra 1 số người dùng nhập vào là chẵn hay lẻ
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập vào 1 số");
        int number1 = sc.nextInt();
        String rs = (number1%2== 0)? "Số chẵn" : "số lẻ";
        System.out.println(rs);

//        câu lệnh điều kiện
//        chỉ có if
        if(false){
            System.out.println("thực hiện if");
        }
//        if ...else
//        kiểm ttra chẵn lẻ
        if(number1%2==0){
            System.out.println("Số chăn");
        }else {
            System.out.println("Số lẻ");
        }
//        Bậc thang
        float dtb = 7.0f;
        if(dtb<5.0){
//            yếu
        }else if(dtb<6.5){
//            trung bình
        }else if(dtb<7){
//             khá
        }else if(dtb<8){
//              giỏi
        }else {
//            Suất sắc
        }


//        if..else Lồng nhau. tính năm nhuận

//    Switch case
//    hiển thị số dư khi chia hết cho 5
        int so = 1997;
        int mod = so%5;
        switch (mod){
            case 0 :
                System.out.println("Chia hết");
                break;
            case 1 :
                System.out.println("Dư 1");
                break;
            case 2 :
                System.out.println("Dư 2");
                break;
            case 3 :
                System.out.println("Dư 3");
                break;
            case 4 :
                System.out.println("Dư 4");
                break;
            default:
                break;
        }








    }
}