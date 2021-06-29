package ex6;

public class Main {
    public static void main(String[] args) {
        System.out.println(StringUtil.rpad("nome", 'A', 10));
        System.out.println(StringUtil.ltrim("  nom e    "));
        System.out.println(StringUtil.rtrim("  nom e    "));
        System.out.println(StringUtil.trim("  nom e    "));
        System.out.println(StringUtil.indexOfN("John|Paul|George|Ringo", '|', 2));
    }
}
