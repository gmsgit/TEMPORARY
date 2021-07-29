import java.lang.*;
import java.util.*;

abstract class Shape
{
    abstract public double perimeter();
    abstract public double area();
}

class Rectangle extends Shape
{
    public double length;
    public double breadth;

    public Rectangle()
    {
        length=1;
        breadth=1;
    }
    public Rectangle(double l, double b)
    {
        length=l;
        breadth=b;
    }
    
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    public double area()
    {
        return length*breadth;
    }
}

class Circle extends Shape
{
    public double radius;

    public Circle()
    {
        radius=1;
    }
    public Circle(double r)
    {
        radius=r;
    }
    public double perimeter()
    {
        return 2*3.14*radius;
    }
    public double area()
    {
        return 3.14*radius*radius;
    }

}

public class AbstractClass {
    public static void main(String[] args) {
        Rectangle RECTANGLE=new Rectangle();
        System.out.println(RECTANGLE.perimeter());
        System.out.println(RECTANGLE.area());
        Circle CIRCLE=new Circle();
        System.out.println(CIRCLE.perimeter());
        System.out.println(CIRCLE.area());
        Shape SHAPE=new Circle();
        System.out.println(SHAPE.perimeter());
        System.out.println(SHAPE.area());
    }
}
