package HabrProblems;

import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) {
        Ball ball = new Ball(5.5);
        Cylinder cylinder = new Cylinder(2,2);
        Pyramid pyramid = new Pyramid(50,50);

        Box box = new Box(1000);

        System.out.println(box.add(ball));
        System.out.println(box.add(cylinder));
        System.out.println(box.add(pyramid));
    }
}
class Shape{
    private double volume;

    public Shape(double volume){
        this.volume = volume;
    }
    public double getVolume(){
        return volume;
    }
}
class Rotation extends Shape{
    private double radius;
    public Rotation(double volume, double radius){
        super(volume);
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
}
class Ball extends Rotation{
    public Ball(double radius){
        super(Math.PI*Math.pow(radius,3)*4/3,radius);
    }
}
class Cylinder extends Rotation{
    private  double height;
    public Cylinder(double radius, double height){
        super(Math.PI*radius*radius*height,radius);
        this.height = height;
    }
}
class Pyramid extends Shape{
    private double height;
    private double s;

    public Pyramid(double height, double s){
        super(height*s*4/3);
        this.height = height;
        this.s = s;
    }
}
class Box extends Shape{
    private ArrayList<Shape> shapes = new ArrayList<>();
    private double available;

    public Box(double available){
        super(available);
        this.available = available;
    }
    public boolean add(Shape shape){
        if(available >= shape.getVolume()){
            shapes.add(shape);
            available = available - shape.getVolume();
            return true;
        } else {
            return false;
        }
    }
}