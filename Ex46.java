import java.util.ArrayList;

public class Ex46 {
    public static void main(String[] args) {
        String str = "The quick brown for jumps over the lazy dog.";
        String[] arrayStr = str.split(" ");
        for(String item : arrayStr){
            System.out.print("'"+item +"', ");
        }
    }
}
