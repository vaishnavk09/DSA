 import java.util.*
 ;public class swap {
    public static void main(String[] args) {
        int[] arr= new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i =0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        Swap(arr,0,3);
         System.out.println(Arrays.toString(arr));

        }
    static void Swap(int[] arr,int id1, int id2)
    {
        int temp = arr[id1];
        arr[id1]=arr[2];
        arr[2]=temp;
    }
}
