import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String str = sc.nextLine();
        //str = str.toUpperCase();
        System.out.println("In chuoi da viet hoa" + upperCase(str));
    }

    public static String upperCase(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 97 && charArray[i] <= 122) {
                charArray[i] -= 32;
            }
        }
        str = String.valueOf(charArray);
        return str;
    }
}
