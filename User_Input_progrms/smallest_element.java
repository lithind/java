import java.util.Scanner;
public class smallest_element{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of array:"); 
        int size= sc.nextInt();
        int[] arr=new int [size];
        System.out.print("Enter elements of array:");
        System.out.print("\n");    
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int small=arr[0];
        for(int i=1;i<size;i++)
        {

            if (small>arr[i])
            {
                small=arr[i];
            }
        }
        System.out.print("smallest element of array is:"+small); 
    }
} 
