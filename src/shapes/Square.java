package shapes;

public class Square extends Quadrilateral {
    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    public Square(double )

//    private double side;
//    public double getPerimeter(){
//        return 4 * side;
//    }
//
//    public double getArea(){
//        return Math.pow(super.length, 2);
//    }
//    public Square(double side){
//        super(side, side);
//        this.side = side;
//    }



}
