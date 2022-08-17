import  java.util.*;
public class StringwithAsciidifrrence {
    public static  String asciidi(String str){
        StringBuilder sb = new StringBuilder();
         sb.append(str.charAt(0));
         for(int i=1;i<str.length();i++){
             char curr = str.charAt(i);
             char prev = str.charAt(i-1);
             int gap = curr-prev;
             sb.append(gap);
             sb.append(curr);
         }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.next();
        System.out.print(asciidi(str));
    }}
