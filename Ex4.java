public class Ex4 {
    public static void main(String[] args) {
        String str = "restart";
        String str1 = str.substring(1);
        str1 = str.charAt(0) + str1.replace(str.charAt(0), '$');
        System.out.println(str1);
    }
}
