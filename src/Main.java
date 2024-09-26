import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhận đầu vào từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên thứ nhất
        System.out.print("Nhập số nguyên thứ nhất: ");
        int number1 = scanner.nextInt();

        // Nhập số nguyên thứ hai
        System.out.print("Nhập số nguyên thứ hai: ");
        int number2 = scanner.nextInt();

        // Tính tổng hai số
        int sum = number1 + number2;

        // In kết quả
        System.out.println("Tổng của hai số là: " + sum);

        // Đóng đối tượng Scanner
        scanner.close();
    }
}
