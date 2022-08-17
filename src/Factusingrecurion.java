import java.util.Scanner;
public class Factusingrecurion {
    public static int Fact(int n){
        if(n==1){
            return 1;
        }
       int f1=Fact(n-1);
        int f2=n*f1;

    return  f2;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      int f=  Fact(n);
        System.out.println(f);
    }
}
