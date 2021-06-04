class complex
{
    int image;
    int real;
    void add(int a,int b,int c,int d)
    {
        real=a+c;
        image=b+d;
        System.out.println("addition of two complex number is: "+real+"+"+image+" i");
    }
}
public class complexnumber {
    public static void main(String[] args) {
        complex c1=new complex();
        c1.add(5,7,9,8);

      
    }
  }