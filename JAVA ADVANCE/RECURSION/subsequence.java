import java.util.ArrayList;

public class subsequence{
public static void getallsubsequences(String s, int index, StringBuilder output, List<String> ans){
    if(index >= s.length()){
        String subsequence = output.toString();
        ans.add(subsequence);
        char ch = s.charAt(index);
        // include
        output.append(ch);
        getallsubsequences(s, index + 1, output, ans);
        // exclude 
        output.deleteCharAt(output.length()-1);
        getallsubsequences(s, index+1, output, ans);
    }
}


    public List<String> powerset(String s){
        List<String> ans = new ArrayList<>();
        StringBuilder output = new StringBuilder();
        int index = 0;
        getallsubsequences(s, index, output, ans);
        return ans;
    }
}
