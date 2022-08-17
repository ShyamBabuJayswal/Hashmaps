import  java.util.Scanner;
public class Power {

    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int f1=power(x,n-1);
        int f2=x*f1;

        return  f2;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int f=  power(x,n);
        System.out.println(f);
    }
}

