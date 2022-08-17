import java.util.*;
public class permutationofstring {
 public static void Solution(String str){
     int n=str.length();
     int f=Fact(n);
     for(int i=0;i<f;i++){
      StringBuilder sb=new StringBuilder(str);
      for(int div=n;div>=1;div--){
         int temp = i;
         int q=temp/div;
         int r=temp%div;
          System.out.print(sb.charAt(r));
          sb.deleteCharAt(r);
        temp=q;
      }
         System.out.println();
     }
 }

 public static int Fact(int n){
     int val=1;
     for(int i=1;i<=n;i++){
         val *= i;
     }

 return val;}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String str=sc.next();
       Solution(str);

 }
}
