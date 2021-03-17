package HabrProblems;

import java.util.ArrayList;

public class Test8_3 {

}
interface Shape3 extends Comparable<Shape3>{

    double getVolume();

    @Override
    default int compareTo(Shape3 other){
        return Double.compare(getVolume(),other.getVolume());
    }
}
abstract class Rotation3 implements Shape3{
    protected double radius;

    public Rotation3(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
}
class Ball3 extends Rotation3{
    @Override
    public double getVolume(){
        return Math.PI*Math.pow(radius,3)*4/3;
    }
    public Ball3(double radius){
        super(radius);
    }
}
class Cylinder3 extends Rotation3{
    private  double height;
    public Cylinder3(double radius, double height){
        super(radius);
        this.height = height;
    }
    @Override
    public double getVolume(){
        return Math.PI*radius*radius*height;
    }
}
class Pyramid3 implements Shape3{
    private double height;
    private double s;

    public Pyramid3(double height, double s){

        this.height = height;
        this.s = s;
    }
    @Override
    public double getVolume(){
        return height*s*4/3;
    }

}
class Box3 implements Shape3{
    private ArrayList<Shape3> shapes3 = new ArrayList<>();
    private double available;
    private double volume;

    public Box3(double available){
        this.available = available;
        this.volume = available;
    }
    public boolean add(Shape3 shape){
        if(available >= shape.getVolume()){
            shapes3.add(shape);
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
    public ArrayList<Shape3> getShapes3(){
        return shapes3;
    }
}
