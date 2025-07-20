public class findinpeak1095 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        System.out.println(findInMountainArray(target, arr));
    }

    static int findInMountainArray(int target, MountainArray arr)
    { int length=arr.length();

    
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

    static  int orderAgnosticBs(int []arr, int target,int start, int end)
    {
        
        int mid ;
       boolean ifasc= arr[start]<arr[end];

       while(start<=end)
       {
         mid =start+(end-start)/2;
        if(target==arr[mid])
        {
            return mid;
        }
        else if (ifasc==true)
        {
            if(target>arr[mid])
            {
                
                start=mid+1;

            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
             
            
        }
        else if (ifasc==false) {
            if(target<arr[mid])
            {
                
                start=mid+1;

            }
            else if(target>arr[mid])
            {
                end=mid-1;
            }
            
            
        }
        
       }
       return arr[start];
      

    }
}
