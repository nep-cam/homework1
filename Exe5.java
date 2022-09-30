import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String str = sc.nextLine();
        System.out.println("So ky tu o vi tri le: " + demVTriLe(str));
    }

    public static int demVTriLe(String str) {
        int number = 0;
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (i % 2 != 0) {
                number++;
            }
        }
        return number;
    }
}
