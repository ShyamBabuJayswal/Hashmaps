import java.util.Scanner;
public class firstindexofoccurence {
    public static int firstindex(int [] arr,int idx,int x){
        if(idx==arr.length-1){
            return -1;
        }
        if(arr[idx]==x){
            return idx;
        }
        else{
            int fissa=firstindex(arr,idx+1,x);
            return fissa;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        int occ=firstindex(arr,0,3);
        System.out.println(occ);
    }
}
