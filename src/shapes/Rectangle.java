package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

//    protected double length;
//    protected double width;
//
//    public double getArea(){
//        return length * width;
//    }
//
//    public double getPerimeter(){
//        return 2 * length + 2 * width;
//    }
//    public Rectangle(){
//    }
//    public Rectangle(double length, double width){
//        this.width = width;
//        this.length = length;
//    }



}
