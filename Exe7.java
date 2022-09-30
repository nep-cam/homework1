import java.util.Scanner;

public class Exe7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String str = sc.nextLine();
        //str = str.trim();
        System.out.println("cat ky tu trang o dau chuoi:" + boKyTuTrang(str));
    }

    public static String boKyTuTrang(String str) {
        boolean kt = true;
        char[] charArray = str.toCharArray();
        int count = 0;      //bien dem so khoang trang dau chuoi
        while (kt) {
            if (charArray[count] == ' ') {
                count++;
            } else kt = false;
        }
        char[] arrayCopy = new char[charArray.length - count];
        for (int i = 0; i < arrayCopy.length; i++) {
            arrayCopy[i] = charArray[i + count];
        }
        str = String.valueOf(arrayCopy);
        return str;
    }
}
