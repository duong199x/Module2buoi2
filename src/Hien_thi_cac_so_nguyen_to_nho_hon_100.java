public class Hien_thi_cac_so_nguyen_to_nho_hon_100 {
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
        for (int i = 0; i < 100; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
