public class Ex28 {
    public static void main(String[] args) {
        String str = "Asdf\najshdfj\njbjfba";
        String newStr = "java" + str.replace("\n", "\njava");
        System.out.println(str);
        System.out.println(newStr);
    }
}

