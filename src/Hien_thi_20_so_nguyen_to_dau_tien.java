import java.util.Scanner;

public class Hien_thi_20_so_nguyen_to_dau_tien {
    static boolean checkPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số số nguyên tố đầu tiên");
        int number = input.nextInt();
        int count = 0;
        int i = 0;
        while (number != count) {
            if (checkPrime(i)) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }


}
