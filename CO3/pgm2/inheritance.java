// // Create a class ‘Employee’ with data members Empid, Name, Salary, Address and
// // constructors to initialize the data members. Create another class ‘Teacher’ that inherit the
// // properties of class employee and contain its own data members department, Subjects taught
// // and constructors to initialize these data members and also include display function to
// // display all the data members. Use array of objects to display details of N teachers.
// import java.util.Scanner;
// class Employee
// {
//     int  Empid;
//     String Name;
//     int Salary;
//     String Address;
// Employee(int Empid,String Name,int Salary,String Address)
// {
//     this.Empid=Empid;
//     this.Name=Name;
//     this.Salary=Salary;
//     this.Address=Address;   
// }
// }
// class Teacher extends Employee
// {
//     String Subjects [];
//     String Department;
//     Teacher(String[] Subjects,String Department,int Empid,String Name,int Salary,String Address)
//     {
//         super(Empid,Name,Salary,Address);
//         this.Subjects=Subjects;
//         this.Department=Department;
//     }
//     void display()
//     {
//         System.out.println("\n\tEmployee id : "+ Empid);
//         System.out.println("\n\tEmployee Name : "+ Name);
//         System.out.println("\n\tEmployee Address : "+ Address);
//         System.out.println("\n\tEmployee Salary : "+ Salary);
//         System.out.println("\n\tDepartment : "+ Department);
//         System.out.print("\n\tSubjects Tought : "+ Subjects[0]);
//         for (int i=1;i<Subjects.length;i++){
//             System.out.print(", "+Subjects[i]);
//         }
//         System.out.println("\n\t______________________\n");
//     }

// }
// class inheritance{
//     public static void main(String[] args)
//     {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of teachers : ");
//         int limit=sc.nextInt();
//         Teacher[] t = new Teacher[limit];
//         for(int i=0; i<limit; i++)
//         {
//             System.out.print("\nEnter the Employee Id : ");
//             int Eid = sc.nextInt();
//             System.out.print("Enter the Employee Name : ");
//             String name = sc.next();
//             System.out.print("Enter the Employee Address : ");
//             String Add = sc.next();
//             System.out.print("Enter the Salary : ");
//             int salary = sc.nextInt();
//             // sc.nextLine();
//             System.out.print("Enter the Department : ");
//             String Dept = sc.next();
//             System.out.print("Enter the Number of Subjects tought by the teacher : ");
//             int num = sc.nextInt();
//             // sc.nextLine();
//             String[] sub= new String[num];
//             System.out.print("Enter the Subjects tought by the teacher : ");
//             for(int j=0;j<num;j++)
//             {
//                 sub[j] = sc.next();
//             }

//             t[i] = new Teacher(Dept,sub,Eid,name,Add,salary);

//         }
//         for(int i=0;i<t.length;i++){
//             System.out.println("\n\tDetails of a Teacher");
//             System.out.println("\n\t______________________\n");
//             t[i].display();
//         }
        

//     }
// }

import java.util.Scanner;
class Employee
     {
      int empid;
      String name;
      int salary;
      String address;
      Employee()
        {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the empid : ");
         empid=sc.nextInt();
         System.out.println("Enter the name : ");
         name=sc.next();
         System.out.println("Enter the salary : ");
         salary=sc.nextInt();
         System.out.println("Enter the address : ");
         address=sc.next();
        }
}
class Teachers extends Employee
      {
       String department;
       String subject;
       Teachers()
        {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the department : ");
         department=sc.next();
         System.out.println("enter subject taught : ");
         subject=sc.next();
        }
void display()
       {
        System.out.println("Empid : "+super.empid);
        System.out.println("Name : "+super.name);
        System.out.println("Salary : "+super.salary);
        System.out.println("Address : "+super.address);
        System.out.println("Department : "+department);
        System.out.println("Subject taught : "+subject);
        System.out.println();
       }
}
public class inheritance
   {
    public static void main(String args[])
     {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of Teachers : ");
      int n=sc.nextInt();  
      Teachers obj[]=new Teachers[n];
      for(int i=0;i<n;i++)
        {
          obj[i]=new Teachers();
        }
      for(int i=0;i<n;i++)
        {
          obj[i].display();
        }
   }
 }
