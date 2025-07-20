public class binarysearch {
    public static void main(String[] args) {
        int[] arr={12,43,122,160,766};
        int min=0;
        int max=arr.length-1;
        System.out.println(binsearch(arr, 76, min, max));

    }
    static int binsearch(int []arr, int target, int min , int max )
    
    {
        int mid =min+(max-min)/2;
        if(max>=min){
            if(arr[mid]==target)
            {
                return mid;

            }
            else if(target<arr[mid]){
              return  binsearch(arr, target, min, mid-1);
        }
        else if(target>arr[mid])
        {
            return binsearch(arr, target, mid+1, max);
        }

            
        }
        return Integer.MIN_VALUE;



    }
}
