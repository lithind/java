// // Prepare bill with the given format using calculate method from interface.
// // Order No.
// // Date :
// // Product Id       Name        Quantity        unit price       Total
// // ____________________________________________________________________________
// //      101         A               2           25              50
// //      102         B               1           100             100
// // ____________________________________________________________________________
// //                                                  Net. Amount 150

// import java.util.*;                                       
// interface bill

// {
//     public void calculate();

// }
// class order implements bill
// {

//     int productid;
//     int quantity;
//     String name;
//     float price;
//     float total;
    
//     public void calculate()
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the product id : ");
//         productid=sc.nextInt();
//         System.out.println("Enter the name : ");
//         name=sc.next();
//         System.out.println("Enter the quantity : ");
//         quantity=sc.nextInt();
//         System.out.println("Enter the unit price : ");
//         price=sc.nextInt();
//         total=quantity*price;
//     }
//     public float billprint(float net_am)
//     {
//         return net_am=net_am+total;
//     }


// }
// class ProductBill
// {
//     public static void main(String args[]) {
//         Scanner sc=new Scanner(System.in);
//         // order o1=new order();
//         float net_am=0;
//         System.out.println("Enter number of product : ");
//         int count=sc.nextInt();
//         System.out.println("Enter the order number : ");
//         int order_number=sc.nextInt();
//         order o[]=new order[count];  
//         for (int i=0;i<count;i++)
//         {
//             System.out.println("_______________________________________");
//             System.out.println("___________product "+(i+1)+"___________ ");
//             System.out.println("_______________________________________");
//             o[i].calculate();
//         }
//         System.out.println("Order No : "+order_number);
//         System.out.println("Date  : "+java.time.LocalDate.now());
//         System.out.print("\nProduct Id\tName\tQuantity\tUnit price\t Total  \n");
//         System.out.println("_____________________________________________________________________________________\n");
//         for(int i=0;i<count;i++)
//         {
//             System.out.println(o[i].productid+"\t\t"+o[i].name+"\t  "+o[i].quantity+"\t\t   "+o[i].price+"\t\t  "+o[i].total);
//             net_am=o[i].billprint(net_am);
//         }
//         System.out.println("_____________________________________________________________________________________\n");
        
    
//         System.out.println("  Net. Amount  "+net_am);
//     }
// }










import java.util.*;                                       
interface bill

{
    public void calculate(int productid,int quantity,String name,float price,float total);

}
class order implements bill
{

    int productid;
    int quantity;
    String name;
    float price;
    float total;
    
    public void calculate(int productid,int quantity,String name,float price,float total)
    {
       this.productid=productid;
       this.quantity=quantity;
       this.name=name;
       this.price=price;
       this.total=total;
    }
    void billprint()
    {
        System.out.println(productid+"\t\t"+name+"\t  "+quantity+"\t\t   "+price+"\t\t  "+total);
    }


}
class ProductBill
{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        float net_am=0;
        System.out.println("Enter the order number : ");
        int order_number=sc.nextInt();
        System.out.println("Enter number of product : ");
        int count=sc.nextInt();
        order[] o=new order[count];      
        for (int i=0;i<count;i++)
        {
            System.out.println("_______________________________________");
            System.out.println("          product "+(i+1)+"          ");
            System.out.println("_______________________________________");
            System.out.println("Enter the product id : ");
            int productid=sc.nextInt();
            System.out.println("Enter the name : ");
            String name=sc.next();
            System.out.println("Enter the quantity : ");
            int quantity=sc.nextInt();
            System.out.println("Enter the unit price : ");
            float price=sc.nextInt();
            float total=quantity*price;
            net_am=net_am+total;
            o[i]=new order();
            o[i].calculate(productid,quantity,name,price,total);
        }
        System.out.println("Order No : "+order_number);
        System.out.println("\n Date  : "+java.time.LocalDate.now());
        System.out.print("\nProduct Id\tName\tQuantity\tUnit price\tTotal  \n");
        System.out.println("_____________________________________________________________________________________\n");
        for(int i=0;i<count;i++)
        {
            o[i].billprint();
        }
        System.out.println("_____________________________________________________________________________________\n");
        System.out.println("\t\t\t\t\t"+"Net. Amount  "+net_am);
    }
}