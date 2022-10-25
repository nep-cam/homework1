import static java.lang.Character.isUpperCase;

public class Ex21 {
    public static void main(String[] args) {
        String str = "ASDfasf";
        char[] array = str.toCharArray();
        int count = 0;
        for (int i=0; i<4; i++){
            if (isUpperCase(array[i])){
                count ++;
            }
        }
        if(count >=2){
            str.toUpperCase();
        }
        System.out.println(str);
    }
}
