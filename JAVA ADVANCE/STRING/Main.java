public class Main{
    public static String removepart(String str , String sub){
        // Search and remove the String
        while (str.contains(sub)){
            int index = str.indexOf(sub);
            str = str.substring(0,index) + str.substring(index +     sub.length());
        }
        return str;
    }
    public static void main(String[] args){
        String str = "ababcdabcf";
        String sub = "ab";
        String ans = removepart(str, sub);
        System.out.println(ans);
    }
}