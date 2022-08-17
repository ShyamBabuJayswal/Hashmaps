import java.io.*;
import java.util.*;
public class Getsubsequence {
    public static ArrayList <String> ss(String str){
        if(str.length()==0){
            ArrayList<String> bres=new ArrayList<>();
            bres.add(" ");
            return bres;
        }
        char ch=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String> rres=ss(ros);
        ArrayList<String> mstr=new ArrayList<>();
        for(String rrtr: rres){
            mstr.add(" "+rrtr);
            mstr.add(ch+rrtr);

        }

    return mstr;}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
       ArrayList<String> ans= ss(str);
        System.out.println(ans);
    }
}
