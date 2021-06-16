import java.util.Scanner;
public class no_of_element{
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
        System.out.print("Array elements are:"); 
        System.out.print("\n"); 
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+"\n"); 
        }
        int count=0;
        while(count<size)
        {
            count=count+1;
        }
        System.out.print("Number of  elements of array is:"+count);

    }
} 
