import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class threesum15 {
    public static void main(String[] args) {
        int [] arr={-2,0,-1,-1,-2,-2,0,0,0,2,2,2,-1};
        System.out.println(threeSum(arr));
    }
    public static List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(i > 0 && arr[i]==arr[i-1]) continue;
            int j=i+1;
            int k=arr.length-1;
            while(j<k)
            {
                int sum= arr[i]+arr[j]+arr[k];
                if(sum<0)
                {
                    j++;
                }
                else if(sum>0)
                {
                    k--;
                }
                else
                {
                    result.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    j++;
                    k--;
                    // Skip duplicates for j
                    while(j < k && arr[j] == arr[j-1]) j++;
                    // Skip duplicates for k
                    while(j < k && arr[k] == arr[k+1]) k--;
                }
            }
        }

        return new ArrayList<>(result);
    }
}