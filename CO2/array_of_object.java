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
    {
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
            System.out.println("employee Id : ");
            int id = sc.nextInt();
            System.out.println("Enter Employee Name : ");
            String name = sc.next();
            System.out.println("Enter Salary : ");
            int salary = sc.nextInt();
            emp[i] = new Employee();
            emp[i].setdata(id,name,salary);
        }
        for (int i = 0; i <total_emp ; i++)
         {
            emp[i].printDetails();
        }
        


    }
}
// import java.util.Scanner;

// class Student {

//     private String name;
//     private int marks;

//     public void setDetails(String n, int m) {
//         name = n;
//         marks = m;
//     }

//     public void printDetails() {
//         System.out.println("Name: " + name);
//         System.out.println("Marks: " + marks);
//     }
// }

// class array_of_object {

//     public static void main(String[] args) {
//         // declaring array of objects
//         Student[] st = new Student[2];

//         // initializing array
//         Scanner s = new Scanner(System.in);

//         for (int i = 0; i < 2; i++) {
//             System.out.println("Student " + (i + 1));
//             System.out.println("Enter name");
//             String name = s.next();
//             System.out.println("Enter marks");
//             int marks = s.nextInt();

//             st[i] = new Student();
//             st[i].setDetails(name, marks);
//         }

//         // printing details of the objects
//         for (int i = 0; i < 5; i++) {
//             st[i].printDetails();
//         }
//     }
// }