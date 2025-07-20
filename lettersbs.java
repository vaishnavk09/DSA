public class lettersbs {
    


    public static void main(String[] args) {
        char []letters={'a','b','j','k'};
       System.out.println(BS(letters,'b'));


        
    }
    static  char BS(char []arr, char target)
    {
        int start =0;
        int end=arr.length-1;
        int mid ;
       
       while(start<=end)
       {
         mid =start+(end-start)/2;
        

         if(target<arr[mid])
            {
                end=mid-1;
            }
             
        
            else
            {
                
                start=mid+1;

            }
            
            
        
       }
       return arr[start%arr.length];
      

    }
}
