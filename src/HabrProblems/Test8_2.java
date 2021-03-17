package HabrProblems;

import java.util.ArrayList;

public class Test8_2 {
    public static void main(String[] args) {
        Ball2 ball = new Ball2(5.5);
        Cylinder2 cylinder = new Cylinder2(2,2);
        Pyramid2 pyramid = new Pyramid2(50,50);

        Box2 box = new Box2(1000);

        System.out.println(box.add(ball));
        System.out.println(box.add(cylinder));
        System.out.println(box.add(pyramid));
    }

}
abstract class Shape2{
    public abstract double getVolume();
}
abstract class Rotation2 extends Shape2{
    protected double radius;

    public Rotation2(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
}
class Ball2 extends Rotation2{
    @Override
    public double getVolume(){
        return Math.PI*Math.pow(radius,3)*4/3;
    }
    public Ball2(double radius){
        super(radius);
    }
}
class Cylinder2 extends Rotation2{
    private  double height;
    public Cylinder2(double radius, double height){
        super(radius);
        this.height = height;
    }
    @Override
    public double getVolume(){
        return Math.PI*radius*radius*height;
    }
}
class Pyramid2 extends Shape2{
    private double height;
    private double s;

    public Pyramid2(double height, double s){

        this.height = height;
        this.s = s;
    }
    @Override
    public double getVolume(){
        return height*s*4/3;
    }

}
class Box2 extends Shape2{
    private ArrayList<Shape2> shapes2 = new ArrayList<>();
    private double available;
    private double volume;

    public Box2(double available){
        this.available = available;
        this.volume = available;
    }
    public boolean add(Shape2 shape){
        if(available >= shape.getVolume()){
            shapes2.add(shape);
            available = available - shape.getVolume();
            return true;
        } else {
            return false;
        }
    }
    @Override
    public double getVolume(){
        return volume;
    }
}

