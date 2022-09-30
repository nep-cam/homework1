import java.util.Scanner;

public class Exe9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String str = sc.nextLine();
        //str = str.substring(1);
        System.out.println("cat chuoi:" + catChuoi(str, 1));
    }

    public static String catChuoi(String str, int indexBegin) {
        char[] charArray = str.toCharArray();
        char[] arrayCopy = new char[charArray.length - indexBegin];
        for (int i = 0; i < arrayCopy.length; i++) {
            arrayCopy[i] = charArray[i + indexBegin];
        }
        str = String.valueOf(arrayCopy);
        return str;
    }
}
