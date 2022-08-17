import java.util.Scanner;

public class lastindexofoccurence {

        public static int lastidx(int [] arr,int idx,int x){
            if(idx==arr.length-1){
                return -1;
            }

                int lissa=lastidx(arr,idx+1,x);
            if(lissa==-1){
                if(arr[idx]==x) {
                    return idx;
                }else{
                    return -1;
                }}
                else{
                    return lissa;
                }
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int x=sc.nextInt();
            int occ=lastidx(arr,0,3);
            System.out.println(occ);
        }
    }


