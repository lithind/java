import java.util.Scanner;
public class even_position{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int[] arr=new int [10];
        System.out.print("Enter size of array:"); 
        int size= sc.nextInt();
        System.out.print("Enter elements of array:");
        System.out.print("\n");    
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("The elements of  array present on even position:"); 
        System.out.print("\n"); 
        for(int i=0;i<size;i++)
        {
            if(i%2==0)
            {
                System.out.print(arr[i]+"\n");
            }
             
        }
    }
} 
