import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String str = sc.nextLine();
        System.out.println("So ky tu in hoa: " + demInHoa(str));
    }

    public static int demInHoa(String str) {
        int number = 0;
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 65 && charArray[i] <= 90) {
                number++;
            }
        }
        return number;
    }
}
