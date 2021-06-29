package ex6;

public class StringUtil {
    public static String rpad(String s, char c, int n){
        int zeros = n - s.length();
        StringBuilder sBuilder = new StringBuilder(s);
        for(int i = 0; i < zeros; i++){
            sBuilder.append(c);
        }
        s = sBuilder.toString();
        return  s;
    }
    public static String ltrim (String s){
        while (s.charAt(0) == ' ')
            s=s.substring(1);
        return s;
    }

    public static String rtrim (String s){
        while (s.charAt(s.length()-1) == ' ')
            s=s.substring(0, s.length()-1);
        return s;
    }

    public static String trim(String s){
        return StringUtil.ltrim(StringUtil.rtrim(s));
    }

    public static int indexOfN (String s, char c, int n){
        for (int i = 0; i < s.length(); i++) {
            if(c == s.charAt(i)){
                n--;
                if (n == 0)
                    return i;
            }
        }
        return -1;
    }
}
