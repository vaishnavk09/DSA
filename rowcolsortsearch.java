import java.util.Arrays;

public class rowcolsortsearch {
    public static void main(String[] args) {
        int[][] arr={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        System.out.println(Arrays.toString(search(arr,50   )));
    }

    static int[] search(int[][] arr,int target){
        int r=0;
        int c=arr.length-1;

        while(r<arr.length&& c>=0){
           if(arr[r][c]==target){
            return new int[]{r,c};

           }
           if(arr[r][c]>target){
            c--;
           }
           else{
            r++;
           }
        }
return new int[]{-1,-1};
    }
}
