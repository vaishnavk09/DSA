public class mountainpeak {
    //https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 0};
        int [] arr1={1,2,3,5,6,4,3,2};
        System.out.println(peakIndexInMountainArray(arr1));
    }
static int peakIndexInMountainArray(int []arr)
{
    int start = 0;
    int end = arr.length - 1;
    while (start<end){
    int mid=start + (end - start) / 2;
    if(arr[mid]>arr[mid+1]) //we are in the descending /decreasing part of the array
    {
        end=mid; //we will look in the left part of the array

    }
    else{
        start=mid+1; // we are in the ascending/increasing part of the array

    }
   

    }
    return start;
}
    
}
