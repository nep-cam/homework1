import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String str = sc.nextLine();
        System.out.println("So ky tu so: " + demSo(str));
    }

    public static int demSo(String str) {
        int number = 0;
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 48 && charArray[i] <= 57) {
                number++;
            }
        }
        return number;
    }
}
