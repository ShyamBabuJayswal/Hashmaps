import java.util.Scanner;
public class zigzag {
    public static void zig(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        zig(n-1);
        System.out.println(n);
        zig(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
         zig(n);
      //  System.out.println(n);
    }
}
