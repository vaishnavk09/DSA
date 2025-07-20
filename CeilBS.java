public class CeilBS {
    public static void main(String[] args) {
        int[]arr ={34,32,11,12,9};
        int []arr2={-99,1,2,67,87,89};
         int[]arr3 ={2,3,5,9,14,16,18};
        int ans=BS(arr,34);
        
        System.out.println(ans);
        System.out.println(BS(arr2,89));
         System.out.println(BS(arr3,15));


        
    }
    static  int BS(int []arr, int target)
    {
        int start =0;
        int end=arr.length-1;
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
