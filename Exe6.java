import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String str = sc.nextLine();
        //str = str.toUpperCase();
        System.out.println("So ky tu o vi tri le: " + demKyTuDacBiet(str));
    }

    public static int demKyTuDacBiet(String str) {
        int number = 0;
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 33 && charArray[i] <= 47) {
                number++;
            }
            if (charArray[i] >= 58 && charArray[i] <= 64) {
                number++;
            }
            if (charArray[i] >= 91 && charArray[i] <= 96) {
                number++;
            }
            if (charArray[i] >= 123 && charArray[i] <= 126) {
                number++;
            }
        }
        return number;
    }
}
