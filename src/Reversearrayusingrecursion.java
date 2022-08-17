import java.util.Scanner;
public class Reversearrayusingrecursion {
    public static void DR(int[] arr,int index){
        if(index==arr.length){
            return;
        }
        DR(arr,index+1);
        System.out.println(arr[index]);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        DR(arr,0);
    }
}



