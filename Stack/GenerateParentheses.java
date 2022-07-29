package Stack;
import java.util.ArrayList;
import java.util.List;
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> outpArr=new ArrayList<>();
    backTrack(outpArr,"",0,0,n);
    
    return outpArr;
   }

public void backTrack(List<String> outpArr, String str, int open, int close, int max) {
   // TODO Auto-generated method stub
   if (str.length()==max*2) {
       outpArr.add(str);
       return;
   }
   if (open<max) {
       backTrack(outpArr, str+"(", open+1, close, max);
   }
   if (close<open) {
       backTrack(outpArr, str+")", open, close+1, max);
   }
     
}
}
