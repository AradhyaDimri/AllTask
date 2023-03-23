package Task;

abstract class Shape {
    public abstract double perimeter();
    public abstract double area();
}


 class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    
    public double area() {
        return Math.PI * radius * radius;
    }
}


class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public double perimeter() {
        return 2 * (length + width);
    }
    
    public double area() {
        return length * width;
    }
}


public class abtract {
    public static void main(String[] args) {
        Circle myCircle = new Circle(5.0);
        Rectangle myRectangle = new Rectangle(3.0, 4.0);
        
        System.out.println("Circle perimeter: " + myCircle.perimeter());
        System.out.println("Circle area: " + myCircle.area());
        
        System.out.println("Rectangle perimeter: " + myRectangle.perimeter());
        System.out.println("Rectangle area: " + myRectangle.area());
    }
}