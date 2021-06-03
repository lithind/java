class product{
    int pcode;
    String pname;
    double price;
}
public class lowprice{
    public static void main(String[] args) {
        product p1=new product();
        product p2=new product();
        product p3=new product();
        p1.pcode=1;
        p1.pname="camlinbook";
        p1.price=10;
        p2.pcode=2;
        p2.pname="classmate notebook";
        p2.price=28;
        p3.pcode=3;
        p3.pname="triveni notes";
        p3.price=35;
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