public class infinitearr {
    // https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170,180,600,700,800,900,908};
        int target = 100;
        int answ = ans(arr, target);
        System.out.println(answ);
    }

    static int ans(int []arr,int target)
    {
        int start=0;
        int end=1;

        while (target>arr[end]) {
            int temp=end+1;

             end=end+(end-start+1)*2;
             start=temp;
            
        }
        return binarySearch(arr, target, start, end);
    }

    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target,int start, int end) {
        

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
    
    

