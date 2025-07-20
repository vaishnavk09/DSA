import java.util.Arrays;

public class search2darray {
    public static void main(String[] args) {
        int [][] arr={{12,21,42,24},
                       {31,13,87,78},
                    {90,100}};
            //  int[] ans=search(arr, 87);
             System.out.println(Arrays.toString(search(arr,87)));

    }
    static int[] search(int[][]arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==target)
                {
                    return new int[]{i,j};

                }
            }
        }
        return new int []{-1,-1};

    }
}
