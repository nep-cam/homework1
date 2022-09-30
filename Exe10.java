import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String str = sc.nextLine();
        String strNum = mangSo(str);
        char[] charNum = strNum.toCharArray();

    }

    public static String mangSo(String str) {
        String strNumber = "";
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 48 && charArray[i] <= 57) {
                strNumber += charArray[i];
            }
        }
        return strNumber;
    }
}
