public class Ex37 {
    public static void main(String[] args) {
        String str = "sdf";
        String left = String.format("|%-10s|", str);
        String right = String.format("|%10s|", str);
        String center = String.format("|%10s|", str);

        System.out.println(left);
        System.out.println(right);
        System.out.println(center);
    }
}
