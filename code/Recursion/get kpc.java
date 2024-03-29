import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String>ans = getKPC(str);
        System.out.println(ans);
    }
  static String codes[] = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str) {
        if(str.length() == 0){
            ArrayList<String>bres = new ArrayList<>();
            bres.add(" ");
            return bres;
        }
        
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String>rres = getKPC(ros);
        
        ArrayList<String>mres = new ArrayList<>();
        String code = codes[ch - '0']; //ascii value of zero is 48.
        for(int i=0;i<code.length();i++){
            char ah = code.charAt(i);
            for(String rstr : rres){
                mres.add(ah + rstr);
            }
        }
        return mres;
    }

}
