import Graphics.*;
public class Shape {
    public static void main(String []args){
        Graphics testObj = new Graphics();
        System.out.println(testObj.rectangleArea(1,2));
        System.out.println(testObj.circleArea(10));
        System.out.println(testObj.squareArea(10));
        System.out.println(testObj.triangleArea(10,2));
    }
}