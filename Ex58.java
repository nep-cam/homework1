public class Ex58 {
    public static void main(String[] args) {
        String str = "Truong Dai hoc Xay dung Ha Noi";
        String space = "";
        for(int i = 0; i< str.length(); i++){
            if(str.charAt(i)== ' '){
                space += " ";
            }
        }
        String newStr = space + str.replace(" ", "");
        System.out.println(newStr);
    }
}
