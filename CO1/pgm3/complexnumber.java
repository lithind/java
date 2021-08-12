// class complex
// {
//     int image;
//     int real;
//     void assign(int a,int b)
//     {
//         image=a;
//         real=b;
//     }
//     void add(complex c1,complex c2)
//     {
        
//         System.out.println("addition of two complex number is: "+(c1.real+c2.real)+"+"+(c1.image+c2.image)+" i");
//     }
// }
// public class complexnumber {
//     public static void main(String[] args) {
//         complex c1=new complex();
//         complex c2=new complex();

//         c1.assign(5,7);
//         c2.assign(5,7);

//         c1.add(c1,c2);

      
//     }
//   }
class complex
{
    int image;
    int real;
    complex(int image,int real)
    {
        this.image=image;
        this.real=real;
    }
    void add(complex c1,complex c2)
    {
        
        System.out.println("addition of two complex number is: "+(c1.image+c2.image)+"+"+(c1.real+c2.real)+" i");
    }
}
public class complexnumber {
    public static void main(String[] args) {
        complex c1=new complex(4,5);
        complex c2=new complex(1,4);

        c1.add(c1,c2);

      
    }
  }
  