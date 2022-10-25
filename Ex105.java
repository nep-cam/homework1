public class Ex105 {
    public static void main(String[] args) {
        String str = "abcd abc aabc baa abcaa";
        String check = "abc";
        int count =0;
        for(int i = 0; i<(str.length()-check.length());i++){
            if(check.equals(str.substring(i, i+check.length()))){
                count++;
            }
        }
        System.out.println(count);
    }
}
