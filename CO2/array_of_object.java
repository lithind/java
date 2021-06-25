import java.util.Scanner;
class Employee
{
    int eNo;
    String eName;
    int eSalary;
    
    public void setdata(int No,String Name,int salary)
    {
        eNo=No;
        eName=Name;
        eSalary=salary;
    }

    public void printDetails() 
    {   System.out.println("_____________________________________________");
        System.out.println("Employee Id : " + eNo);
        System.out.println("Employee Name : " + eName);
        System.out.println("Employee Salary : " +eSalary);
    }
}


public class array_of_object{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employyes : ");
        int total_emp = sc.nextInt();
        Employee[] emp = new Employee[total_emp];
        for (int i = 0; i <total_emp; i++)
        {
            System.out.println("enter the details of Employee "+(i+1)+":");
            System.out.println("employee Id : ");
            int id = sc.nextInt();
            System.out.println("Enter Employee Name : ");
            String name = sc.next();
            System.out.println("Enter Salary : ");
            int salary = sc.nextInt();
            emp[i] = new Employee();//allocating memmory for each object
            
            emp[i].setdata(id,name,salary);
        }
        System.out.println("_____________________________________________");

        for (int i = 0; i <total_emp ; i++)
         {
            emp[i].printDetails();
        }
        System.out.println("enter the employee_no to search:");
       int search_no=sc.nextInt();
       for(int i=1;i<total_emp;i++)
          {
      
           if(emp[i].eNo==search_no)
            {
            System.out.println("exist the employee with employee number "+search_no);

             emp[i].printDetails();
            }
       }
        
    }
}
// import java.util.Scanner;
// class Employee{
//    int eNo;
//    String eName;
//    int eSalary;
//    void GetData()
//          {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the employee id:");
//        eNo=Integer.parseInt(sc.nextLine());
//        System.out.println("enter the employee name:");
//        eName=sc.nextLine();
//        System.out.println("enter the employee salary:");
//        eSalary=Integer.parseInt(sc.nextLine());
// }
//     void PutData()
//         {
//        System.out.println("\n\t"+eNo+"\t"+eName+"\t"+eSalary);
//         }
// public static void main(String args[])
//       {
//       int no;
//       Scanner sc=new Scanner(System.in);
//       System.out.println("enter the number of employee:");
//       int n=sc.nextInt();
//       Employee[] emp=new Employee[n];
//       for(int i=0;i<n;i++)
//          {
//       emp[i]=new Employee(); //allocating memmory for each object
//          }
//       for(int i=0;i<n;i++)
//       {
//         System.out.println("enter the details of"+(i+1)+"Employee:");
//         emp[i].GetData();
//        }
//        System.out.println("the employee datils are:");
//        for(int i=0;i<n;i++)
//        emp[i].PutData();
//        System.out.println("enter the employee_no to search:");
//        no=sc.nextInt();
//        for(int i=0;i<emp.length;i++)
//           {
      
//            if(emp[i].eNo==no)
//             {
//              emp[i].PutData();
//             }
//        }
//    }

// }