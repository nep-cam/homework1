public class ReplaceString {
    public static void main(String[] args) {
        String str = "java asfasdv szdsfnjava jsdfjava";
        System.out.println(replaceString(1, "java", str));
        System.out.println(replaceString(10, "java", str));
        System.out.println(replaceString(-1, "java", str));
    }
    public static String replaceString(int index, String strReplace, String str) {

        String[] arrayStr = str.split(strReplace);
        int count = arrayStr.length - 1;
        boolean end = str.endsWith(strReplace);
        if (end) {
            count++;
        }
        String[] arrayReplace = new String[count];
        for (int i = 0; i < count; i++) {
            arrayReplace[i] = strReplace;
        }

        if (index < 0) {
            arrayReplace[0] = "$";
        } else if (index > (count - 1)) {
            arrayReplace[count - 1] = "$";
        } else {
            arrayReplace[index] = "$";
        }

        String kqua = "";
        int i =0 , j = 0;
        while (i< arrayStr.length ){
            kqua += arrayStr[i];
            i++;
            if (j <arrayReplace.length){
                kqua += arrayReplace[j];
                j++;
            }
        }
        return kqua;
    }
}
