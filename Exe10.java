import java.util.ArrayList;
import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String str = sc.nextLine();
        ArrayList<Integer> listNumber = new ArrayList<>();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 48 && charArray[i] <= 57) {
                listNumber.add(Integer.parseInt(String.valueOf(charArray[i])));
            }
        }
        System.out.print("Mang so: ");
        for (int i = 0; i < listNumber.size(); i++) {
            System.out.print(listNumber.get(i) + " ");
        }
    }
}
