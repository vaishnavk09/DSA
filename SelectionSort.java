public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static int selectionSort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
        int last=arr.length-i-1;
        int max =  getMaxIndex(arr,0, last);
        swap(arr, max, last);
        }
        return 0; // Return 0 to indicate a successful sort
    }


    static int getMaxIndex(int []arr, int start, int end){
        int max=start;
        for(int i=0;i<end;i++){
            if(arr[max]<arr[i]){
               max=i;
            }
        }
        return max;
    }

    static int swap(int [] arr, int first, int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
        return 0; // Return 0 to indicate a successful swap
    }
}
