import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr={3,1,5,4,2};
        int[] arr1={1,2,3,4,5};
        bubbleSort(arr1);
        System.out.println(Arrays.toString(arr1));
          

    }
    static int bubbleSort(int [] arr)
    {
      boolean swapped=true; ;
        for(int i=0;i<arr.length-1;i++)
        {
            swapped = false; // Reset swapped for each outer loop iteration
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped =true; // Set swapped to true if a swap occurs
                }
            }
        }
        if(swapped== true) {
            System.out.println("Array is already sorted");
            return 1; // Return 1 if no swaps were made, indicating the array was already sorted
        }
        return 0; // Return 0 if swaps were made, indicating the array was sorted
    }
}
