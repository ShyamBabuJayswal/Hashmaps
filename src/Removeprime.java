import  java.util.*;
import  java.io.*;
public class Removeprime {
    public static boolean isPrime(int val){
     for(int i=2;i*i<=val;i++){
       if(val%2 == 0){
           return false;
       }
    }
     return true;
}
   public static void  solution(ArrayList<Integer> al){
        for(int j=al.size()-1;j>=0;j--){
            int val =al.get(j) ;
            if(isPrime(val) == true){
                al.remove(j);
            }
        }
   }
public static  void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int k=0;k<n;k++){
           al.add(sc.nextInt());
        }
        solution(al);
    System.out.println(al);
}
}
