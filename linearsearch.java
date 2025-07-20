import java.util.*;
public class linearsearch {
    public static void main(String[]args)
    {
        //search in the array : return index if item found
        //otherwise return -1}
        System.out.println("enter size of array");
        int arr[]=new int [5];
        System.out.println("enter elements:");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
             arr[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        
        lsearch(arr,3); 
        sc.close();
        
    } 

     static int lsearch(int[] arr, int target)
        {
           for (int i=0;i<arr.length;i++)
           {
            if(arr[i]== target)
            {
                System.out.println("element found at:"+i);

                return i;
            }
           }
           return -1;
        }
}
