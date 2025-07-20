import java.util.Scanner;

public class mulDimArr {
    public static void main(String[] args){

        int [][]arr =new int[3][3];
      Scanner sc = new Scanner(System.in);
        System.out.println("enter elements of 2D array:");

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
               arr[i][j]=sc.nextInt();
            }
        }
        for (int[] is : arr) {
            System.out.println(java.util.Arrays.toString(is));
            
        }
         sc.close();
         
    }
}
