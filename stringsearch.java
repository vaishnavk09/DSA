import java.lang.*;
public class stringsearch {
    public static void main(String[] args) {
        String name= "vaishnav";
        char target='s';
       
        char startC ='a';
        char endC ='n';
        int start=name.indexOf(startC);
         int end=name.indexOf(endC);
 System.out.println(strsearch(name, target,start,end));
        // System.out.println(start);
       // System.out.println(end);

    }
     static  int  strsearch(String str, char target, int start, int end )
        {
            
        for(int i =start ;i<end+1 ;i++)
        {
            if(target==str.charAt(i))
            {
                System.out.println("char present");
                return 0;
            }
            else{

                  System.out.println("char not present");
            }
          
        }
        return 700;
      
        

                
        }
}
