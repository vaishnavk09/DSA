import java.util.*;
public class MdArrList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer> >list=new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            list.add(new ArrayList<>());
        }
         for (int i=0;i<3;i++)
         {
            for(int j=0;j<3;j++)
            {
                System.out.println("enter element for row "+i+" and column "+j);
                list.get(i).add(sc.nextInt());
            }
         }
         sc.close();
         System.out.println(list);

        }
        }

