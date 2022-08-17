import java.util.Scanner;
public class Displayusingrecursion {
    public static void Display(int []arr,int index ){
        if(index==arr.length){
            return;
        }
        System.out.println(arr[index]);
        Display(arr,index+1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Display(arr,0);
    }
}
