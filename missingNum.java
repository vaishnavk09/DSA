public class missingNum {
    public static void main(String[] args) {
        int [] arr={0};
        System.out.println(MissingNum(arr));
    }

    static int MissingNum(int [] arr)
    {
         int i=0;
    while(i<arr.length)
    {
        int correctIndex= arr[i];
        if(arr[i]<arr.length && arr[i]!=arr[correctIndex])
        {
            swap(arr,i,correctIndex);
        }
        else
        {
            i++;
        }
    }

    for(int j=0;j<arr.length;j++)
    {
        if(arr[j]!=j)
        {
            return j;
        }
    }
    return arr.length;




       
    }
    static void swap(int [] arr, int first, int second )
{
    int temp=arr[first];
    arr[first]=arr[second];
    arr[second]=temp;
}
}
