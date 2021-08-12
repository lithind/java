// class product{
//     int pcode;
//     String pname;
//     double price;
//     void setvalue(int code,String name,double pri){
//     pcode=code;
//     pname=name;
//     price=pri;    
//     }
//     void small(product p1,product p2,product p3)
//     {
//         if ((p1.price<p2.price) && (p1.price<p3.price))
//         {
//             System.out.println("lowest price is : "+p1.price);
//         }
//         else if ((p2.price<p1.price) && (p2.price<p3.price))
//         {
//             System.out.println("lowest price is : "+p2.price);

//         }
//         else
//         {
//             System.out.println("lowest price is : "+p3.price);

//         }
        
//     }
// }
// public class lowprice{
//     public static void main(String[] args) {
//         product p1=new product();
//         product p2=new product();
//         product p3=new product();
//         p1.setvalue(1,"camlinbook",30);
//         p2.setvalue(2,"classmate notebook",10);
//         p3.setvalue(3,"triveni notes",50);
//         p3.small(p1,p2,p3);
        
      
//     }
//   }
class product{
    int pcode;
    String pname;
    double price;
    product(int pcode,String pname,double price){
    this.pcode=pcode;
    this.pname=pname;
    this.price=price;    
    }
    void small(product p1,product p2,product p3)
    {
        if ((p1.price<p2.price) && (p1.price<p3.price))
        {
            System.out.println("lowest price is : "+p1.price);
        }
        else if ((p2.price<p1.price) && (p2.price<p3.price))
        {
            System.out.println("lowest price is : "+p2.price);

        }
        else
        {
            System.out.println("lowest price is : "+p3.price);

        }
        
    }
}
public class lowprice{
    public static void main(String[] args) {
        product p1=new product(1,"camlinbook",30);
        product p2=new product(2,"classmate notebook",10);
        product p3=new product(3,"triveni notes",50);
        p3.small(p1,p2,p3);
        
      
    }
  }