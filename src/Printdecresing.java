import java.util.Scanner;
public class Printdecresing {
    public static void  PD(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
         PD(n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PD(n);

    }
}
