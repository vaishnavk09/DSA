public class RotateCount {
    public static void main(String[] args) {
        int[] arr = {15,18,2,3,6,12};
        System.out.println(countRotations(arr));    
    }

    static int countRotations(int[]arr){
        int pivot=findPivot(arr);
        if(pivot==-1)
        {
            return 0;
        }
        return pivot+1;
    } 

    static int findPivot(int[]arr)
    {
        int start = 0;
        int end = arr.length - 1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid<end &&arr[mid]>arr[mid+1])
            {
                return mid; // pivot found
            }
            if(mid>start && arr[mid]<arr[mid-1])
            {
                return mid-1;

            }
            if(arr[start]>=arr[mid])
            {
                end=mid-1;

            }
            else
            {
                start=mid+1;
            }
        }
        return -1;
    }
}
