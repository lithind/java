import java.util.Scanner;
class array_search{
    public static void main(String[] args){
        int flag=0;
        int position=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of array : ");
       int size=sc.nextInt();
        int[] arr=new int[size];               
        System.out.println("Enter the elements : ");

        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Search element of array : ");
        int element=sc.nextInt();
        System.out.println("Array elements are : ");
        for(int i=0;i<size;i++)
        {        
            System.out.println(arr[i]);


            if(arr[i]==element)
            {
                flag=1;
                position=i+1;
            }
        }
        if(flag==1)
        {
            System.out.println("Searching  element "+element+" is exist on "+position+" index on array");        }
        else
        {
            System.out.println("Searching  element "+element+" is not exist on  array");
        }

    }
}
