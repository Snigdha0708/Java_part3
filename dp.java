import java.util.Scanner; 
public class dp{
  public static void main(String[] args) 
    {
       Scanner s=new Scanner(System.in);
    int my_array[]=new int[10];
for(int k=0;k<10;k++)
my_array[k]=s.nextInt();
 
        for (int i = 0; i < my_array.length-1; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
                if ((my_array[i] == my_array[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+my_array[j]);
                }
            }
        }
    }    
}