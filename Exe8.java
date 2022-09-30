import java.util.Scanner;

public class Exe8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String str = sc.nextLine();
        //str = str.toUpperCase();
        System.out.println("So ky tu thuong: " + demKyTuThuong(str));
    }

    public static int demKyTuThuong(String str) {
        int number = 0;
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 97 && charArray[i] <= 122) {
                number++;
            }
        }
        return number;
    }
}
