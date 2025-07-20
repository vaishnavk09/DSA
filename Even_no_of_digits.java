public class Even_no_of_digits {
    
   public static void main(String[] args) {
    int[] arr={13,14,1769,4,1,2};
    System.out.println(findNumbers(arr));
   }
    static int findNumbers(int[] nums) {
        int count= 0;
        for (int num:nums)
        {
           if( even(num))
           {
            count++;
           }

        }
        return count;
    }
    static boolean even(int num)
        {
            int nofdigits=digit(num);
            if(nofdigits%2==0)
            {
                return true;
            }
            else{
                 return false;
            }
        }
            static int digit(int num)
            { 
                int count=0;
                while(num>0)
                {
                    count++;
                    num=num/10;
                }
                return count;
            }
        
}

