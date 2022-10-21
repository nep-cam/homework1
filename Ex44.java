public class Ex44 {
    public static void main(String[] args) {
        String str= "java123";
        char [] charArray = str.toCharArray();
        for (char chr : charArray){
            System.out.println("Current character "+chr+" position at "+str.indexOf(chr));
        }
    }
}
