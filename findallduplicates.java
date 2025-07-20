import java.util.ArrayList;
import java.util.List;

public class findallduplicates {
    public static void main(String[] args) {
        
    }
     public List<Integer> findDuplicates(int[] arr) {
         int i=0;
    while(i<arr.length)
    {
        int correctIndex= arr[i]-1;
        if( arr[i]!=arr[correctIndex])
        {
            swap(arr,i,correctIndex);
        }
        else
        {
            i++;
        }
    }
     List<Integer> ans= new ArrayList<>();
    for(int m=0;m<arr.length;m++)
    {
        if(arr[m]!=m+1)
        {
            ans.add(arr[m]);
        }
    }
    return ans;

}



       
    
    static void swap(int [] arr, int first, int second )
{
    int temp=arr[first];
    arr[first]=arr[second];
    arr[second]=temp;
}
    }

